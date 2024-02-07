package j07_반복.랜덤;

import java.util.Random;

public class Random3 {

	public static void main(String[] args) {
		
		/*
		 * 1 ~ 45 까지의 수 중 5개를 랜덤으로 뽑고 그 중 가장 큰 수를 
		 * 출력하시오
		 * 
		 * 가장 큰수 : 
		 */
		Random random = new Random();
		int count = 0;
		int maxNum = 0;
		while(true) {
			int rNum = (int)(Math.random() * 100);
			if(rNum < 47) {
				System.out.println("번호 -> " + rNum);
				count++;
				if(maxNum < rNum) {
					maxNum = rNum;
				}
			}
			
			
			if(count == 6) break;
			
		}
		System.out.println("가장 큰 수 -> " + maxNum);
		
//		--------------------------------------------------------------------
		int i = 0;
		int maxNum1 = 0;
		while (i < 5) {
			int num = random.nextInt(45);
			int tempNum = num + 1;
			System.out.println(tempNum)	;
			if(i==0) {
				maxNum1 = tempNum;
			}else {
				if(maxNum1 < tempNum) {
					maxNum1 = tempNum;
				}
			}
			i++;
		}System.out.println("최대값" + maxNum1);
		
	}

}
