package com.biz.student.domain;

import com.biz.student.service.ScoreService;
import com.biz.student.service.ScoreServiceImplV1;

public class StSC_main {
	
	public static void main(String[] args) {
		ScoreService sService = new ScoreServiceImplV1();
		sService.inputStudent();
		sService.intputScore();
		sService.scoreList();
		
			
	}

}
