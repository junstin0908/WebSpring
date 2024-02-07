package j12_다형성.인터페이스.ex;

public class Monitor implements HDMI{

	@Override
	public void connect() {
		System.out.println("HDMI 를 통해 연결");
	}

	@Override
	public void disConnect() {
		System.out.println("HDMI 연결 해제");
	}

}
