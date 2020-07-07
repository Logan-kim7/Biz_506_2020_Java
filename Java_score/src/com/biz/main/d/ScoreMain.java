package com.biz.main.d;

import com.biz.score.service.ScoreService01;

public class ScoreMain {
	public static void main(String[] args) {
		
	ScoreService01 scoreService = new ScoreService01();
	
	while(true) {
		if(!scoreService.inputScore())break;
	}
	scoreService.scoreList();
 }
}