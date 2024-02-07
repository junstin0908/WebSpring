package j02_변수와상수;

public class Constant {
	public static void main(String[] args) {
		final int MAX_NUMBER = 100;
		final int MIN_NUMBER = 0;
		int number = 10;
		
		number = 30;
		// maxNumber = 300;
		System.out.println("최대값 : " + MAX_NUMBER);
		System.out.println("최소값 : " + MIN_NUMBER);
		System.out.println("현재값 : " + number);
		
		/*
		 * 상수 : 변하지 않는 수
		 * 상수임을 표시 하는 법 -> 자료형 앞에 final 적기
		 * 상수 표현 법 : 전부다 대문자로 표기 -> 카멜표기법은 가독성이 떨어지므로 스네이크 표기법으로 표기
		 * 상수는 무조건 초기화 해줘야 한다(중요)
		 * 
		 */
	}

}
