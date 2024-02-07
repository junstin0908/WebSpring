package j08_메소드;

import java.util.Scanner;

public class ddfsds {
	
	/*
	 * <설문>
	 * 이름 : 홍길동
	 * 나이 : 18
	 * 
	 * 이름은 홍길동 이고 나이는 18세 입니다
	 * 
	 * 이름 : 홍길동
	 * 나이 : 엔터
	 * 
	 * 이름은 홍길동입니다
	 * 나이는 미입력 입니다
	 * 
	 * 이름 : 엔터
	 * 나이 20
	 * 나이는 20세 입니다
	 * 이름은 미입력 입니다
	 * 
	 * 오버로딩 무조건 사용하시오
	 */
	
	public static void printInfo(String name, int age) {
		System.out.println("이름은 " + name + "이고 나이는 " + (age != 0 ? age + "세" : "미입력") + " 입니다");
	}
	
	public static void printInfo(String name) {
		System.out.println("이름은 " + name + "입니다");
		System.out.println("나이는 미입력 입니다");
	}
	
	public static void printInfo(int age) {
		System.out.println("이름은 미입력 입니다");
		System.out.println("나이는 " + age + "세 입니다");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("< 설    문 >");
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		if (!name.equals("") || age != 0) {
			printInfo(name, age);
		} else {
			System.out.println("입력된 정보가 없습니다.");
		}
		
		sc.close();
	}
}
