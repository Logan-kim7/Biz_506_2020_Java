package com.biz.addr.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.addr.domain.AddrVO;

public class AddrService03 {
	
	private List<AddrVO> addrList;
	private Scanner scan; 
	
	public AddrService03() {
		addrList = new ArrayList<AddrVO>();
		scan = new Scanner(System.in);     //생성자 안에서 초기화
		
	}
	
	/**
	 *  현재 코드는 main에서 지정된 for 반복문의 개수만큼 입력을 수행해야 한다.
	 *  만약 입력하는 도중 입력을 중단하고 싶을때 중단할수 있도록 코드를 개선해보자.
	 *  
	 *  입력하는 도중 이름항목에 이름대신 END문자열을 입력하면
	 *  입력을 중단한다.
	 **/
	public boolean inputAddr() {
		
		System.out.print("이름(중단:END) >> ");
		String strName = scan.nextLine();
		
		System.out.println("입력값:)" + strName);
		//만약 이름 입력할때 문자열 END를 입력하면
		// 더이상 진행하지 말고 false return하고 method를 중단해라
		//if(strName =="END") {
		if(strName.equals("END")) {
			return false;
		}
		
		System.out.print("전화번호 >> ");
		String strTel = scan.nextLine();

		System.out.print("주소 >> ");
		String strAddr= scan.nextLine();

		System.out.print("나이 >> ");
		String strAge= scan.nextLine();
		int intAge = 0;
		try {
			intAge = Integer.valueOf(strAge);
		}catch (Exception e) {
			System.out.println("나이는 숫자만 입력이 가능합니다.");
			System.out.println("나이 입력이 잘못되어 0으로 임시 저장합니다.");
		}
		
		System.out.print("관계 >> ");
		String strNet = scan.nextLine();

		
		AddrVO addrVO = new AddrVO();
		addrVO.setStrName(strName);
		addrVO.setStrTel(strTel);
		addrVO.setStrAddr(strAddr);
		addrVO.setIntAge(intAge);
		addrVO.setStrNet(strNet);
		addrList.add(addrVO);
		
		return true;
		
	}
		public void addrList(){
			
			System.out.println("=============================================");
			System.out.println("     \t\t주소록\t");
			System.out.println("---------------------------------------------");
			System.out.println("이름\t전화번호\t\t주소\t나이\t관계");
			System.out.println("---------------------------------------------");
			
			// i < 5 로 설정을 하게 되면
			// 5명의 주소록을 표시할때는 문제가 없으나 
			// 만약 주소록 데이터의 개수가 변경되면 문제를 일으킨다
			// addrList의 개수를 별도로 변수에 담고
			int addrSize = addrList.size();
			for(int i = 0; i < addrSize ; i++ ) {
				
				AddrVO vo = addrList.get(i);
				System.out.printf(vo.getStrName() + "\t");
				System.out.printf(vo.getStrTel() + "\t");
				System.out.printf(vo.getStrAddr() + "\t");
				System.out.printf(vo.getIntAge() + "\t");
				System.out.printf(vo.getStrNet() + "\t\n");
				
			}	
		
	}
}
