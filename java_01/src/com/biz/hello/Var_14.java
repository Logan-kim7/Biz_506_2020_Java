package com.biz.hello;

public class Var_14 {
	
	public static void main(String[] args) {
		/*
		 * �Ǽ�������
		 * �Ҽ������� 7�ڸ�����ǥ��
		 * 
		 */
		float num1 = 10.0f;
		float num2 = 3.0f;
		System.out.println(num1 / num2);

		/*
		 * �Ǽ��� ����
		 * �Ҽ������� 17�ڸ����� ǥ��
		 */
	double num3 = 10.0;
	double num4 = 3.0;
	System.out.println(num3 / num4);
		
	/*
	 * integer(����)�� ����
	 * 2�� 31�� +- ������ ���� ���
	 * (32bit, 4byte)
	 */
	int num5 = 1000_000_000;
	int num6 = 300;
	System.err.println(num5 * num6);
	
	/*
	 * ����������
	 * 64bitũ���� �� ���
	 * 2�� 63�� +- ������ �� ���
	 */
	long num7 = 1000_000_000L;
	long num8 = 3000L;
	System.out.println(num7 * num8);
	}

}
