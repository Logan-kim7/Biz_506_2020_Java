package com.biz.student.exec;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class ScoreEx_03 {
	
	/*
	 *  학번, 국어, 영어, 수학, 총점, 평균 데이터를 생성하여
	 *	
	 * 
	 * 
	 */
	
	
	//.csv 파일은
	// 컴마로 데이터들을 구분하는 문자열로 만들고
	// 그 내용을 text  형식으로 저장된다.
	public static void main(String[] args) {
		
		PrintWriter outPut = null; // System.out;
		String outFile = "src/com/biz/student/exec/score.txt";
		
		// 지금부터 outFile 변수에 저장된 파일 이름으로
		// text를 기록하기 위해 파일을 만들어라
		try {
			outPut = new PrintWriter(outFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Random rnd = new Random();
		String score;
		for(int i =0; i < 30 ; i++) {
			int intKor = rnd.nextInt(50) + 51;
			int intEng = rnd.nextInt(50) + 51;
			int intMath = rnd.nextInt(50) + 51;
			
			int intSum = (intKor+intEng+intMath);
			float floatAvg = (float)intSum/3;
			
			// System.out.printf()
			//   전체자리수를5자리 비어있는 부분은 0으로 채워라  / 5자리 숫자를 표시하고소숫점이하2자리 만표시하겠다	
			score = String.format("%05d:%d:%d:%d:%d:%06.2f\n", 
					(i + 1),intKor, intEng, intMath, intSum, floatAvg);
			
			outPut.print(score);
			
			
		}
		outPut.close();
		System.out.println("완료");
	}

}
