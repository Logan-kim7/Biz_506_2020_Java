package com.biz.word.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.biz.word.domain.WordVO;

public class WordServiceImplV1 implements WordGameService {
	protected List<WordVO> wordList;
	protected Scanner scn;
	protected Random rnd;
	protected int game;
	protected int count;

	public WordServiceImplV1() {
		wordList = new ArrayList<WordVO>();
		game = 0;
		count = 0;
		scn = new Scanner(System.in);
		rnd = new Random();

	}

	@Override
	public void loadWord() {
		String wordFile = "src/com/biz/word/exec/Word.txt";
		FileReader fileReader = null;
		BufferedReader buffer = null;

		try {
			fileReader = new FileReader(wordFile);
			buffer = new BufferedReader(fileReader);

			String reader = "";
			while (true) {

				reader = buffer.readLine();
				if (reader == null) {
					break;
				}
				String[] words = reader.split(":");

				WordVO wVO = new WordVO();
				wVO.setEng(words[0]);
				wVO.setKor(words[1]);
				wordList.add(wVO);
			}
			buffer.close();
			fileReader.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("단어장 파일 열기 오류");
			return;
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("단어장 읽기 오류");
			return;
		}

	}

	@Override
	public void plyGame() {
		count = 0;
		game =0;
		rnd = new Random();
		int size = wordList.size();
		scn = new Scanner(System.in);

		while (true) {
			int index = rnd.nextInt(size); // 0~ (wordList 개수 -1)중의 한 수
			System.out.println(">>" + wordList.get(index).getKor() + "<<");
			System.out.println("영어단어의 뜻은??(END:종료)");
			String strEng = scn.nextLine();

			if (strEng.equals("END")) {
				break;
			}
			game++;
			if (strEng.equalsIgnoreCase(wordList.get(index).getEng())) {
				System.out.println("맞았습니다 축합니다!!!");
				count++;
			} else {
				System.out.println("아쉽네요!! 한번더 기회를드릴께요");
				strEng = scn.nextLine();
				if (strEng.equals("END")) {
					break;
				} else {
					game++;
					if (strEng.equalsIgnoreCase(wordList.get(index).getEng())) {
						System.out.println("맞았습니다 축합니다!!!");
						count++;
						System.out.println(wordList.get(index).getEng());

					}
				}
			}
		}
		// TODO Auto-generated method stub

	}

	@Override
	public void gameOver() {
		rnd = new Random();
		int size = wordList.size();
		scn = new Scanner(System.in);
		int game = 0;
		int count = 0;
		while (true) {
			int index = rnd.nextInt(size); // 0~ (wordList 개수 -1)중의 한 수
			System.out.println("다음에 해당하는 영어단어는?(END:종료)");
			System.out.println(wordList.get(index).getKor() + ">>");
			String strEng = scn.nextLine();

			if (strEng.equals("END")) {
				break;
			}
			game++;
			if (strEng.equalsIgnoreCase(wordList.get(index).getEng())) {
				System.out.println("맞았습니다 축합니다!!!");
				count++;
			} else {
				System.out.println("아쉽네요!!");
				System.out.println(wordList.get(index).getEng());

			}
		}
		System.out.println("GAME OVER");
		System.out.printf("%d 게임중 %d 번 정답 맞춤!!", game, count);
		// TODO Auto-generated method stub

	}

}
