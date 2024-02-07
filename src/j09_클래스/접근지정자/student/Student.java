package j09_클래스.접근지정자.student;

public class Student {
	
	private String name;
	private int studentYear;
	private int age;
	private String address;
	private String phone;
	public Student(String name, int studentYear, int age, String address, String phone) {
		
		this.name = name;
		this.studentYear = studentYear;
		this.age = age;
		this.address = address;
		this.phone = phone;
	}
	
	public Student(String name, int studentYear, int age) {
		
		this.name = name;
		this.studentYear = studentYear;
		this.age = age;
//		System.out.println("이름 : " + name + "\t학년 : " + studentYear + " \t나이 : " + age );
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStudentYear() {
		return studentYear;
	}
	public void setStudentYear(int studentYear) {
		this.studentYear = studentYear;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
	/*
	 * 생성자를 사용하는 이유
	 * 
	 * 값을 주입하는 방법은 주소참조, 생성자를 통한 2가지 방법이 있는데
	 * 일반적으로 주소참조로 값을 주입하는것이 편함
	 * 하지만 변수를 private 로 지정을 하게 되면 동일 클래스가 아니면
	 * 값을 넣을 수 없기 때문에 생성자를 통한 우회방법으로 값을 주입
	 * 
	 * public - 공개 정도가 가장 높고 어디에서든 자유롭게 접근할 수 있다.
	 * 
	 * protected
		같은 패키지 내에서 접근이 가능하고 다른 패키지에서도 상속을 받은 클래스 내부에서는 사용 가능하다. 
		public 과 다른 점은 다른 패키지의 자식 클래스 외부에서는 접근할 수 없다는 것이다.
		
		default (package private)
		같은 패키지 내에서만 접근이 가능하다. 아무런 접근 지정자가 없을 경우 이 옵션이 자동으로 적용된다.

		private
		동일 클래스 내에서만 접근이 가능한 가장 낮은 단계의 자유도를 갖는다.
	 */

}
