package com.biz.service;

import com.biz.model.AddressVO;

public class AddrServiceV1 {
	
	public void addList(AddressVO[] addressList) {
		LineService lineService = new LineService();
		String d_line = lineService.do_line(50);
		String s_line = lineService.single_line(50);
		
		System.out.println(d_line);
		System.out.println("주소록");
		System.out.println(s_line);
		System.out.println("\t이름\t전화번호\t주소\t나이\n");
		System.out.println(s_line);
		for(int i = 0 ; i < addressList.length; i++ ) {
			
			System.out.printf("\t%s\t%s\t%s\t%d\n",
					addressList[i].getName(),
					addressList[i].getTel(),
					addressList[i].getAdd(),
					addressList[i].getAge());
		}
		System.out.println(d_line);
	}

}
