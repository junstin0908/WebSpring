package burger_v01;

import java.util.Scanner;

public class BugerMenu {
	Scanner sc = new Scanner(System.in);
	private String sBuger;
	
	 public void showbugermenu() {
		 Mainmenu mainmenu = new Mainmenu();
		 while(true) {
			 String[] bugermenu = new String[8];
				bugermenu[0] = "1. 베이컨 토마토 디럭스";
				bugermenu[1] = "2. 상하이 스파이스 치킨";
				bugermenu[2] = "3. 빅맥";
				bugermenu[3] = "4. 맥 치킨";
				bugermenu[4] = "5. 불고기버거";
				
				bugermenu[5] = "6. 버거 선택 안함";
				bugermenu[6] = "7. 선택완료";
				bugermenu[7] = "8. 장바구니";
				
				
				for(int i = 0; i < bugermenu.length; i++) {
					System.out.println(bugermenu[i]);
				}
				
				System.out.println("버거 선택");
				int bugerChoice = sc.nextInt();
				sc.nextLine();
				
				if(bugerChoice > 0 && bugerChoice < 7) {
					sBuger = bugermenu[bugerChoice-1];
					
				} else if(bugerChoice == 7) {
					 mainmenu.showmainmenu2();
					 break;
				} 
				else {
					System.out.println("잘못 입력하셨습니다");
					
				}
				
				
		 }
		
			
			
			
	 }

	
	 public String getsBuger() {
			return sBuger;
		}

		public void setsBuger(String sBuger) {
			this.sBuger = sBuger;
		}
	
	
}
