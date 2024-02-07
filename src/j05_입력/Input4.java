package j05_입력;

import java.util.Scanner;

public class Input4 {

	public static void main(String[] args) {
		
		/*
		 * <자기소개 프로그램>
		 * 이름 : 전진우   next              name
		 * 나이 : 37    nextInt          age
		 * 주소 : 경남 양산시 동면 nextLine   address
		 * 연락처 : 010-9429-6280 next   phone
		 * 
		 * 
		 * 결과물
		 * 사용자의 이름은 전진우 이고 나이는 37세입니다.
		 * 주소는 경남 양산시 동면 입니다
		 * 연락처는 010-9429-6280 입니다.
		 */
		
		Scanner scanner = new Scanner(System.in);
		String name;
		int age;
		String address;
		String phone;
		
		System.out.print("이름 -> ");
		name = scanner.next();
		System.out.print("나이 -> ");
		age = scanner.nextInt();
		scanner.nextLine();
		System.out.print("주소 -> ");
		address = scanner.nextLine();
		System.out.print("연락처 -> ");
		phone = scanner.next();
		
		System.out.println("사용자의 이름은 " + name + "이고 나이는 " + age + " 세 입니다.");
		System.out.println("주소는 " + address + " 입니다.");
		System.out.println("언락처는 " + phone + " 입니다.");
		
		String name2 = scanner.next();
		System.out.println(name2);
		

	}

}
