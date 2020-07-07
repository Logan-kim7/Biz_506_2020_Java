package com.biz.student.service;


/*
 * inputStudent() : student.txt 파일을 읽어서 studentList를 작성
 * inputscore() : score.txt 파일을 읽어서 scoreList 를 작성
 * 
 * calcSum(), calcAvg() : 총점과 평균 계산
 * 
 * scoreList() : 학생별 과목, 총점, 평균 리스트 출력
 */
public interface ScoreService {
	
	public void inputStudent();
	public void intputScore();
	
	public void calcSum();
	public void calcAvg();
	
	/*
	 * student.txt score.txt  공통으로 학번 들어있음 두가지 데이터를 합쳐서 1개의 리스트로만 들것 
	 * 숙제 .... 
	 * ==================================================
	 * 성적일람표
	 *===================================================
	 * 학번  이름   국어  영어  수학  총점  평균 
	 * --------------------------------------------------
	 */
	public void scoreList();

}
