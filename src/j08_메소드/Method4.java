package j08_메소드;

import java.util.Scanner;

public class Method4 {
	
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
	
	public static void str1(String str, int age) {
		System.out.println("이름은 " + str + "이고 나이는 " + age + "입니다");
	}
	
	public static void str1(String str) {
		System.out.println("이름은 " + str + "입니다");
		System.out.println("나이는 미입력 입니다");
	}
	
	public static void str1(int age) {
		System.out.println("이름은  미입력 입니다");
		System.out.println("나이는" +age + " 입니다");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("< 설    문 >");
		System.out.print("이름 : ");
		String str = sc.nextLine()	;
		System.out.print("나이 : ");
		String age1 = sc.nextLine()	;
		int age = 0;
		  try{
	            age = Integer.parseInt(age1);
	            
	        }
	        catch (NumberFormatException ex){
	            
	        }
			
		
		System.out.println();
		
		
		
		
		if(str != "" && age != 0) {
			str1(str, age);
		} else if(str.equals("") && age != 0) {
			str1(age);
		} else if (!str.equals("") && age == 0) {
			str1(str);
		}
		
		
	}
	

}
