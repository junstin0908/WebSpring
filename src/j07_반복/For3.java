package j07_반복;

import java.util.Scanner;

public class For3 {

	public static void main(String[] args) {
		
		/*
		 * str = abcdefghijk
		 * 
		 * 반복문을 돌려서 출력
		 * 
		 * a
		 * b
		 * c
		 * d
		 * e
		 * f
		 * g
		 * h
		 * i
		 * j
		 * k
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문자를 입력하시오");
		String str = sc.nextLine();
		String str1 = "abcdefghijk";
		
		for(int i = 0; i < str.length(); i++) {
			System.out.println(str.substring(i,i+1));
		}

	}

}
