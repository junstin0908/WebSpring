package j12_다형성.OTT;

public class Tving implements Ott{

	@Override
	public void drama() {
		System.out.println("Tving에서 드라마를 시청하고 있습니다");
	}

	@Override
	public void movie() {
		System.out.println("Tving에서 영화를 시청하고 있습니다");
	}

	@Override
	public void animation() {
		System.out.println("Tving에서 애니메이션을 시청하고 있습니다");
	}
	
	public void freetier() {
		System.out.println("2주 무료 시청입니다");
	}

}
