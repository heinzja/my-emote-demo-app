/**
 * 
 */
package com.mycode.core;

import java.io.IOException;
import java.util.Hashtable;

import org.springframework.core.io.ClassPathResource;
import org.springframework.util.StreamUtils;

/**
 * @author joseph heinz
 *
 */
public class APP_CORE {
	private static final Hashtable<String, byte[]> STICKER_GALLERY = new Hashtable<String, byte[]>();
	private static final APP_CORE CORE_APPLICATION_INSTANCE;

	/* CONSTRUCTOR */
	static {
		CORE_APPLICATION_INSTANCE = new APP_CORE();
	}

	private APP_CORE() {
		try {
			int min = 1;
			int max = 16;
			//add static stickers to application memory
			for(int i = min; i <= max;i++) {
				String tmpStickerName = "smi1ey_sticker_" + i;
				ClassPathResource imageFile = new ClassPathResource("static/" + tmpStickerName + ".png");
				byte[] imageBytes = StreamUtils.copyToByteArray(imageFile.getInputStream());
				STICKER_GALLERY.put(tmpStickerName, imageBytes);
			}

		} catch (IOException exception) {
			System.out.println("IOException Caught \n" + exception.toString());
		}
	}

	public static APP_CORE getInstance() {
		return CORE_APPLICATION_INSTANCE;
	}

	public static Hashtable<String, byte[]> getStickerGallery() {
		return STICKER_GALLERY;
	}

	public static byte[] getSticker(String stickerName) {
		if (STICKER_GALLERY.containsKey(stickerName)) {
			return STICKER_GALLERY.get(stickerName);
		} else {
			return null;
		}
	}

	public static void setStickerGallery(Hashtable<Object, String> sticker_gallery) {
		if (sticker_gallery != null) {
			STICKER_GALLERY.equals(sticker_gallery);
		}

	}
}
