package j01_출력;

public class Myinfo {

	public static void main(String[] args) {
		String fullName;
		 fullName = "전진우";
		 System.out.println(fullName);
		 String fullName2 = "전진우";
		 //선언은 무조건 한번만 가능
		 
		 fullName = "홍길서";
		 // 대입은 여러번 가능
		 System.out.println(fullName);
		 
		 
		char name1 = '홍';
		char name2 = '길';
		char name3 = '동';
		int age = 18;
		String address = "경남 양산시"	;
		boolean result = true;
		// String 은 기본 자료형이 아니다
		System.out.println(name1 + name2 + name3);
		/*
		 * 자동완성 단축키 : Ctrl + Space
		 * 출력문 단축키 : sysout 또는 syso + 자동완성
		 */
	}

}
