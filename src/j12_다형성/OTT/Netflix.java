package j12_다형성.OTT;

public class Netflix implements Ott{

	@Override
	public void drama() {
		System.out.println("넷플릭스에서 드라마를 시청하고 있습니다");
	}

	@Override
	public void movie() {
		System.out.println("넷플릭스에서 영화를 시청하고 있습니다");
	}

	@Override
	public void animation() {
		System.out.println("넷플릭스에서 애니메이션을 시청하고 있습니다");
	}
	
	public void sale() {
		System.out.println("20% 세일 합니다");
	}

}
