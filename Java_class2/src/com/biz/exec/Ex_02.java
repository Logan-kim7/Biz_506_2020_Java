package com.biz.exec;

import com.biz.model.AddressVO;
import com.biz.service.AddrServiceV1;

public class Ex_02 {
	
	public static void main(String[] args) {
		
		
		AddressVO[] address = new AddressVO[5];
		
		/* index 값만 다르고 나머지가 같거나 유사한 코드가 반복될때
		 * for 문을 이용해서 작성할수도 있다.
		address[0] = new AddressVO();
		address[1] = new AddressVO();
		address[2] = new AddressVO();
		address[3] = new AddressVO();
		address[4] = new AddressVO();
		 * 
		 */
		
		for(int i = 0 ; i <address.length; i++) {
			address[i] = new AddressVO();
			
		}	
			
			address[0].setName("이몽룡");
			address[0].setAdd("광주광역시");
			address[0].setTel("010-000-0000");
			address[0].setAge(20);
			
			address[1].setName("성춘향");
			address[1].setAdd("대전광역시");
			address[1].setTel("010-111-1111");
			address[1].setAge(30);

			address[2].setName("홍길동");
			address[2].setAdd("대구광역시");
			address[2].setTel("010-222-2222");
			address[2].setAge(40);

			address[3].setName("임꺽정");
			address[3].setAdd("인천광역시");
			address[3].setTel("010-333-3333");
			address[3].setAge(50);
			        
			address[4].setName("임사홍");
			address[4].setAdd("부산광역시");
			address[4].setTel("010-444-4444");
			address[4].setAge(20);

		
		
			AddrServiceV1 addressList = new AddrServiceV1();
			//배열을 매개변수를 통해 method에게 전달할때는 이름만 붙여주면 된다.
			addressList.addList(address);
	}
	


}
