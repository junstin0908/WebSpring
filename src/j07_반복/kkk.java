package j07_반복;
import java.util.Scanner;

public class kkk {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("< 인 생 네 컷 >");
        System.out.println("1. 하루 필름");
        System.out.println("2. 포토그레이");
        System.out.println("3. 항공필름");

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("원하는 인생 네컷을 고르시오 : ");
            int sel = sc.nextInt();
          

            boolean z = false;

            switch (sel) {
                case 1:
                    System.out.println("1. 하루 필름을 선택하였습니다");
                    System.out.print("인원 수를 입력하시오 : ");
                    int people = sc.nextInt();
                    if (people < 3) {
                        z = true;
                    } else {
                        System.out.println("인원을 초과하였습니다. 다시 선택해주세요.");
                    }
                    break;
                case 2:
                    System.out.println("2. 포토그레이를 선택하였습니다");
                    System.out.print("인원 수를 입력하시오 : ");
                    int people2 = sc.nextInt();
                    if (people2 < 4) {
                        z = true;
                    } else {
                        System.out.println("인원을 초과하였습니다. 다시 선택해주세요.");
                    }
                    break;
                case 3:
                    System.out.println("3. 항공필름을 선택하였습니다");
                    System.out.print("인원 수를 입력하시오 : ");
                    int people3 = sc.nextInt();
                    if (people3 < 5) {
                        z = true;
                    } else {
                        System.out.println("인원을 초과하였습니다. 다시 선택해주세요.");
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

                int pho;
                do {
                    System.out.print("원하는 사진 수를 입력하시오 (짝수만 입력 가능) : ");
                    pho = sc.nextInt();

                    if (pho % 2 != 0) {
                        System.out.println("올바르지 않은 입력 입니다. 다시 입력해주세요.");
                    }
                } while (pho % 2 != 0);

                int j = 0;
                while (j < 4) {
                    System.out.println("사진 " + (j + 1) + " 나왔습니다");
                    Thread.sleep(300);
                    j++;
                }
            }
        }
    }
}
