package com.biz.hello;

public class VarBoolean_02 {
	
	public static void main(String[] args) {
		/*
		 * 코드 작성할때 들여쓰기 생활화
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
		
		// 4칙연산을 수행한 결과 각각 numP, numM, numT, numD에
		// 담겨있다
		
		//4개의 변수에 보관되어 있는 값이 짝수인지 판단
		boolean bVarP = (numP % 2) == 0;
		boolean bVarM = (numM % 2) == 0;
		boolean bVarT = (numT % 2) == 0;
		boolean bVarD = (numD % 2) == 0;
		
		System.out.println(bVarP);
		System.out.println(bVarM);
		System.out.println(bVarT);
		System.out.println(bVarD);
		
		if(bVarP == true) {System.out.println("덧셈결과는 짝수");
		
		}
		if(bVarM == true) {System.out.println("뺼셈결과는 짝수");
		
		}
		
		if(bVarT == true) {System.out.println("곱셈결과는 짝수");
		
		}

		if(bVarD == true) {System.out.println("나눗셈결과는 짝수");
		
		}

				
	}

}
