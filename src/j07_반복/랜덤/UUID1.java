package j07_반복.랜덤;

import java.util.Scanner;
import java.util.UUID;

public class UUID1 {

	public static void main(String[] args) {
		
		/*
		 * UUID
		 * 토큰 ( )
		 * OTP
		 */
		Scanner sc = new Scanner(System.in);
		String savePhoto = null;
		String savePhoto2 = null;
//		System.out.println(UUID.randomUUID().toString());
		
		System.out.print("유저 1 이미지 첨부 : ");
		savePhoto = sc.next();
		System.out.print("유저 2 이미지 첨부 : ");
		savePhoto2 = sc.next();
		
		System.out.print("유저 1 저장된 이미지 : ");
		System.out.println(savePhoto);
		System.out.print("유저 2 저장된 이미지 : ");
		System.out.println(savePhoto2);


	}

}
