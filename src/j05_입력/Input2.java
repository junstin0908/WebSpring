package j05_입력;

import java.util.Scanner;

public class Input2 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("나이를 입력하시오 -> ");
		int age = scanner.nextInt()	;
		
		System.out.print("만나이를 입력하시오 -> ");
		int age2 = scanner.nextInt();
		
		System.out.println(age + age2);
	}

}
