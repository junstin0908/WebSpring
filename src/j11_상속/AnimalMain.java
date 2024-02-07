package j11_상속;

public class AnimalMain {

	private static final Animal Tiger = null;

	public static void main(String[] args) {
//		
//		Animal animal = new Animal();
//		Human human = new Human();
//		Tiger tiger = new Tiger();
//		
//		animal.move();
//		human.move();
//		tiger.move();
//		
//		animal.run();
//		human.run();
//		tiger.run();
//		
//		human.handling();
//		
		Human human = new Human();
		Tiger tiger = new Tiger();
		human.handling();
		human.move();
		
		Animal[] animal = {human, tiger};
	}

}
