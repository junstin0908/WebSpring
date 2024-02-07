package j09_클래스;

import java.util.Scanner;

public class Car {
	Scanner sc = new Scanner(System.in);
	
	String company;
	String model;
	String color;
	/*
	 * 생성자의 특징
	 * 1. 주소값을 리턴한다
	 * 2. 클래스 명과 동일하다
	 * 3. 기본생성자는 생략이 가능하다
	 */
	Car() {
	}
	
	void showCarInfo() {
		System.out.println("회사명 : " + company);
		System.out.println("모델명 : " + model);
		System.out.println("색상 : " + color);
	}
	
	void changeEngineOil() {
		System.out.print("교체 후 주행거리(Km) -> ");
		int laterKm = sc.nextInt();
		
		
		if(laterKm < 9000) {
			System.out.println("9,000 km 주행 후 교체하십시오");
		} else {
			System.out.print("엔진오일 주입량(L) -> ");
			int inputOil = sc.nextInt();
			if (inputOil > 5) {
				
				inputOil = 5;
				System.out.println("희망 주입량이 5L 이상 일 시 최대 " + inputOil + " L 만 주입");
			} else {
				System.out.println("주입량 " + inputOil + " L 주입합니다");
			}
		}
		
		
	}
}
