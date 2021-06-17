package com.mycode.myemoteappdemo;

import java.io.IOException;
import java.util.Map;

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
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ApplicationController {
	@Value("${spring.application.name}")
	private String name;
	@Value("${server.port}")
	private int port;

	@GetMapping(value = { "/" })
	public String GetIndexPage(Map<String, Object> model) {
		model.put("page_title", "Welcome Page");
		model.put("page_message", "Use the navigation at the top of the page to explore the site.");
		return "index";
	}

	@GetMapping(value = { "/sticker-gallery" })
	public String GetStickerGalleryPage(Model model) {
		model.addAttribute("page_title", "Sticker Gallery");
		model.addAttribute("page_message", "Below is a collection of all stickers in the gallery.");
		return "sticker-gallery";
	}

	@GetMapping(value = { "/random-sticker-page" })
	public String GetRandomStickerPage(Map<String, Object> model) {
		AppUtils appUtils = new AppUtils();
		model.put("page_title", "Random");
		model.put("page_message", "Below is a random sticker.");
		model.put("sticker_name", appUtils.getRandomStickerName());
		return "random-sticker-page";
	}

	@GetMapping(value = "/images/{imageID}")
	public ResponseEntity<byte[]> GetImageByID(@PathVariable String imageID) throws IOException {
		ClassPathResource imageFile = new ClassPathResource("static/" + imageID + ".png");
		byte[] imageBytes = StreamUtils.copyToByteArray(imageFile.getInputStream());

		return ResponseEntity.ok().contentType(MediaType.IMAGE_PNG).body(imageBytes);
	}

	@GetMapping(value = "/random-sticker")
	public ResponseEntity<byte[]> GetRandomImage() throws IOException {
		AppUtils appUtils = new AppUtils();
		ClassPathResource imageFile = new ClassPathResource("static/smi1ey_sticker_" + appUtils.getRandomNumberMinMax(1,16) + ".png");
		byte[] imageBytes = StreamUtils.copyToByteArray(imageFile.getInputStream());
		
		return ResponseEntity.ok().contentType(MediaType.IMAGE_PNG).body(imageBytes);
	}
}