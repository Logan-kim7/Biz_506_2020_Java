package com.biz.list.service;

import java.util.List;

import com.biz.list.model.ScoreVO;
import com.biz.score.service.LineService;

public class ScoreServiceV2 {

	private List<ScoreVO> scoreList;
	
	

	public void stSum(List<ScoreVO> scoreList) {
		this.scoreList = scoreList;

		int scoreSize = scoreList.size();
		for (int i = 0; i < scoreSize; i++) {
			ScoreVO scoreVO = scoreList.get(i);

			int sum = (scoreVO.getKor() + scoreVO.getEng() + scoreVO.getMath());
			scoreVO.setStsum(sum);
		}
	}

	public void stAvg() {
		int scoreSize = scoreList.size();
		for (int i = 0; i < scoreSize; i++) {
			ScoreVO scoreVO = scoreList.get(i);
			scoreVO.setStAvg(scoreVO.getStsum() / 3);
		}

	}

	public void scoreList() {
		LineService lineService = new LineService();
		String d_line = lineService.do_line(50);
		String s_line = lineService.single_line(50);
		System.out.println(d_line);
		System.out.println(s_line);
		System.out.println("\t\t\t성적리스트");
		System.out.println(s_line);
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균\n");
		System.out.println(s_line);
		int scoreSize = scoreList.size();
		for (int i = 0; i < scoreSize; i++) {
			String strNum = scoreList.get(i).getNum();
			int intKor = scoreList.get(i).getKor();
			int intEng = scoreList.get(i).getEng();
			int intMath = scoreList.get(i).getMath();
			int intSum = scoreList.get(i).getStsum();
			int intAvg = scoreList.get(i).getStAvg();
			
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\n",strNum,
					intKor,
					intEng,
					intMath,
					intSum,
					intAvg);
		}
		

	}

}
