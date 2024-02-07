package j03_연산자;

public class Operation5 {

	public static void main(String[] args) {
		String str = "안녕";
		System.out.println(str.length());
		
		/*
		 * 변수명 : pw
		 * 비밀번호가 8 ~16 자리가 되어야 함
		 * 8 ~ 16 을 충족하면 비밀번호가 확인되었습니다
		 * 비밀번호 자리수를 맞춰주세요
		 * 
		 * 비밀번호 미작성 시 비밀번호를 입력하세요
		 */
		
		String pw = "hjbkjbjbkjmdfgfd";
		
		String result;
		
		result = ((pw.length() >= 8 && pw.length() <= 16) ) ? "비밀번호가 확인 되었습니다" 
				: pw.length() == 0 ? "비밀번호를 입력하세요" : "비밀번호 자리수를 맞춰주세요";
		//---------------------------------------------------------------------------------------//
		if (pw.length() >= 8 && pw.length() <= 16) {
			System.out.println("비밀번호가 확인 되었습니다");
		} else if (pw.length() == 0) {
			System.out.println("비밀번호를 입력하세요");
		} else {
			System.out.println("비밀번호 자리수를 맞춰주세요");
		}

		
		
		//---------------------------------------------------------------------------------------//
		int pwCount = pw.length();
		
		result = ((pwCount >7 && pwCount < 17) ) ? "비밀번호가 확인 되었습니다" 
				: pwCount < 8 || pwCount > 16 ? "비밀번호 자리수를 맞춰주세요" 
				: pwCount == 0 ? "비밀번호를 입력하세요 "
				: "404";
				
				
				System.out.println(result);
				System.out.println(pw.length());
				System.out.println(pwCount);
	}

}
