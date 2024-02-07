package j09_클래스;

public class CarMain {

	public static void main(String[] args) {
		
		/*
		 * Car 클래스
		 * 변수
		 * company
		 * model
		 * color
		 * 
		 * 메소드
		 * showCarInfo()
		 * 		회사명 : 0000
		 * 		모델명 : xxxx
		 * 		색상 : eeeee
		 * 
		 * changeEngineOil()
		 * 		교체 후 주행거리 : 8000
		 *  주입 량 : 10
		 * 	교체 한 후 9천 키로가 안되었으면 
		 * 9,000 km 주행 후 교체하십시오
		 * 교체 한 후 9천키로가 되었으면
		 * 주입량을 주입합니다
		 * 희망 주입량이 5L 이상 일 시 최대 5L 만 주입
		 * 
		 * 현대자동차
		 * 쏘나타
		 * 화이트
		 * 
		 * 기아자동차
		 * k5
		 * 블랙
		 */
		
		Car car1 = new Car();
		Car car2 = new Car();
		
		
		
		
		car1.changeEngineOil();
		System.out.println();
		
		car1.company = "현대";
		car1.model = "소나타";
		car1.color = "화이트";
		
		
		car1.showCarInfo();
		System.out.println();
		car2.company = "기아";
		car2.model = "k5";
		car2.color = "블랙";
		car2.showCarInfo();
		
	}

}
