package com.biz.hello;

public class VarString_05 {
   public static void main(String[] args) {
	   int num1 = 0;
	   float num2 = 0;
	
	   num1 = (int)num2 ; // ��������ȯ, ����� ����ȯ
	   num2 = num1; // �ڵ�����ȯ, ������ ����ȯ

	   // ���ڿ����� ������ ������ �����ϴ� ����
	   // �ſ� Ư���� ��츦 �����ϰ�� �Ұ����ϴ�.
       //num1 = "���ѹα�";
	   
	   
	   
	   
	   /*
	    * '����' �� ������������ ���
	    * '����'�� IT��⿡�� ����(������)�� �ְ�޴µ� �ʿ���
	    * �ڵ尪�� ����ϴ� type�̴�
	    * '����'�� ������ ������ ������ '����' ������ �ڵ尪��
	    * 10������ ��ȯ�Ǿ� ������ ������ ���Եȴ�.
	    */
	   num1 = 'A';
			   System.out.println(num1);
	   num1 = 'B';
			   System.out.println(num1);
			   
	   
			   
	   num1 ='a';
	   System.out.println(num1);
	   num1 ='b';
	   System.out.println(num1);
	   
	   // ����'A'�� ���ڿ��� ��ȯ�ϰ�
	   // ���ڿ�"A"�� �����Ͽ� str1�� �����϶�
	   // ���� 'A'�� ���ڿ������� �ٷ� �������� ���ϴ� ����
	   // character Ư���� ���������� 10������������ ����Ǳ� �����̴�.
	   String str1 = 'A' + "A";
	   System.out.println(str1);
	   
	   str1 = ('A' + 0) + "A";
			   System.out.println(str1);
   }
}
