package com.biz.exec;

import com.biz.model.AddressVO;

public class Ex_01 {
	
	// ^F11를 사용해서 프로젝트롤 Run하려면 main() method
	public static void main(String[] args) {
		AddressVO address1 = new AddressVO();
		AddressVO address2 = new AddressVO();
		AddressVO address3 = new AddressVO();
		
		address1.setName("이몽룡");
		address1.setAge(23);
		address1.setAdd("광주");
		address1.setTel("01111");
		
		address2.setName("성춘향");
		address2.setAge(13);
		address2.setAdd("전주");
		address2.setTel("02222");

		
		address3.setName("변사또");
		address3.setAge(43);
		address3.setAdd("원주");
		address3.setTel("03333");
		
		//address* 인스턴스에 저장된 주소들을
		//별도의 문자열 변수엥 복사하여 Console 출력
		String addr1  = address1.getAdd();
		String addr2  = address2.getAdd();
		String addr3  = address3.getAdd();
		System.out.println(addr1);
		System.out.println(addr2);
		System.out.println(addr3);
		
		//직접 get method가 return 한 값을 console에 출력
		System.out.println(address1.getAge());
		System.out.println(address2.getAge());
		System.out.println(address3.getAge());
		
	
		

		
	}

}
