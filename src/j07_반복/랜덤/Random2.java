package j07_반복.랜덤;

import java.util.Random;

public class Random2 {

	public static void main(String[] args) {
//		
//		Random random = new Random();
//		int rNum = random.nextInt(46); // 0 부터 괄호 안의 숫자 까지 랜덤으로 나옴
//		System.out.println(rNum);
//		
		/*
		 * 1 부터 45까지의 숫자 
		 */
		
		int count = 0;
		while(true) {
			
			int rNum2 = (int)(Math.random() * 100);
			if(rNum2 < 46) {
				System.out.println("번호" + rNum2);
				count++;
			}
			if(count == 6) 
				break;
		}
			
			System.out.println("추 첨 끝");
		}

	}


