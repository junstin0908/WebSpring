package j07_반복;

import java.util.Scanner;

public class Kiosk {

	public static void main(String[] args) throws InterruptedException {

		/*
		 * <인생 네컷>
		 * 
		 * 1. 하루필름 (2인) 2. 포토그레이 (3인) 3. 항공필름 (4인)
		 * 
		 * 원하는 인생 네컷을 고르시오 : 인원 수를 입력 하시오 :
		 * 
		 * 하루 필름을 선택 하셨습니다 인원을 초과하였습니다
		 * 
		 * 찰칵! 2초 대기 찰칵! 2초대기 찰칵! 2초대기 찰칵!
		 * 
		 * 원하는 사진 수를 입력하시오 (짝수만 입력 가능 ) :
		 * 
		 * 사진 1 나왔습니다 사진 2 나왔습니다 사진 3 나왔습니다 사진 4 나왔습니다
		 * 
		 * 만약에 홀 수 입력시 (올바르지 않은 입력 입니다.) 반복문
		 */

		System.out.println("< 인 생 네 컷 >");
		System.out.println("1. 하루 필름 (2인)");
		System.out.println("2. 포토그레이 (3인)");
		System.out.println("3. 항공필름 (4인)");

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("원하는 인생 네컷을 고르시오 : ");
			int sel = sc.nextInt();
			System.out.print("인원 수를 입력하시오 : ");
			int people = sc.nextInt();

			boolean z = false;

			switch (sel) {
			case 1:
				System.out.println("1. 하루 필름을 선택하였습니다");

				if (people < 3) {
					z = true;

				} else {
					System.out.println("인원을 초과하였습니다");

				}
				break;
			case 2:
				System.out.println("2. 포토그레이를 선택하였습니다");

				if (people < 4) {
					z = true;

				} else {
					System.out.println("인원을 초과하였습니다");

				}
				break;
			case 3:
				System.out.println("3. 항공필름을 선택하였습니다");

				if (people < 5) {
					z = true;

				} else {
					System.out.println("인원을 초과하였습니다");

				}
				break;

			}

			if (z) {
				int i = 0;
				while (i < 4) {
					System.out.println("찰칵!");
					i++;
					Thread.sleep(300);
				}
				while (true) {
					System.out.println("원하는 사진 수를 입력하시오");
					int pho = sc.nextInt();

					if (pho % 2 == 1) {

						System.out.println("올바르지 않은 입력 입니다.");
						continue;

					} else {
						int j = 0;
						while (j < pho) {
							System.out.println("사진 " + (j + 1) + " 나왔습니다");
							Thread.sleep(300);
							j++;
						}
						break;

					}

				}

			}

		}

	}

}
