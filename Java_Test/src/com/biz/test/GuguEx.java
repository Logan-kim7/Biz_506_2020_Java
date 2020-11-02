package com.biz.test;

public class GuguEx {
	
	
	public static void main(String[] args) {
//		String dLine = String.format("%020", 0).replace("0", "=");
		int sum = 0;
		for(int i = 0 ; i <= 9; i++) {
			int num = 7;
			sum = (num * i);
			
//			System.out.println(dLine);		
			System.out.printf("%d x %d = %d\n",num,(i+1),sum * (i+1));
//			System.out.println(dLine);		

		}
		
	}

}
