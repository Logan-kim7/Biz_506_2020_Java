package com.biz.addr.exec;

import com.biz.addr.service.AddrService01;

public class AddrEx_01 {
	
	public static void main(String[] args) {
		AddrService01 addrService = new AddrService01();
		addrService.makeAddr();
		addrService.printAdd();
	}	
	

}
