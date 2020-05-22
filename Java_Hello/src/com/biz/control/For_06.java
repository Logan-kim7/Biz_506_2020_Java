package com.biz.control;

public class For_06 {
	
	public static void main(String[] args) {
		
		int num = 0;
		int sum = 0;
		
		for(num = 1, sum = 0; num<=10 ; num++) {
			sum += num;
		}
		System.out.println("ÇÕÀÇ °á°ú:" + sum);
		
		//1ºÎÅÍ 10±îÁö °ö¼À °á°ú
		
		for(num = 1, sum = 1 ; num <=10 ;num++) {
			sum *= num;
		}
		System.out.println("°öÀÇ °á°ú" + sum);
		
	}

}
