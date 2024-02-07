package j12_다형성.인터페이스;

public class ComputerMain {

	public static void main(String[] args) {
		
		Monitor monitor = new Monitor();
		Bluetooth bluetooth = new Mouse();
		Computer computer = new Computer(monitor);
		computer.setBluetooth(bluetooth);
		
		
		computer.powerOn();
		System.out.println();
		computer.powerOff();

	}

}
