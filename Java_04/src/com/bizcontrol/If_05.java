package com.bizcontrol;

import java.util.Random;

public class If_05 {
	public static void main(String[] args) {
		Random rnd = new Random();
		int num1 = rnd.nextInt(100) + 1;
		/*
		 * if(����1){
		 * 
		 * } else if(����2)
		 * 
		 * }else{
		 * }
		 * 
		 * �������� �����߿��� 1���� ����(ù��°�� ��ġ�ϴ�����)�� 
		 * �ش��ϴ� ����� ã���� �Ҷ�
		 * ����ϴ� ��ɹ� �����̸� 
		 * ���� ����1�� true�� ��� ������ ������ 
		 *      �ٽ� ������ �������� �ʴ´�.
		 * 
		 */
		

		if(num1 % 5 == 0) {
			System.out.printf("%d �� 5�� ��� \n",num1);	
		}else if(num1 % 4 == 0) {
			System.out.printf("%d �� 4�ǹ�� \n",num1);
		}else if(num1 % 3 == 0) {
			System.out.printf("%d �� 3�ǹ�� \n",num1);
		}else if(num1 % 2 == 0) {
			System.out.printf("%d �� 2�ǹ�� \n",num1);
		}else {
			System.out.printf("%d �� 5, 4, 3, 2 �� ����� �ƴϴ�");
		}

	}

}
