package com.biz.hello;

public class VarBoolean_02 {
	public static void main(String[] args) {
		
		//boolean�� ������ �����ϰ�
		//true��� ���� �����϶�. �ʱ�ȭ�϶�
		boolean bVar1 = true;
		boolean bVar2 = true;
		
		 bVar1 = 3 ==3;
		 
		 // 3 > 3 3�� �񱳿����� �����Ͽ� ����� bVar2�� �����϶�
		 bVar2 = 3 > 3;
		 System.out.println(bVar2);
		 
		bVar1 = 3<3;
		System.out.println(bVar1);
		
		
		bVar1 = 3 >= 3;
		bVar2 = 3 <= 3;
		
        boolean bVar3 = bVar1 == bVar2;
        		System.out.println(bVar3);
	
        bVar3 = bVar1 != bVar2;
        System.out.println(bVar3);
        
        bVar1 = 3 >= 3;  // true
        bVar2 = 3 > 3;  // false
        bVar3 = bVar1 != bVar2;
        System.out.println(bVar3);
        
        // ||(filter, pipe ����) : OR �����ȣ
        bVar3 = bVar1 || bVar2;
        System.out.println(bVar3);
        
        // && : AND �����ȣ
        bVar3 = bVar1 && bVar2;
        System.out.println(bVar3);
        
        
	}

}
