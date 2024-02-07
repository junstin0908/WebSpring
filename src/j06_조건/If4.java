package j06_조건;

import java.util.Scanner;

public class If4 {
	
	public static void main(String[] args) {
		
		/*
		 * 4분면 문제
		 * 
		 * X 값을 입력하시오 : 3
		 * Y 값을 입력하시오 : -6
		 * 
		 * X또는 Y 중에 하나라도 0이 있으면 4사분면으로 보내시오
		 * 
		 * 출력
		 * X 는 : 3
		 * Y 는 : -2
		 * 
		 * 결과 : 4사분면 입니다
		 */
		
		Scanner sc = new Scanner(System.in);
		int x;
		int y;
		String result = null;
		
		System.out.print("X의 값을 입력하시오 -> ");
		x = sc.nextInt();
		System.out.print("Y의 값을 입력하시오 -> ");
		y = sc.nextInt();
		
		if(x == 0 || y == 0) {
			System.out.println("X : " + x);
			System.out.println("Y : " + y);
			System.out.println("결과 : 4사분면 입니다" );
		} else if (x > 0 && y > 0) {
			System.out.println("X : " + x);
			System.out.println("Y : " + y);
			System.out.println("결과 : 1사분면 입니다" );
			
		} else if (x < 0 && y > 0) {
			System.out.println("X : " + x);
			System.out.println("Y : " + y);
			System.out.println("결과 : 2사분면 입니다" );
			
		} else if (x < 0 && y < 0) {
			System.out.println("X : " + x);
			System.out.println("Y : " + y);
			System.out.println("결과 : 3사분면 입니다" );
			
		} else if (x > 0 && y < 0) {
			System.out.println("X : " + x);
			System.out.println("Y : " + y);
			System.out.println("결과 : 4사분면 입니다" );
			
		}
		
		//----------------------------------------------------
		
		if (x > 0 && y > 0) {
			result = "1";
		} else if (x < 0 && y > 0) {
			result = "2";
		} else if (x < 0 && y < 0) {
			result = "3";
		} else {
			result = "4";
		}

		System.out.println("X : " + x);
		System.out.println("Y : " + y);
		System.out.println("결과 : " + result + "사분면 입니다");
	}

}
