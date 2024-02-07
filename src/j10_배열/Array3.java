package j10_배열;

import j09_클래스.접근지정자.student.Student;

public class Array3 {

	public static void main(String[] args) {

		/*
		 * 배열들을 통해서 값을 받아 옴 배열 크기 names 5 studentYears 5 age 5
		 * 
		 * 홍길동 3 19 홍길서 2 18 홍길남 3 19 홍길북 1 17 홍길중 2 18
		 * 
		 * 이름은 홍길동 이고 학년은 3학년, 19세 입니다.
		 */

		String[] names = { "홍길동", "홍길서", "홍길남", "홍길북", "홍길중" };
		int[] studentYears = { 3, 2, 3, 1, 2 };
		int[] age = { 19, 18, 19, 17, 18 };

		for (int i = 0; i < names.length; i++) {
//			System.out.println(names[i] + "\t" + studentYears[i] + "\t" + age[i]);
			System.out.println("이름은 " + names[i] + " 이고 학년은 " + studentYears[i] + "학년, " + age[i] + "세 입니다");
		}
		// 2번째
		
		/*
		 * names, studentYears, age 배열을 활용하여
		 * students 라는 배열(크기 : 5) 에 값 주입
		 * 출력
		 * 이름 : 홍길동	학년 : 3학년	나이 : 19세
		 * 
		 */
//		for (int i = 0; i < names.length; i++) {
//			Student students = new Student(names[i],studentYears[i], age[i]);
////			System.out.println(students);
//		}
//		
		Student[] students1 = new Student[5];
		for(int i=0; i <students1.length; i++) {
			students1[i] = new Student(names[i], studentYears[i], age[i]);
		}
		for(int i=0; i <students1.length; i++) {
			System.out.println("이름 : " + students1[i].getName() + "\t 학년 : " + students1[i].getStudentYear() + "\t 나이 : " + students1[i].getAge());
		}
		
		
	}

}
