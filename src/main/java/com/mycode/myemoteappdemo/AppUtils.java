package com.mycode.myemoteappdemo;

import java.util.Random;

public final class AppUtils {
	
	public String getRandomStickerName() {
		String tmpStr = "smi1ey_sticker_";
		tmpStr = tmpStr.concat(String.valueOf(getRandomNumberMinMax(1, 16)));
		return tmpStr;
	}
	
	public int getRandomNumberMinMax(int min, int max) {
		Random rand = new Random();
		int randomNum = rand.nextInt((max - min) + 1) + min;
		
		return randomNum;
	}
}
