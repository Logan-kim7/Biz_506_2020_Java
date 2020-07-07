package com.biz.student.domain;
/*
 * 
 *VO 클래스 작성
 *VO 클래스는 프로젝트에서 매우 중요한 역할을 수행한다.
 *프로젝트에서 어떤 데이터를 어떻게 취급할것인가를 먼저 파악하고
 *클래스를 작성한다.
 *프로젝트에서 필요한 데이터항목이 누락되거나
 *불필요한 항목이 추가되지 않도록 잘 설계를 해야 한다.
 *=>객체지향에서
 * 
 */

public class ScoreVO {
	private String num;
	private int Kor;
	private int Eng;
	private int Math;
	
	private int sum;
	private float avg;
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public int getKor() {
		return Kor;
	}
	public void setKor(int kor) {
		Kor = kor;
	}
	public int getEng() {
		return Eng;
	}
	public void setEng(int eng) {
		Eng = eng;
	}
	public int getMath() {
		return Math;
	}
	public void setMath(int math) {
		Math = math;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public float getAvg() {
		return avg;
	}
	public void setAvg(float avg) {
		this.avg = avg;
	}
	
	

}
