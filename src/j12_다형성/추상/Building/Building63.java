package j12_다형성.추상.Building;

public  class Building63 extends BuildingLaw{

	@Override
	public void elevator() {
		System.out.println("63빌딩 엘리베이터");
	}

	@Override
	public void fireExtinguisher() {
		System.out.println("63빌딩 소화기");
	}

	@Override
	public void stair() {
		System.out.println("63빌딩 피난계단");
	}
	
	public void aquarium( ) {
		System.out.println("63빌딩 아쿠아리움");
	}
}
