package j04_문자열;

public class StringBuilder2 {
	
	public static void main(String[] args) {
		String names = "김규원님, 김도형님, 김영필님, 김종관님";
		
		StringBuilder stringBuilder = new StringBuilder();
		
		/*
		 * subString 을 활용하여 stringBuilder 에 이름 넣기
		 * 결과물 : 김규원/김도형/김영필/김종관
		 */
		
		
		// alt1
//		stringBuilder.append(names.substring(0,3));
//		stringBuilder.append("/");
//		stringBuilder.append(names.substring(6,9));
//		stringBuilder.append("/");
//		stringBuilder.append(names.substring(12,15));
//		stringBuilder.append("/");
//		stringBuilder.append(names.substring(18,21));
		
		// alt2
		
		int index;
		index = names.indexOf("님");
		stringBuilder.append(names.substring(index - 3, index));
		stringBuilder.append("/");
		index = names.indexOf("님", index +1);
		stringBuilder.append(names.substring(index - 3, index));
		stringBuilder.append("/");
		index = names.indexOf("님", index +1);
		stringBuilder.append(names.substring(index - 3, index));
		stringBuilder.append("/");
		index = names.indexOf("님", index +1);
		stringBuilder.append(names.substring(index - 3, index));
		System.out.println(stringBuilder);
		
//		String address = "부산 부민구 부민동";
//		int index2;
//		
//		System.out.println(address.indexOf("부", 1));
		
		StringBuilder stringBuilder2 = new StringBuilder();
		stringBuilder2.append(names);
		int index2;
		index2 = stringBuilder2.indexOf("님");
		stringBuilder2.delete(index2, index2 + 3);
		System.out.println(stringBuilder2);
		index2 = stringBuilder2.indexOf("님");
		stringBuilder2.delete(index2, index2 +3);
		System.out.println(stringBuilder2);
		index2 = stringBuilder2.indexOf("님");
		stringBuilder2.delete(index2, index2 +3);
		System.out.println(stringBuilder2);
		index2 = stringBuilder2.indexOf("님");
		stringBuilder2.delete(index2, index2 +3);
	
		
		
		
		System.out.println(stringBuilder2);
		
		//김규원김도형김영필김종관
		
	}

}
