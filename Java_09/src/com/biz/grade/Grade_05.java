package com.biz.grade;

import java.util.Random;

import com.biz.Score.Student;

public class Grade_05 {
	
	public static void main(String[] args) {

		/*
		 * for 문안에서 선언된  정수형변수 i 는 
		 * for문이 종료되면 사라지나
		 * for 문 밖에서 변수를 예약한 정수형 변수 sum 은  
		 * 값이 사라지지 않고 그대로 유지가 된다. 
		 * for문 밖에서 값을 입력하지않고
		 * 변수를 예약만 하였기 때문에 for문 안에서 값을 입력해도 
		 * 입력되어진 값(100) 은 다른 연산이 없고 값만 입력되어졌기때문에 
		 * 삭제가 되지않고 출력이 되어진다.
		 */
		int sum = 0; // 선언문
		for(int i = 0 ; i < 100000000 ; i++) {
			sum = 100; //할당문
		}
		// sum은 얼마??
		for(int i = 0 ; i <10; i++) {
			System.out.println(sum);
		}
	
		System.out.println(sum);
		
		
		Student student = new Student();
		
		// Student 클래스에 선언된 make() 메서드 호출하기
		student.make();
		String strN = student.getName();
		/*
		 * public class Student {
	     *     String strName = "홍길동";
	     *     public void make() {
		 *         strName = "이몽룡";
	     *        }
	     *       ?? strName => 이몽룡
	     *       
	     *      
	     *     public String getName() {
	     *          return strName; (return 원래 할당한 값으로 되돌아가라는 명령문)
	     *        }  
	     *}          
	     *?? strName = ?
		 */
		System.out.println(strN);
		
		
	 Random rnd = new Random();
	 
		
		
	}

}
