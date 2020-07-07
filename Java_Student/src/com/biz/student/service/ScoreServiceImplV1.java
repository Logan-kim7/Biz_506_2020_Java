package com.biz.student.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.transform.OutputKeys;

import com.biz.student.config.SplitPos;
import com.biz.student.domain.ScoreVO;
import com.biz.student.domain.StudentVO;

public class ScoreServiceImplV1 implements ScoreService {
	List<ScoreVO> scoreList;
	List<StudentVO> studentList;

	public ScoreServiceImplV1() {
		scoreList = new ArrayList<ScoreVO>();
		studentList = new ArrayList<StudentVO>();
	}

	@Override
	public void inputStudent() {
		String studentFile = "src/com/biz/student/exec/student.txt";
		FileReader fileReader = null;
		BufferedReader buffer = null;

		try {

			fileReader = new FileReader(studentFile);
			buffer = new BufferedReader(fileReader);

			String reader = "";
			while (true) {

				reader = buffer.readLine();
				if (reader == null) {
					break;
				}
				String[] students = reader.split(":");

				StudentVO sVO = new StudentVO();
				sVO.setNum(students[SplitPos.STUDENT.ST_Num]);
				sVO.setName(students[SplitPos.STUDENT.ST_NAME]);
				sVO.setGrade(Integer.valueOf(students[SplitPos.STUDENT.ST_GRADE]));
				sVO.setDept(students[SplitPos.STUDENT.ST_ADDR]);
				studentList.add(sVO);
			}

			buffer.close();
			fileReader.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void intputScore() {

		String scoreFile = "src/com/biz/student/exec/score.txt";
		FileReader fileReader = null;
		BufferedReader buffer = null;

		try {

			fileReader = new FileReader(scoreFile);

			buffer = new BufferedReader(fileReader);

			String reader = "";
			int count = 0;
			while (true) {
				reader = buffer.readLine();
				if (reader == null || count == 30) {
					break;
				}

				String[] scores = reader.split(":");
				ScoreVO sVO = new ScoreVO();
				sVO.setNum(scores[SplitPos.SCORE.SC_Num]);
				sVO.setKor(Integer.valueOf(scores[SplitPos.SCORE.SC_KOR]));
				sVO.setEng(Integer.valueOf(scores[SplitPos.SCORE.SC_ENG]));
				sVO.setMath(Integer.valueOf(scores[SplitPos.SCORE.SC_MATH]));
				scoreList.add(sVO);
				count++;
			}
			buffer.close();
			fileReader.close();

		} catch (FileNotFoundException e) {

			System.out.println(scoreFile + "파일을 읽기위해 open 하는 중 오류 발생");
			return;
		} catch (NumberFormatException e) {
			System.out.println("점수를 숫자로 바꾸는 과정에서 오류발생");
		} catch (IOException e) {

			System.out.println("버퍼로부터 데이터를 읽는데 문제발생!!");
		}

	}

	@Override
	public void calcSum() {

		for (ScoreVO sVO : scoreList) {
			int sum = sVO.getKor();
			sum += sVO.getEng();
			sum += sVO.getMath();
			sVO.setSum(sum);
		}

	}

	@Override
	public void calcAvg() {

	}

	@Override
	public void scoreList() {

		System.out.println("==========================================================================");
		System.out.println("성적 일람표");
		System.out.println("==========================================================================");
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("---------------------------------------------------------------------------");
		for (StudentVO stVO : studentList) {
			for (ScoreVO scVO : scoreList) {
				if (stVO.getNum().equals(scVO.getNum()))
					System.out.printf(stVO.getNum() + "\t");
				System.out.printf(stVO.getName() + "\t");
				System.out.print(scVO.getKor() + "\t");
				System.out.print(scVO.getEng() + "\t");
				System.out.print(scVO.getMath() + "\t");
				System.out.println(scVO.getSum() + "\n");

			}
		}
	}

}
