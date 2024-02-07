package j12_다형성.OTT;

import java.util.Scanner;

public class OttMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String id = "jhun4321";
		String pss = "1234";
		
		System.out.println("아이디를 입력하세요");
		String inputId = sc.nextLine();
		System.out.println("비밀번호를 입력하세요");
		String inputPass = sc.nextLine();
		
		if(inputId.equals(id) ) {
			if(inputPass.equals(pss)) {
				System.out.println("로그인성공");
			} else {
				System.out.println("비밀번호가 틀렸습니다");
			} 
		} else {
			System.out.println("아이디가 틀렸습니다");
		}
		
		Netflix netflix = new Netflix();
		Watcha watcha = new Watcha();
		Tving tving = new Tving();
		OTTMiddleware ottMiddleware = new OTTMiddleware(netflix);
		
		ottMiddleware.watchDrama();
		System.out.println();
		ottMiddleware.watchMovie();
		System.out.println();
		ottMiddleware.watchAni();
		System.out.println();
		ottMiddleware.runAddOns();
		System.out.println();
		 Ott[] ott1 = new Ott[3];
	        ott1[0] = new Netflix();
	        ott1[1] = new Tving();
	        ott1[2] = new Watcha();
		
	        for (int i = 0; i < ott1.length; i++) {
	            
	            Ott ott = ott1[i];
	            watchContent(ott);
	            
	        }
	    }

	    public static void watchContent(Ott ott) {
	        ott.drama();
	        ott.movie();
	        ott.animation();
	    
	}

	

}
