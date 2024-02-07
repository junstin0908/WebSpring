package burger_v01;

import java.util.Scanner;

public class MainChoice {
	Scanner sc = new Scanner(System.in);
	public void showInfo() {
		System.out.println("맥도날드 입니다");
		System.out.println();
		System.out.println("원하는 메뉴를 입력해주세요");
		int choice = sc.nextInt();
		System.out.println("1. 버거류");
		System.out.println();
		System.out.println("2. 디저트류");
		System.out.println();
		System.out.println("3. 스낵류");
		
	}
}
