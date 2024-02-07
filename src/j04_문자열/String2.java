package j04_문자열;

public class String2 {
	
	public static void main(String[] args) {
		String address = "부산광역시 서구 부민동";
		System.out.println(address.replace(' ', '-')); //replace 는 문자 
		
		String address2 = "부산광역시 연제구 연산동";
		String replaceAddress = address2.replaceAll(" 연", "홍"); // replaceAll 은 문자열 
		System.out.println(replaceAddress);
		
		/*
		 * 01033004698
		 * -> 번호 확인완료
		 * 
		 * 010-3300-4698
		 * -> 01033304698 번호 저장완료
		 * 
		 * 010/3300/4698
		 * -> 03033004698 번호 저장완료
		 * 
		 * 010-3300-466987
		 * -> 번호 올바르지 않습니다    11자 이상
		 * 
		 * 삼항연산자, replace 등을 사용
		 */
		
		String phoneNumber = "010-3300-4692";
		
		String phoneNumber2 = phoneNumber.replaceAll("[^0-9]", "");
		
		String result = phoneNumber2.length() == 11 ? phoneNumber2 + " 번호 저장 완료" 
				: phoneNumber2.length() > 11 ? "번호가 올바르지 않습니다 " 
						: phoneNumber2 + " 번호 저장 완료";
		
		System.out.println(result);
		
		String result2 = phoneNumber.length() == 11 ? "번호 저장 완료"
				: phoneNumber.length() != 13 ? "번호가 올바르지 않습니다"
				: phoneNumber.replaceAll("-", "").replaceAll("/", "");
				System.out.println(result2 + " 번호 저장 완료");			
		
		String phoneNumber3 = "010/3300/4698, 010/1234/5678";
		// 011-3300-4698/010-1234/5678
		
		phoneNumber3 = phoneNumber3.replaceAll("010", "011")
									.replaceAll("/", "-")
									.replaceAll(", " , "/");
		
		System.out.println(phoneNumber3);
		
		
		
	}

}
