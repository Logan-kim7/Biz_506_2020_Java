package com.biz.addr.service;

import java.util.ArrayList;
import java.util.List;

import com.biz.addr.domain.AddrVO;

public class AddrService01 {
	/*
	 *  현재 AddrService01 클래스를 선언하면서
	 *  addrList 라는 필드변수를 선언 "만" 해 둔 상태
	 *  선언만 된 필드변수 중에 객체형태의 변수는 
	 *  그 변수에 값을 저장, 추가하려고하면 NullpointException이 발생하면서
	 *  코드가 진행이 되지 않는다.
	 *  
	 *  아래의 1~3 까지 의 방법으로 반드시 변수를 초기화 해주어야한다.
	 *  1. 필드변수를 선언과 동시에 초기화 하는방법(메모리 관리상 여러가지 문제를 발생시킬수 있다. 가급적 사용x)
	 *  2. 생성자를 이용하여 초기화 하는 방법 (가장많이 권장하는 방법)
	 *  3. 사용하기 직전에 초기화 하기
	 *  객체형태의 변수란?
	 *  클래스를 사용하여 선언된 변수들
	 *  (int, float, bloolean, double 등 기본 형태의 변수 이외의 형태로 선언된 변수들)
	 */
	List<AddrVO> addrList = new ArrayList<AddrVO>(); // 1. 핃드변수를 선언과 동시에 초기화
	
	
	// 2. 생성자를 이용하여 필드변수 초기화 하기
	// 클래스의 기본 생성자를 임의로 재 작성하기
	// 누군가 AddrService01클래스를 객체로 선언하고
	// 초기화를 하기 위해 생성자를 호출하면
	// 자동으로 addrList 필드변수가 초기화 되어
	// 이후의 코드에서 NullpointerException이 발생하는 것을 방지한다.
	public AddrService01() {
		this.addrList = new ArrayList<AddrVO>();
	}
	
	/*
	 * 5명의 주소를 생성하여 
	 * addrList에 추가
	 */
	public void makeAddr() {
		
		//3. 사용하기 직전에 필드변수  초기화 하기
		// 필드변수를 사욯하기 직전에 초기화 하는 방식은
		// 유지보수가 어려워지는 코드가 된다.
		
		addrList = new ArrayList<AddrVO>();
		
		// 1명의 주소를 저장할 VO 객체(인스턴스)
		// AddrVO 클래스를 사용하여 
		// AddrVO 객체(인스턴스)를 선언
		// 생성자 method를 호출하여 객체를 초기화(사용가능하도록)한다.
		AddrVO addrVO = new AddrVO();
		
		addrVO.setStrName("홍길동");
		addrVO.setStrTel("010-111-1111");
		addrVO.setStrAddr("서울특별시");
		addrVO.setIntAge(33);
		addrVO.setStrNet("친구");
		addrList.add(addrVO); //새로 생성한 주소(VO)를 주소록(List)에 추가하기
		
		// 또한명의 주소를 저장할 VO 객체 만들기
		// 이미 만들어진 addrVO를 재활용(재 정의)한다.
		// 홍길동 주소를 담은 addrVO를 새롭게 재 정의하여
		// 저장공간을 비워주는 실행을 한다.
		addrVO = new AddrVO(); // 이전의 만들어진 객체(인스턴스)를 재활용 하기 위해서는 반드시 다시 생성한다. 
		
		addrVO.setStrName("이몽룡");
		addrVO.setStrTel("010-111-1111");
		addrVO.setStrAddr("익산시");
		addrVO.setIntAge(22);
		addrVO.setStrNet("후배");
		addrList.add(addrVO);
		
		addrVO = new AddrVO("장보고","010-444-4444");
		
		addrList.add(addrVO);
		
		addrVO = new AddrVO();
		
		addrVO.setStrName("방자");
		addrVO.setStrTel("010-222-2222");
		addrVO.setStrAddr("익산시");
		addrVO.setIntAge(22);
		addrVO.setStrNet("친구");
		addrList.add(addrVO);
		
		addrVO = new AddrVO();
		
		addrVO.setStrName("성춘향");
		addrVO.setStrTel("010-333-3333");
		addrVO.setStrAddr("익산시");
		addrVO.setIntAge(33);
		addrVO.setStrNet("여자친구");
		addrList.add(addrVO);
		
		
		addrVO = new AddrVO();
		
		addrVO.setStrName("변사또");
		addrVO.setStrTel("010-444-4444");
		addrVO.setStrAddr("익산시");
		addrVO.setIntAge(44);
		addrVO.setStrNet("지인");
		addrList.add(addrVO);

		addrVO = new AddrVO();
		
		addrVO.setStrName("향단이");
		addrVO.setStrTel("010-555-5555");
		addrVO.setStrAddr("익산시");
		addrVO.setIntAge(55);
		addrVO.setStrNet("동생");
		addrList.add(addrVO);
		
		
		
	}
	
	public void printAdd(){
		
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
