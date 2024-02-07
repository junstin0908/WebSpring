package j12_다형성.OTT;

public class Watcha implements Ott{

	@Override
	public void drama() {
		System.out.println("왓챠에서 드라마를 시청하고 있습니다");
	}

	@Override
	public void movie() {
		System.out.println("왓챠에서 영화를 시청하고 있습니다");
	}

	@Override
	public void animation() {
		System.out.println("왓챠에서 애니메이션을 시청하고 있습니다");
	}
	
	public void bundle() {
		System.out.println(" 1 + 1 입니다");
	}

}
