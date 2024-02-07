package j04_문자열;

public class String1 {
	
	public static void main(String[] args) {
		
		/*
		 * String 은 클래스 자료형 이다
		 * String 자료형을 가진 변수명.함수명(); 사용가능
		 * 
		 * int 는 기본 자료형이다
		 * 클래스가 아니라서 함수가 없다
		 * num.length() 가 없다
		 * 
		 */
		
		System.out.println("월요일, 동우가 말했다");
		System.out.println("\"안녕, 친구들\"");
		
		//인덱싱 과 슬라이싱
		
		            //     0 123 4 5
		String address = "경남 양산시 동면";
		System.out.println(address.indexOf("시"));;
		// 인덱스는 0 부터 센다
		int index = address.indexOf("시");
		System.out.println(index);
		//                 0 1 2 34
		String address2 = "부산시 동래구 사직동";
		int index2 = address2.indexOf("동");
		System.out.println(index2);
		//띄어쓰기도 index 값에 포함
		
		int index3 = address2.lastIndexOf("동");
		System.out.println(index3);
		
		String subAdress = address2.substring(0,4);
		System.out.println(subAdress);
		
		String subAdress2 = address2.substring(0,3);
		System.out.println(subAdress2);
		
		String address3 = "부산광역시 서구 부민동";
		
		/*
		 * indexOf 와 lastIndexOf를 모두 사용하여 
		 * 부산광역시 서구를 출력하시오
		 */
		
		int subA3 = address3.indexOf("부");
		
		System.out.println(subA3);
		
		int subA4 = address3.lastIndexOf("부");
		
		String subAdress3 = address3.substring(subA3 , subA4-1);
		System.out.println(subAdress3);
		
		System.out.println("안녕");
		System.out.println("\n");
		System.out.println("잘가");
	}
}
