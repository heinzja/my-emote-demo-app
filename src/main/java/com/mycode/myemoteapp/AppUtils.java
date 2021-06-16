package com.mycode.myemoteapp;

import java.util.Random;

public final class AppUtils {
	
	public int getRandomNumberMinMax(int min, int max) {
		Random rand = new Random();
		int randomNum = rand.nextInt((max - min) + 1) + min;
		
		return randomNum;
	}
}
