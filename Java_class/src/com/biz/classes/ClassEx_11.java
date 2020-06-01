package com.biz.classes;

import com.biz.classes.model.BankVO;

public class ClassEx_11 {
	
	public static void main(String[] args) {
		
		
		BankVO[] bankList = new BankVO[5];
		
		bankList[0] = new BankVO();
		bankList[1] = new BankVO();
		bankList[2] = new BankVO();
		bankList[3] = new BankVO();
		bankList[4] = new BankVO();
		
		
		bankList[0].setStrNum("001");
		bankList[1].setStrNum("002");
		bankList[2].setStrNum("003");
		bankList[3].setStrNum("004");
		bankList[4].setStrNum("005");
		/*
		 * 
		 * 응용해서 for 반복문으로 간단히 적용할수도있다 
		 * 왜냐면 날짜는 동일한 조건이므로 
		 * 
		 * for(int i = 0 ; bankList.lenght ; i++){
		 *         bankList[i].setStrNum("2020-06-01");
		 */
		bankList[0].setStrDate("2020-06-01");
		bankList[1].setStrDate("2020-06-01");
		bankList[2].setStrDate("2020-06-01");
		bankList[3].setStrDate("2020-06-01");
		bankList[4].setStrDate("2020-06-01");
		
		bankList[0].setIntInput(5000);
		bankList[2].setIntInput(5000);
		
		bankList[1].setIntOutput(1000);
		bankList[3].setIntOutput(1000);
		bankList[4].setIntOutput(1000);
		
		
		
		
		
	} 

}
