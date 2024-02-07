package j02_변수와상수;

public class Cast {

	public static void main(String[] args) {
		// 기본 자료형의 형변환
		// 업 캐스팅 - 묵시적 형변환
		char a = 'A';
		int b = a;
		double c = b;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println();
		
		// 다운 캐스팅 - 명시적 형변환
		
		int d = (int)c;
		char e = (char)d;
		
		System.out.println("d = " + d);
		System.out.println("e = " + e);

	}

}
