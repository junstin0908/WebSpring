package j07_반복;

public class DoubleWhile2 {

	public static void main(String[] args) throws InterruptedException {
		
		/*
		 * 2단 
		 * 2 x 1 = 2
		 * .....
		 * 2 x 9 = 18
		 * 
		 * 3단
		 * ...
		 * 
		 * 9단
		 * ...
		 * 9 x 9 = 81
		 */
		int i = 0;

		while (i < 8) {
			System.out.println((i+2) + "단");
			int j = 0;
			while (j < 9) {
				System.out.println((i+2) + " X " + (j+1) + " = " + (i+2) * (j+1));
				j++;
				Thread.sleep(300);
			}
			System.out.println();

			i++;

		}

		System.out.println("구구단 종료");

	}

}
