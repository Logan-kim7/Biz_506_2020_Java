package com.bizcontrol;

import java.util.Random;

public class If_06 {
	public static void main(String[] args) {
		Random rnd = new Random();
		int intKor = rnd.nextInt(100);
		int intEng = rnd.nextInt(100);
		int intMath = rnd.nextInt(100);
		
		
		int sum = intKor + intEng + intMath;
		int avg = sum /3;
		System.out.println("���� :" + sum);
		System.out.println("��� :" + avg);
		
		//����� 60�� �̻��̸� �հ� �ƴϸ� ���հ�
		if(avg >= 60) {
			System.out.println("�հ�");
		}else {
		System.out.println("���հ�");
		}
	}

}
