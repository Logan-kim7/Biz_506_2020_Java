package com.biz.list.exec;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListEx_04 {
	
	public static void main(String[] args) {
		
		List<Integer> intList = new ArrayList<Integer>();
		Random rnd = new Random();
		
		
		for(int i = 0 ; i < 100; i++) {
			
			intList.add(rnd.nextInt(100)+1);
		}
		
		/*
		 * intList.get(i) method
		 * public int get(int i) {
		 * retun x <<< (intList.add에서 지정한 숫자);
		 * }
		 */
		
		for(int i = 0 ; i < 100 ; i ++) {
			int num  = intList.get(i);
			if( intList.get(i) == 55) {
				/*
				 * intList.get(i) method 를 호출하여
				 * 값을 가져오는데 몇번 반복해서 실행해도
				 * 항상 같은 값이 return 될것이다.
				 * 그럼에도 불구하고 아래 코드는 같은 일을
				 * 두번 실행하여 결과를 얻고 있다.
				 * 짧은 코드이지만 상당히 비효율적인 코드가
				 * 될수 있다.
				 * intList.get(i) 를 변수에(num)에 한번 저장하고 
				 * 나머지 코드에서 저장한 변수(num)을 사용하자
				 */
				System.out.println(num);
			}
		}
	
	}
}
