package j12_다형성.추상.Building;

public abstract class LCT extends BuildingLaw{

	@Override
	public abstract void elevator();

	@Override
	public void fireExtinguisher() {
		System.out.println("LCT 소화기");
	}

	@Override
	public void stair() {
		System.out.println("LCT 피난계단");
	}
	
	public void waterPark() {
		System.out.println("LCT 워터파크");
	}

}
