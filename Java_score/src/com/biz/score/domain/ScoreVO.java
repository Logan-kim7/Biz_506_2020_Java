package com.biz.score.domain;

public class ScoreVO {
	/*
	 * 성적처리 과정에서 1학생의 성적을 담는
	 * Object 변수
	 * Value Object 클래스 라고한다.
	 * VO, DTO 클래스들을 domain 클래스 라고 한다.
	 * 
	 * 
	 * 필드변수를 private로 설정하고
	 * 필드 변수에 접근(값을 저장, 읽기) getter, setter를 선언
	 * 
	 * 이러한 방식을 클래스를 정의 하는 것을 정보은닉, 캡슐화
	 */
	private String num;
	private int kor;
	private int eng;
	private int math;
	private int sum;
	private float avg;
	
	
	
	
	public void setNum(String num) {
		this.num = num;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public void setAvg(float avg) {
		this.avg = avg;
	}

	public ScoreVO() {
		// TODO Auto-generated constructor stub
	}
	public String getNum() {
		return num;
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
	public int getSum() {
		return sum;
	}
	public float getAvg() {
		return avg;
	}
	
	
	

}
