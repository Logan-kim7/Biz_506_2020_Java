package com.biz.hello;

public class VarBoolean_02 {
	
	public static void main(String[] args) {
		/*
		 * �ڵ� �ۼ��Ҷ� �鿩���� ��Ȱȭ
		 */
		int num1 = 30;
		int num2 = 7;
		
		int numP = num1 + num2;
		int numM = num1 - num2;
		int numT = num1 * num2;
		int numD = num2 / num1;
		
		System.out.println(numP);
		System.out.println(numM);  
		System.out.println(numT);
		System.out.println(numD);
		
		// 4Ģ������ ������ ��� ���� numP, numM, numT, numD��
		// ����ִ�
		
		//4���� ������ �����Ǿ� �ִ� ���� ¦������ �Ǵ�
		boolean bVarP = (numP % 2) == 0;
		boolean bVarM = (numM % 2) == 0;
		boolean bVarT = (numT % 2) == 0;
		boolean bVarD = (numD % 2) == 0;
		
		System.out.println(bVarP);
		System.out.println(bVarM);
		System.out.println(bVarT);
		System.out.println(bVarD);
		
		if(bVarP == true) {System.out.println("��������� ¦��");
		
		}
		if(bVarM == true) {System.out.println("�E������� ¦��");
		
		}
		
		if(bVarT == true) {System.out.println("��������� ¦��");
		
		}

		if(bVarD == true) {System.out.println("����������� ¦��");
		
		}

				
	}

}
