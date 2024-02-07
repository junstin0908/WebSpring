package j08_메소드;

import java.util.Scanner;

public class Method2 {

	// 반환(리턴)도 없고, 매개 변수도 없는 메소드
	public static void test1() {
		System.out.println("test1");
	}
	
	// 반환도 없고, 매개변수가 하나인 메소드
	public static void test2(int num) {
		System.out.println("num : " + num);
		System.out.println("test2 메소드 호출");
	}
	
	// 반환도 없고, 매개변수가 2개인 메소드
	public static void test3(String num1, int num2) {
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println("test3 메소드 호출");
	}
	
	// 반환은 있고, 매개변수가 없는 메소드
	public static int test4() {
		System.out.println("test4 호출");
		return 100;
	}
	
	// 반환도 있고 매개변수도 있는 메소드
	public static boolean test5(int num) {
		System.out.println("num5 : " + num);
		return true;
	}

	public static void main(String[] args) {

		// 메소드 종류
		test1();
		test2(20202);
		test3("가",200);
		test4();
		System.out.println(test5(100));
//		Scanner sc = new Scanner(System.in);
//		System.out.println("숫자 입력");
//		int jj = sc.nextInt();
//		test2(jj);
		
		
		

	}

}
