package com.biz.hello;

public class VarString_03 {
	public static void main(String[] args) {
		int num1 = 30;
		String str1 = "����" ;
		
		// ���ڿ��������� ��� str1 ���ڿ� ���ͷ���
		// ���������� num1�� ��� ���ڰ� 30��
		// plus�����Ͽ�
		// ���ڿ��� ����sum�� �����ϰ�
		// sum�� ����� ���ڿ��� ���ͷ��� Console�� ������
		String sum = str1 + num1;
		sum = num1 +str1;
		System.out.println(sum);
		/*
		 * ���ڿ���(����, ���ͷ�) + ���ڿ� �̿��� �� �� ������ �����ϸ� 
		 * ���ڿ� �̿��� ���� ��� ���ڿ��� ��ȯ�ϰ� 
		 * ���ڿ��� ���� ������ �����Ѵ�. 
		 */
		
	    float num2 = 30.2f;
	   
	    // ���ڿ��� + �Ǽ� =>���ڿ��� + ���ڿ�����ȯ
        // �� ���ͷ��� �����Ͽ� ���ڿ��� ���� sum�� �Ҵ�
	    sum = num2 + str1;
	    System.out.println(sum);
	    
	    System.out.println(3 + "+"); // "3" + "+"
		System.out.println(3 + "+" + 5 + "=" + 3+5);
		System.out.println(3 + "+" + 5 + "=" + (3+5));
	}

}
