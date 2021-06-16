package com.mycode.myemoteapp;

import java.io.IOException;
import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ApplicationController {
	@Value("${spring.application.name}")
	private String name;
	@Value("${server.port}")
	private int port;

	@GetMapping(value = { "/sticker-gallery" })
	public ModelAndView GetStickerGallery(Model model) {
		return new ModelAndView("sticker-gallery");
	}

	@GetMapping(value = "/images/{imageID}")
	public ResponseEntity<byte[]> GetImageByID(@PathVariable String imageID) throws IOException {
		ClassPathResource imageFile = new ClassPathResource("static/" + imageID + ".png");
		byte[] imageBytes = StreamUtils.copyToByteArray(imageFile.getInputStream());

		return ResponseEntity.ok().contentType(MediaType.IMAGE_PNG).body(imageBytes);
	}

	@GetMapping(value = "/random")
	public ResponseEntity<byte[]> GetRandomImage() throws IOException {
		ClassPathResource imageFile = new ClassPathResource("static/smi1ey_sticker_" + getRandomNumberMinMax(1,16) + ".png");
		byte[] imageBytes = StreamUtils.copyToByteArray(imageFile.getInputStream());
		
		return ResponseEntity.ok().contentType(MediaType.IMAGE_PNG).body(imageBytes);
	}
	
	public int getRandomNumberMinMax(int min, int max) {
		Random rand = new Random();
		int randomNum = rand.nextInt((max - min) + 1) + min;
		
		return randomNum;
	}
}