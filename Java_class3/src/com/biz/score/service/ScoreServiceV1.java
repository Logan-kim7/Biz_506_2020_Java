package com.biz.score.service;

import com.biz.score.vo.ScoreVO;

public class ScoreServiceV1 {
	/*
	 * scores 인스턴스 배열을 필드변수로 선언한 이유
	 * Ex클래스에서 Service클래스에서
	 * 총점계산, 평균계산, 리스트출력을 요청할텐데
	 * 요청을 할때마다 scores 인스턴스 배열을 매개변수로
	 * 전달할수 있지만
	 * 한번만 변수로 전달해 Serivce클래스가 scores 인스턴스를
	 * 보관하도록하고
	 * 나머지 요청하는 매서드에서는 변수를 
	 * 받는 부분을 제거하기 위함이다
	 * 
	 * Ex클래스에서 요청들을 할때마다 scores 배열을 매개변수로 
	 * 전달을 하면 
	 * 요청과 요청사이에서 다른 코드에게 scores 배열값이
	 * 변형되어 결과가 엉뚱하게 나타나는 것을
	 * 방지하는 목적도 있다.
	 */

	private ScoreVO[] scores; 
	
	public void setscores(ScoreVO[] scores) {

		this.scores = scores;
		
	}
	/*
	 * 필드변수로 scores 선언되어 있기 떄문에
	 * 학생 총점과 평균을 계산한 후
	 * 어디에 저장해야 할지를 고민하지 않아도 된다.
	 */

	public void scoreSum() {
		for(int i = 0 ; i < scores.length; i++) {
			scores[i].setIntSum(scores[i].getIntKor()+
					               scores[i].getIntEng()+
					               scores[i].getIntMaht()+
					               scores[i].getIntMusic());
			}
	}
	public void scoreAvg(){
	    for(int i = 0 ; i < scores.length; i++) {
	    	scores[i].setIntAvg(scores[i].getIntSum()/4);
	    }
	  }
	
	public void scoreList() {
		LineService lineService = new LineService();
		String d_line = lineService.do_line(50);
		String s_line = lineService.single_line(50);

		int allSum = 0;
		for(int i = 0 ; i < scores.length;i++) {
			allSum += scores[i].getIntSum();
		
		}
		
		
		System.out.println(d_line);
		System.out.println("성 적 리 스 트");
		System.out.println(d_line);
		System.out.println("학번\t국어\t영어\t수학\t음악\t합계\t평균");
		System.out.println(s_line);
		
		//점수리스트를 표시할때는 for반복문을 이용해서 사용
		//this. : 현재 이 클래스에 선언된 이라는뜻
		for(int i = 0 ; i < scores.length; i++) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\t%d\n",
					scores[i].getStrStnum(), //String
					scores[i].getIntKor(),   //int
					scores[i].getIntEng(),   //int
					scores[i].getIntMaht(),  //int
					scores[i].getIntMusic(),  //int
					scores[i].getIntSum(),   //int
					scores[i].getIntAvg());  //int
		}
		System.out.println(d_line);
		System.out.printf("총합계\t%d\n",allSum); //총점의 총점
		System.out.println(s_line);
		System.out.printf("총평균\t%d\n", allSum/4); //평균의 총점
		System.out.println(d_line);
	}
   
		
 }


