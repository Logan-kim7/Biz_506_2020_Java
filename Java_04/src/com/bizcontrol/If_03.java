package com.bizcontrol;

import java.util.Random;

public class If_03 {
	public static void main(String[] args) {
		
		Random rnd = new Random();
		int num1 = rnd.nextInt(100) + 1;
		
		if(num1 % 2 == 0) {
			System.out.printf("%d ��(��) ¦���Դϴ�.", num1);
		}
		
		if(num1 % 2 != 0) {
			System.out.printf("%d ��(��) ¦���� �ƴմϴ�.", num1);
		}
		
		if(num1 % 3 == 0) {
			System.out.printf("%d �� 3�� ����Դϴ�\n",num1);
		}
		if(num1 % 3 != 0) {
			System.out.printf("%d�� 3�� ����� �ƴմϴ�\n",num1);
		}
		
		if(num1 % 3 == 0) {
			System.out.printf("%d �� 3�� ����Դϴ�\n",num1);
		} else { 
			System.out.printf("%d �� 3�� ����� �ƴմϴ�\n",num1);
			
			if(num1 % 2 == 0) {
				System.out.printf("%d �� ¦���Դϴ�\n",num1);
			}else {
				//System.out.printf("%d �� Ȧ���Դϴ�\n,num1");
				System.out.printf("%d �� ¦���� �ƴմϴ�\n,num1");
				
			}
			
			if(num1 %2 == 1) {
				System.out.printf("%d �� Ȧ���Դϴ�\n",num1);
			}else {
				System.out.printf("%d �� Ȧ�����ƴմϴ�\n",num1);
			}
			
			/*
			 * ���� �ڵ��� �ϴ� �������� ���� �߻��ϴ� ������
			 * �̷л����� � ���� 4�� ����� 2�� ������ �Ͽ��� ������ ����
			 * ������ �� �ڵ�� �ڵ� ��Ģ�� bug�� ������ ���ɼ��� �ִ� �ڵ���
			 * �Ѵ�.
			 * if(���ǹ�) ������ �ڵ带 �ۼ��Ҷ���
			 * ���ǹ��� ���� ������� ������ Ȯ���ϰ� 
			 * ���ǹ��� ������ ��Ȯ�� ã�Ƴ��� �ֵ��� �ڵ��Ͽ��� �Ѵ�.
			 */
			if(num1 % 4 == 0) {
				System.out.printf("%d �� 2�� ����Դϴ�.\n",num1);
			}
		}

	}

}
