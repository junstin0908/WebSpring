package j06_조건;

public class If1 {

	public static void main(String[] args) {
		
		boolean money;
		boolean money2;
		// 돈이 있으면 택시를 타고 돈이 없으면 걸어가라
		
		money = false;
		if(money) {
			System.out.println("택시를 타고 가라");
		} 
		
		if(!money) {
			System.out.println("걸어가라");
			System.out.println("걸어가다가 뛰어라");
		}
		
		// 돈이 있으면 탕후루를 먹고 돈이 없으면 감귤을 먹어라
		
		
		money2 = true;
		if(money2) {
			System.out.println("탕후루");
		}
		if(!money2)
			System.out.println("감귤");

		// 조건문 안에 실행문이 하나 일 때는 중괄호( { } ) 생략가능
		System.out.println("한라산 굿");
		System.out.println();

		if(money2) {
			System.out.println("탕후루2");
			System.out.println("탕탕!!!");
		}else {
			System.out.println("감귤2");
		}
		// 자동 정렬 단축키 -> Ctrl + Shift + f
		
		/*
		 * <if 문의 기본 구조>
		 * if(조건식) {
		 * 		실행문 1;
		 * 		실행문 2;
		 * 		...
		 * }else {
		 * 		실행문 A;
		 * 		실행문 B;
		 * 		...
		 * }
		 */
	}

}
