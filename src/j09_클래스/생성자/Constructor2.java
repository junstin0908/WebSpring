package j09_클래스.생성자;

public class Constructor2 {
	
	String name;
	int age;
	boolean wishWindow;
	
	/*
	 * 생성자 오버로딩 했을 경우
	 * 기본생성자는 생략이 안됨
	 * 기본생성자를 사용하고 싶을 경우 무조건 명시해야한다
	 */

	public Constructor2() {
		
	}
	
	
	public Constructor2(String name, boolean wishWindow) {
		
		this.name = name;
		this.wishWindow = wishWindow;
	}



	public Constructor2(int age, boolean wishWindow) {
		
		this.age = age;
		this.wishWindow = wishWindow;
	}


	public Constructor2(String name, int age) {
		
		this.name = name;
		this.age = age;
	}

	public Constructor2(boolean wishWindow) {
		System.out.println(wishWindow);
		this.wishWindow = wishWindow;
	}

	public Constructor2(int age) {
		System.out.println(age);
		this.age = age;
	}

	public Constructor2(String name) {
		System.out.println(name);
		this.name = name;
	}

	public Constructor2(String name, int age, boolean wishWindow) {
		
		this.name = name;
		this.age = age;
		this.wishWindow = wishWindow;
	}



	// 가능한 생성자 다 만들기
	
}
