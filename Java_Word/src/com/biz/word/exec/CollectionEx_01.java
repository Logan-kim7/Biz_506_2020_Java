package com.biz.word.exec;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionEx_01 {
	
	public static void main(String[] args) {
		
		String nation = "KOREA";
		String[] nations = nation.split(""); //알파벳 단위로 분해
		
		//Arrays.asList(배열) : 배열을 List 형 데이터로 변환
		List<String> words = Arrays.asList(nations);
		
		// Collections 클래스의 기능을 몇가지 사용하기 위해서 
		//배열을 List형 데이터로 변환했다.
		
		
		//String, Integer, Long, Float, Charactor, Boolean 과 같은
		//Wrapper class를 포함하는 List 데이터를 
		// 오름차순 정령하는 매우 간단한 메소드 이다.
		// Collections의 sort() method는 내부 알고리즘이 Quick Sort이므로
		// 사용하는데 아무런 제약이 없이 사용해도 된다.
		// 리스트에 들어있는 값을 오름차순해서 정렬해서 보여준다.
		// 원래는 for문을 이용해서 List를 출력헀었어야했지만
		// 내용이 무엇인지 보고 싶을때는 Collections 를 이용하면
		// 간편하게 확인이 가능하다 
		Collections.sort(words);
		System.out.println(words);
		
		
		//List에 포함된 item들을 뒤죽박죽하게 섞는 기능을 수행한다.
		Collections.shuffle(words);
		System.out.println(words);
	}
}
