package burger_v01;

import java.util.Scanner;

public class Mainmenu {
	Scanner sc = new Scanner(System.in);
	BugerMenu bugerMenu = new BugerMenu();
	DessertMenu dessertMenu = new DessertMenu();
	SnackMenu snackMenu = new SnackMenu();
	Order order = new Order();
	public void showmainmenu1 () {

		
		System.out.println("1. 포장 or 2. 매장");
		int choice1 = sc.nextInt();
		sc.nextLine();
	}
	public void showmainmenu2 () {
		System.out.println("메뉴를 정해 주세요");
		System.out.println();
		System.out.println("1. 버거류");

		System.out.println();
		System.out.println("2. 디저트류");

		System.out.println();
		System.out.println("3. 스낵류");
		System.out.println();
		System.out.println("4. 장바구니");
		System.out.println();
		
		int choice2 = sc.nextInt();
		sc.nextLine();
		
		switch (choice2) {
		case 1:
			bugerMenu.showbugermenu();
			break;
		case 2:
			dessertMenu.showdessertmenu();
			break;
		case 3:
			snackMenu.showsnackmunu();
			break;
		case 4:
			order.showorder();
			break;
		}
	}
}
