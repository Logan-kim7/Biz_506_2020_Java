package com.biz.hello;

public class VarBoolean_05 {
	
	public static void main(String[] args) {
		
		int num1 = 34;
		boolean bVar1 = (num1 % 2) == 0;
		
		
		if(bVar1 == true) {
			System.out.println(num1 + "�� ¦���Դϴ�");
		}
			if(bVar1 == false) {
				System.out.println(num1 + "�� ¦���� �ƴմϴ�");
				
			}
				if(bVar1) {
					System.out.println("bVar1�� true �Դϴ�");
					
				}
				if(!bVar1) {
					System.out.println("bVar1dms true�� �ƴմϴ�");
				}
				
				if(num1 % 2 == 0) {
					System.out.println(num1 + "�� ¦��");
				}
				
				if(num1 % 2 != 0) {
					System.out.println(num1 + "�� ¦���ƴ�");
				}
				if(num1 % 3 == 0) {
					System.out.println(num1 + "3�� ���");
				}
				if(num1 % 3 != 0) {
					System.out.println(num1 + "3�� ������ƴ�");
				}
				
				
			
				

		
		
	

}}

