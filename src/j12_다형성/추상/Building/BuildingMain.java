package j12_다형성.추상.Building;

public class BuildingMain {

	public static void main(String[] args) {
		
		
		
		BuildingLaw lotteTower = new LotteTower();
		BuildingLaw lct = new LCTLow();
		BuildingLaw building63 = new Building63(); 
		
		
		
		System.out.println("롯데타워 (LotteTower)");
		lotteTower.elevator();
		lotteTower.fireExtinguisher();
		lotteTower.stair();
		((LotteTower) lotteTower).observatory();
		lotteTower.toilet();
		System.out.println();
		System.out.println("63빌딩(Building63)");
		building63.elevator();
		building63.fireExtinguisher();
		building63.stair();
		((Building63) building63).aquarium();
		System.out.println();
		System.out.println("LCT");
		lct.elevator();
		lct.fireExtinguisher();
		lct.stair();
		((LCT) lct).waterPark();
		lct.toilet();
		

	}

}
