package com.biz.control;

public class For_05 {
	
	public static void main(String[] args) {
		
		int num = 0;
		int sum = 0;
		for(;;) {
			num++;
			sum += num; //sum = sum + num �� ����� ��ɹ�
			if(num >= 10) {
				break;
			}
			
		}
		System.out.println("���:" + sum);
		
		num = 0;
		for(;;) {
			num++;
			sum += num; //sum = sum + num �� ����� ��ɹ�
			if(num < 10) {
				
			}else {
				break;
			}
			}
		
		/*
		 * for(;;) ��ɹ��� �ι�° �����ݷ� ���� �����
		 * for(;���ǹ�;)
		 * ���ǹ��� ������� true�̸� {} ���� ��ɹ��� �����ϰ�
		 * ������� flase�̸� ���̻� �ݺ����� �ʰ�
		 * for() ��ɹ��� �����Ѵ�.
		 * ���ǹ���
		 *    if(����) {
		 *    } else{
		 *    break;
		 *    }
		 *   �� ���� ������ �����Ѵ�.
		 *   
		 */
        num = 0;
		sum = 0;
		for(; num < 10 ;) {
			num++;
			sum += num; //sum = sum + num �� ����� ��ɹ�
			}
			System.out.println("���:"+ sum);
            
			/*
			 * for(;;) ��ɹ��� ù��° �����ݷ� ���� ���
			 * for(�ʱ�ȭ�ڵ�; ���ǹ�;)
			 * �ʱ�ȭ �ڵ�� ������ ����Ǿ� ������� �������� 
			 * clear�ϴ� ��ɹ��� ���� �� �ִ�.
			 */
		
	        //num = 0;
			//sum = 0;
			for(num = 0, sum = 0; num < 10 ;) {
				num++;
				sum += num; //sum = sum + num �� ����� ��ɹ�
				}
				System.out.println("���:"+ sum);
				
				/*
				 * for(;;)��ɹ��� ����° ��ɹ�
				 * for(�ʱ�ȭ���; ���ǹ�; ������)
				 * 
				 * 1. for(1;���ǹ�;2) ����� ������
				 * 2. 1 �ʱ�ȭ����� ������ �����Ѵ�.(��, �ѹ���)
				 * 3. ���ǹ��� �����Ͽ� ����� true�̸� {} ���� ��ɹ��� ����
				 * 4. {} ��ɹ��� ������ �� for(;���ǹ�;2)��ɹ����� �̵��Ͽ�
				 * 5. 2����(num++)��ɹ��� �����Ѵ�.
				 * 6. �ٽ� (���ǹ�)�� �����Ͽ� ����� true���� �˻��Ѵ�.
				 *    �׸��� ����Ͽ� �ݺ��ϰų�, �ߴ��Ѵ�.
				 */
				
				for( num = 0, sum = 0; num < 10 ;num++ ) {
					sum += num; //sum = sum + num �� ����� ��ɹ�
					}
					System.out.println("���:"+ sum);


	}

}
