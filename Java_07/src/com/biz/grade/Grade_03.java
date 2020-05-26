package com.biz.grade;

import java.util.Random;

public class Grade_03 {
	
	public static void main(String[] args) {
		
		int intKor = 0;
		int intEng = 0;
		int intMath = 0;
		
		Random random = new Random();
		/*
		 * Random 변수를 사용하기전에 입력만하면
		 * 어느곳에 있더라도 상관이 없다.
		 * 
		 */
		
		intKor = random.nextInt(100) + 1;
		intEng = random.nextInt(100) + 1;
		intMath = random.nextInt(100) + 1;
		
		int intSum = intKor;
		intSum += intEng;
		intSum += intMath;
		
		int intAvg = intSum / 3;
		
		System.out.println("총점 : " + intSum);
		System.out.println("평균 : " + intAvg);
		
	
		
		
	}

}
