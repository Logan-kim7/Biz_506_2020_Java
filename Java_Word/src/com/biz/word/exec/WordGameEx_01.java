package com.biz.word.exec;

import com.biz.word.service.WordGameService;
import com.biz.word.service.WordServiceImplV1;

public class WordGameEx_01 {
	public static void main(String[] args) {
		WordGameService wgService = new WordServiceImplV1();
		wgService.loadWord();
		wgService.plyGame();
		wgService.gameOver();
		
	}
	
			
			

}
