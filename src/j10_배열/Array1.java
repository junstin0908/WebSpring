package j10_배열;

import j09_클래스.Computer;

public class Array1 {

	public static void main(String[] args) {
		// 정수배열
		int[] a = new int[5];
		//문자열배열
		String[] strArray = new String[4];
		strArray[2] = "전진우";
		a[0] = 10;
		a[1] = 9;
		System.out.println(a[0]);
		System.out.println(a[1]);
		
		System.out.println(strArray[2]);
		//객체배열
		Computer[] computers = new Computer[4];
		computers[1] = new Computer();
		System.out.println(computers[1]);

	}

}
