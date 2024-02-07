package j06_조건;

import java.util.Scanner;

public class SwitchCase2 {

	public static void main(String[] args) {
		
		/*
		 * 롯데월드
		 * 1. 자이로드롭 (170)
		 * 2. 후룸라이드 (150)
		 * 3. 바이킹 (160)
		 * 4. 회전목마 (140)
		 * 5. 관람차 (130)
		 * 
		 * 키를 입력하시오 : 140
		 * 
		 * 
		 * 회전목마 탑승 가능
		 * 관람차 탑승가능
		 * 
		 * 커플 입장시 10% 할인 (무조건 나와야됨)
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("키를 입력 하시오 -> ");
		int height = sc.nextInt();
		sc.nextLine();
		System.out.print("커플이신가요? -> ");
		String couple = sc.next();
		num = height / 10;
		
		switch(num) {
		case 17  :
			System.out.println("자이로드롭 탑승 가능");
		case 16 :
			System.out.println("바이킹 탑승 가능");
		case 15 :
			System.out.println("후룸라이드 탑승 가능");
		case 14 :
			System.out.println("회전목마 탑승 가능");
		case 13 :
			System.out.println("관람차 탑승 가능");
		
		switch(couple) {
		case "O" :
			System.out.println("커플 이므로 10% 할인");
			break;
		case "X" :
			System.out.println("할인없습니다");
			
		}
		
		}
		
		

	}
	
	

}
