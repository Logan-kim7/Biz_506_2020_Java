package com.biz.service;

import com.biz.model.ScoreVO;

public class ScoreServiceV1 {

	public void scoreList(ScoreVO[] score) {

		LineService lineService = new LineService();
		int lineLength = 50;
		String d_line = lineService.do_line(50);
		String s_line = lineService.single_line(50);

		System.out.println(d_line);
		System.out.printf("이름\t 국어\t 영어\t 수학\t 총점\t 평균\n");
		System.out.println(s_line);
		// for() {  } 내에서 선언된 sum, avg 변수는
		// for() {  } 명령문이 종료되면 이후에 참조 할수 없다.
		for (int i = 0; i < score.length; i++) {
			int sum = 0;
			sum = score[i].getKor();
			sum += score[i].getEng();
			sum += score[i].getMath();

			System.out.printf("%s\t %d\t %d\t %d\t %d\t %d\n", score[i].getName(), score[i].getKor(), score[i].getEng(),
					score[i].getMath(), sum, sum / 3);

		}

	}
}
