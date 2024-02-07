package j12_다형성.추상.Building;

public class LotteTower extends BuildingLaw{

	@Override
	public void elevator() {
		System.out.println("롯데타워 엘리베이터");
	}

	@Override
	public void fireExtinguisher() {
		System.out.println("롯데타워 소화기");
	}

	@Override
	public void stair() {
		System.out.println("롯데타워 피난계단");
	}
	
	public void observatory() {
		System.out.println("롯데타워 전망대");
	}
	
}
