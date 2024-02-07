package j12_다형성.인터페이스.ex;

public class Computer {
	
	private HDMI hdmi;

	public Computer(HDMI hdmi) {
		
		this.hdmi = hdmi;
	}
	
	public void powerOn() {
		System.out.println("전원 키기");
		connectedDisplay();
	}
	public void powerOff() {
		System.out.println("전원 끄기");
		disConnectedDisplay();
	}
	
	private void connectedDisplay() {
		System.out.println("출력장치 연결");
		hdmi.connect();
	}
	
	private void disConnectedDisplay() {
		System.out.println("출력장치 해제");
		hdmi.disConnect();
	}

}
