package j12_다형성.추상.Building;

public abstract class BuildingLaw {
	
	public abstract void elevator();
	public abstract void fireExtinguisher();
	public abstract void stair();
	
	public void toilet() {
		System.out.println("화장실 갯수 적당");
	}
	
	
}
