package j08_메소드;

import java.io.IOException;
import java.util.Scanner;

public class vf {
	
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
	
	public static void surveyNameAge(String name, String age) {
		System.out.println("이름은 " + name + "이고 나이는 " + age + "입니다");
	}
	
	public static void surveyNameAge2(String nameAge) {
		if(nameAge.length() == 3) {
			System.out.println("이름은 " + nameAge + " 입니다");
			System.out.println("나이는 미입력 입니다");
		} else if(nameAge.length() == 1 || nameAge.length() == 2) {
			System.out.println("이름은 미입력 입니다");
			System.out.println("나이는 " + nameAge + "입니다");
		}
	}
	
	public static void surveyNameAge3 () {
		System.out.println("이름은 미입력 입니다");
		System.out.println("나이는 미입력 입니다");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("< 설    문 >");
		System.out.print("이름 : ");
		String name = sc.nextLine()	;
		System.out.print("나이 : ");
		String age = sc.nextLine();
		
		if(!name.equals(null) && !age.equals(null)) {
			//함수 1 호출
			surveyNameAge(name, age);
		} else if (!name.equals(null) || !age.equals(null)) {
			if(name.equals("")) {
				surveyNameAge2(age);
			} else {
				surveyNameAge2(name);
			}
		} else {
			surveyNameAge3();
		}
		
		
//		String age1 = sc.nextLine()	;
//		int age = 0;
//		  try{
//	            age = Integer.parseInt(age1);
//	            
//	        }
//	        catch (NumberFormatException ex){
//	            
//	        }
			
		
		System.out.println();
		
		
		
		
		
	}
	

}
