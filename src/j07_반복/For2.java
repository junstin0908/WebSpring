package j07_반복;

public class For2 {
	
	public static void main(String[] args) {
		
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
		
		for (int i = 0; i < 8; i++) {
			System.out.println((i + 2) + " 단");
			for (int j = 0; j < 9; j++) {
				System.out.println((i + 2) + "X" + (j + 1) + "=" + (i + 2) * (j + 1));
			}
		}

	}

}
