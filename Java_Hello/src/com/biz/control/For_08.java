package com.biz.control;

public class For_08 {
	
	public static void main(String[] args) {
		
		int num = 0;
		for(num = 0 ; num < 5; num++) {
			System.out.println("* * * * *");		
		}
		// for()�� ���۵ɶ� i ������ �����ϰ� 0���� clear�� ����
		// ��� �ݺ� ����
		for(int i = 0, sum = 0; i <= 10 ; i++) {
			sum+= i;
		}
		/*
		 * for()��ɹ��� �ʱ�ȭ��ɿ��� ������ �����ϸ� 
		 * �� ������ for(){ } scope�� ����� ���� �Ҹ�ȴ�.
		 * ���� for(){ } ��ɹ� �ۿ����� ������ ���� (�б�, ����)��
		 * �Ҽ� ����.
		 */
		// System.out.println("���"+ sum);
		
		
		/*
		 * 1���� 10���� ������ �����ϴ� �ڵ带 �ۼ��ϸ鼭
		 * ���� ����� ��Ƽ� for() ��ɹ��� ����� �Ŀ�
		 * ����� Console�� ���̱� ���ؼ��� sum������ for��ɹ�
		 * ������ ����� �ʱ�ȭ(Clear)�� ���־�� �Ѵ�.
		 * 
		 * for(int i = 0;;) for()��ɹ����� �ʱ�ȭ�������� 
		 * ����Ⱥ����� for() ��ɹ��� ����Ǹ� �Ҹ�Ǿ� ������.
		 * ���� for() { } ��ɹ� ������ �ӽ÷� ����� ������
		 * �����ϴ� �������� ����Ѵ�.
		 */
		int sum = 0;
		for(int i = 0; i <= 10 ; i++) {
			sum+= i;
		}
		System.out.println("���" + sum);


	}

}
