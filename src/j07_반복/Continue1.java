package j07_반복;

public class Continue1 {

	public static void main(String[] args) {
		
		/*
		 * 0 ~ 9 까지 출력하는 반복문 작성
		 * 
		 * 짝수
		 * 0
		 * 1
		 * 짝수
		 * 2
		 * 3
		 * 짝수
		 * 4
		 * 5
		 * 
		 */
		
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				System.out.println("continue 전");
				continue;
			}
			System.out.println(i);
		}

		System.out.println();

		/*
		 * continue 를 사용하여 1부터 129까지의 수 중 홀 수의 합을 구하시오
		 */
		int result = 0;
		for (int j = 0; j < 130; j++) {
			if (j % 2 == 0) {
				continue;
			}
			result = result + j;

		}
		System.out.println(result);

		// ----------------------------------------------------------//
		int k = 0;
		int sum = 0;
		while (k < 129) {
			int l = k + 1;
			if (l % 2 == 0) {
				k++;
				continue;
			}
				
			sum += l;
			k++;
//			System.out.println(l);
		}
		System.out.println(sum);

	}

}
