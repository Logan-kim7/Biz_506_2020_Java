package com.bizcontrol;

public class if_01 {
	
	public static void main(String[] args) {
		
		boolean bVar = true;
		if(bVar) {
			System.out.println("bVar�� true");
		}
		
		bVar = 32 % 2 == 0;
		if(bVar) {
			System.out.println("32�� ¦��");
		}
			/*
			 *  if() ��ɹ��� ����Ҷ�
			 *  boolean�� ������ ����
			 *  �������� ������ ���
			 *  ������ true flase �Ǵ��Ͽ� � ó���� �ϴ°�� ���ٴ�
			 *  ���� if() ��ɹ��� ������� ���� �־ 
			 *  ó���ϴ� ��찡 �� ����. 
			 */
		
		
		if((32 % 2) == 0) {
			System.out.println("32�� ¦��");
		}
	}


}
