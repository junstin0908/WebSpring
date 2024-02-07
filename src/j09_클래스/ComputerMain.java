package j09_클래스;

public class ComputerMain {

	public static void main(String[] args) {
//		
//		System.out.println(new Computer());
//		System.out.println(new Computer());
//		
//		Computer address = new Computer();
//		System.out.println(address);
//		
		
		Computer c1 = new Computer();
		Computer c2 = new Computer();
		// 값 주입 방법1
		c1.cpu = "i7";
		c1.year = 2023;
		c1.company = "Samsung";
		c1.ram = 32;
		c1.graphic = "geforce RTX 4090";
		c2.cpu = "i5";
		c2.year = 2022;
		c2.company = "LG";
		c2.ram = 16;
		c2.graphic = "geforce GTX 1080 Turbo";
		System.out.println("전");
		System.out.println(c1.toString());
		System.out.println(c2.toString());
//		c1.showInfo();
//		c2.showInfo();
		c1.toString();
		c2.toString();
		c1.addRam(8);
		c1.addRam(16);
		
		c2.addRam(16);
		
		c1.removeRam(16);
		c1.removeRam(16);
		
		c2.removeRam(8);
		System.out.println("후");
//		c1.showInfo();
//		c2.showInfo();
		c1.toString();
		c2.toString();

	}

}
