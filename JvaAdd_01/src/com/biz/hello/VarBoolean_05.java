package com.biz.hello;

public class VarBoolean_05 {
	
	public static void main(String[] args) {
		
		int num1 = 34;
		boolean bVar1 = (num1 % 2) == 0;
		
		
		if(bVar1 == true) {
			System.out.println(num1 + "´Â Â¦¼öÀÔ´Ï´Ù");
		}
			if(bVar1 == false) {
				System.out.println(num1 + "´Â Â¦¼ö°¡ ¾Æ´Õ´Ï´Ù");
				
			}
				if(bVar1) {
					System.out.println("bVar1Àº true ÀÔ´Ï´Ù");
					
				}
				if(!bVar1) {
					System.out.println("bVar1dms true°¡ ¾Æ´Õ´Ï´Ù");
				}
				
				if(num1 % 2 == 0) {
					System.out.println(num1 + "´Â Â¦¼ö");
				}
				
				if(num1 % 2 != 0) {
					System.out.println(num1 + "´Â Â¦¼ö¾Æ´Ô");
				}
				if(num1 % 3 == 0) {
					System.out.println(num1 + "3ÀÇ ¹è¼ö");
				}
				if(num1 % 3 != 0) {
					System.out.println(num1 + "3ÀÇ ¹è¼ö°¡¾Æ´Ô");
				}
				
				
			
				

		
		
	

}}

