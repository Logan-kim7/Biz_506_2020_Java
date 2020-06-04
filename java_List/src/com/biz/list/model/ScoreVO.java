package com.biz.list.model;

public class ScoreVO {
	
	private String num;
	private int Kor;
	private int Eng;
	private int Math;
	
	public int getStsum() {
		return stsum;
	}
	public void setStsum(int stsum) {
		this.stsum = stsum;
	}
	public int getStAvg() {
		return stAvg;
	}
	public void setStAvg(int stAvg) {
		this.stAvg = stAvg;
	}
	private int stsum;
	private int  stAvg;
	
	
	
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
	

}
