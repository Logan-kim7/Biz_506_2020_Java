package com.biz.hello;

import java.util.Random;

public class Var_02 {
	public static void main(String[] args) {
		
		Random rnd = new Random();
		int num1 = rnd.nextInt(7);
		int num2 = rnd.nextInt(3);
					
		if((num1+num2) %2 ==0) {
			System.out.println(num1 + "+"
					+num2
					+"="
					+(num1 + num2)
					+"´Â Â¦¼ö");
		}

		
		

		
		
				
		
		
	
	}

}
