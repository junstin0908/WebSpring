package j13_최상위클래스;

public class EqualsMain {

	public static void main(String[] args) {
		
		Student s1 = new Student(20230001, "전진우");
		Student s2 = new Student(20230001, "전진우");
		Student s3 = new Student(20230002, "전진");
		Student s4 = new Student(20230002, "전진우");
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		

	}

}
