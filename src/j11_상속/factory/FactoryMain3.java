package j11_상속.factory;

public class FactoryMain3 {
	
	public static void main(String[] args) {
		
		SamsungFactory samsungFactory = new SamsungFactory(1);
		Factory sfactory = samsungFactory;
		SamsungFactory samsungFactory2 = (SamsungFactory)sfactory;
		
		/*
		 * 근본 주소로 내려 오는건 가능
		 * 부모 주소에서 자식 주소로 못 내려옴
		 */

	}

}
