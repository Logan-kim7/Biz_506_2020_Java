package com.bizcontrol;

import java.util.Random;

public class If_04 {
	public static void main(String[] args) {
		 
		Random rnd = new Random();
		 int num1 = rnd.nextInt(100) +1;
		 /*
			 * if(����1){
			 * 
			 * } 
			 * if(����2){
			 * 
			 * }
			 * if(����1 != true && ����2 != true){
			 * 
			 * }
			 * �������� �����߿��� ������ true�� ��� ��츦 �˻��ϱ� ���� �ڵ�
			 * �� ���������߿� 1������ ������ true �̴���
			 * ������ ������ ��� �˻��ؾ��Ѵ�.
			 * �ʿ��� ��� ����ϱ⵵ �ϸ�, ���������� 1������ �˻��ϰ��� �Ѵٸ�
			 * ��ȿ������ �ڵ尡 �ɼ��� �ִ�.
			 */ 
		 if(num1 % 5 ==0) {
			 System.out.printf("%d �� 5�� ��� \n",num1);
		 }
		 
		 if(num1 % 4 ==0) {
			 System.out.printf("%d �� 4�� ��� \n",num1);
		 }
		 
		 if(num1 % 3 ==0) {
			 System.out.printf("%d �� 3�� ��� \n",num1);
		 }
		 
		 if(num1 % 2 ==0) {
			 System.out.printf("%d �� 2�� ��� \n",num1);
		 }
		 
		 if(num1 % 5 != 0 && num1 % 4 != 0 && num1 % 3 != 0 && num1 % 2 != 0) {
			 System.out.printf("%d �� 5,4,3,2 �� ����� �ƴϴ�");
		 }

	}

}
