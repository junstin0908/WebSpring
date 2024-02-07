package j07_반복;

import java.util.Scanner;

public class sdfsdf {

	public static void main(String[] args) throws InterruptedException {
		while (true) {
			System.out.println("< 인 생 네 컷 >");
			System.out.println("1. 하루 필름 (2인)");
			System.out.println("2. 포토그레이 (3인)");
			System.out.println("3. 항공필름 (4인)");

			Scanner sc = new Scanner(System.in);
			int sel;
			int people;
			int photoC;
			while (true) {
				System.out.print("원하는 인생 네컷을 고르시오 : ");
				sel = sc.nextInt();
				System.out.print("인원 수를 입력하시오 : ");
				people = sc.nextInt();

				if (sel == 1 && people < 3) {
					System.out.println("하루 필름이 선택되었습니다");
					break;
				} else if (sel == 1 && people > 2) {
					System.out.println("인원이 초과하였습니다");
					continue;
				} else if (sel == 2 && people > 4) {
					System.out.println("포토그레이가 선택되었습니다");
					break;
				} else if (sel == 2 && people > 3) {
					System.out.println("인원이 초과하였습니다");
					continue;
				} else if (sel == 3 && people > 5) {
					System.out.println("항공필름이 선택되었습니다");
					break;
				} else if (sel == 3 && people > 4) {
					System.out.println("인원이 초과하였습니다");
					continue;
				}
			}

			int i = 0;
			while (i < 4) {
				System.out.println("찰칵!!");
				Thread.sleep(1000);
				i++;
			}
			while(true) {
				System.out.println("원하는 사진 수 입력(짝수)");
				photoC = sc.nextInt();

				if (photoC % 2 == 1) {
					System.out.println("올바르지 않는 입력입니다");
					continue;
				} else {
					int j = 0;
					while (j < photoC) {
						System.out.println("사진" + (j + 1) + "이 출력 되었습니다");
						j++;
					}break;
				}
			}
			

		}

	}
}
