package com.biz.control;


public class For_07 {
	
	public static void main(String[] args) {
		
		// 1���� 100������ ������ ¦������ ��
		// �ۼ����� ��
		// sum += ¦����
		// 1�� �����ǰ� �ִ� num������ ���� ¦���϶��� sum�� ����
		int num = 0;
		int sum = 0;
		for(num = 0, sum = 0 ; num <= 100 ; num++) {
			if(num % 2 == 0) {
				sum += num;
			}
		}
		System.out.println("���" + sum);

		
		for(num = 0, sum = 0 ; num <= 100 ; num+=2) {
			sum += num;

		}
		System.out.println("���" + sum);

	    // 1���� 100���� ������ 3�� ����� ��
		for(num = 0, sum = 0 ; num <= 100 ; num++) {
			if(num % 3 == 0) {
				sum += num;
			}
		}
		System.out.println("���" + sum);	
				
				
		
		
		
		
	}

}
