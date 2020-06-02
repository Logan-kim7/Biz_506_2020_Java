package com.biz.classes;

import com.biz.classes.model.BankVO;
import com.biz.classes.service.BankServiceV2;

public class ClassEx_12 {
	public static void main(String[] args) {
	
	BankVO[] bankList = new BankVO[5];
	for(int i = 0 ; i < bankList.length;i++) {
		bankList[i] = new BankVO();
		bankList[i].setStrNum("001");
		bankList[i].setStrDate("2020-06-0" + (i+1));
		
	}
	
	
	//기본형 변수들....
	//primitive variable	
	int num = 0; //integer형 변수 num를 선언하고 0으로 clear
	long num1 = 0L;	//long형 변수 num1을 선언하고 0으로 clear	
	float num2 =0.0f;
	double num3 = 0.0;
	boolean bYes = false;
	char char1 = 'c'; // Character형 변수 num를 선언하고 
	                  // 문자 c를 저장
	//String(문자열)형 변수는
	//변수처럼 사용하지만 실제로는
	//일반변수와 달리
	//String 클래스로 만든 String형 인스턴스라고 해야한다.
	String strName= "홍길동";
	//String strName = new String("홍길동")
	String Nation = new String();
			
	//BankServiceV2 클래스를 사용해서
	//BankService라는 변수를 선언
	//BankService 변수를 "객체(object)", "인스턴스(Instance)"
	//라고한다
    BankServiceV2 bankService = new BankServiceV2();
    //bankService인스턴스를 통해서
    //bankServie() method를 호출하면
    //BankServicV2 클래스내에 정의된 
    //bankList() method 내의 코드들이 순서대로 실행된다.
	bankService.bankList();	
	
	bankService.bankList(bankList);;
 }
}