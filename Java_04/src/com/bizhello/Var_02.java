package com.bizhello;


public class Var_02 {
	public static void main(String[] args) {
		
		int num1 = 8;
		int num2 = 0;
		
		System.out.println(num1 + "x"+ ++num2 + "="+ (num1 * num2));
		System.out.println(num1 + "x"+ ++num2 + "="+ (num1 * num2));
		System.out.println(num1 + "x"+ ++num2 + "="+ (num1 * num2));
		System.out.println(num1 + "x"+ ++num2 + "="+ (num1 * num2));
		System.out.println(num1 + "x"+ ++num2 + "="+ (num1 * num2));
		System.out.println(num1 + "x"+ ++num2 + "="+ (num1 * num2));
		System.out.println(num1 + "x"+ ++num2 + "="+ (num1 * num2));
		System.out.println(num1 + "x"+ ++num2 + "="+ (num1 * num2));
		System.out.println(num1 + "x"+ ++num2 + "="+ (num1 * num2));
		System.out.println(num1 + "x"+ ++num2 + "="+ (num1 * num2));
		
		System.out.println("=====================================");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("======================================");
				
		//num2 �� 9�� �Ǿ� �ִ� �����̹Ƿ� ++num2�� �����ϸ� num2����
		// 10�� �Ǿ� ���Ŀ� ��µǴ� �������� 8 x 10 ���� ����� �Ǿ� ������.
				
		// num2�� ��� ���� �ִ��� ������� 0���� clear�Ǿ�
		// ó�� �����ϴ� �Ͱ� ���� ���°� �ȴ�.
		num2 = 0; // �缳��, clear
				
				
		System.out.printf("%d x %d = %d",num1,++num2,(num1*num2));
		System.out.println();
		System.out.printf("%d x %d = %d",num1,++num2,(num1*num2));
		System.out.println();
		System.out.printf("%d x %d = %d",num1,++num2,(num1*num2));
		System.out.println();
		System.out.printf("%d x %d = %d",num1,++num2,(num1*num2));
		System.out.println();
		System.out.printf("%d x %d = %d",num1,++num2,(num1*num2));
		System.out.println();
		System.out.printf("%d x %d = %d",num1,++num2,(num1*num2));
		System.out.println();
		System.out.printf("%d x %d = %d",num1,++num2,(num1*num2));
		System.out.println();
		System.out.println("======================================");
		num2 = 0;
		System.out.printf("%d x %d = %d\n",num1,++num2,(num1*num2));
		System.out.printf("%d x %d = %d\n",num1,++num2,(num1*num2));
		System.out.printf("%d x %d = %d\n",num1,++num2,(num1*num2));
		System.out.printf("%d x %d = %d\n",num1,++num2,(num1*num2));
		System.out.printf("%d x %d = %d\n",num1,++num2,(num1*num2));
		System.out.printf("%d x %d = %d\n",num1,++num2,(num1*num2));
		System.out.printf("%d x %d = %d\n",num1,++num2,(num1*num2));
		System.out.printf("%d x %d = %d\n",num1,++num2,(num1*num2));
		
	}

}
