package j07_반복;

import java.util.Scanner;

public class While2 {

	public static void main(String[] args) throws InterruptedException {
		
		/*
		 * 입장인원 : 7
		 * 
		 * 익명 1이 입장 하였습니다.
		 * .
		 * .
		 * .
		 * .
		 * .
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입장 인원 : ");
		int num = sc.nextInt();
		
		int i = 0;
		
		while (i < num) { // 반복횟수를 적고 그 이후에 변수에 맞춰줌
			
			System.out.println("익명 " + (i+1) + "이 입장하였습니다");
			
			i++;
			
		}
		
		System.out.println();
		Thread.sleep(1000);
		
		int i2 = 0;
		
		while (i2 < num) { // 반복횟수를 적고 그 이후에 변수에 맞춰줌
			
			System.out.println("익명 " + (num - i2) + "이 퇴장 하였습니다");
			
			i2++;
			Thread.sleep(1000);
			
		}
		System.out.println();
		
		System.out.println("프로그램 종료");
	}

}
