package j11_상속.factory;

public class FactoryMain1 {

	public static void main(String[] args) {
		
		/*
		 * 삼성팩토리 배열(크기 : 5)
		 * 1공장 ~ 5공장
		 * 
		 * 엘지팩터리 배열(크기 : 3)
		 * 1공장 ~ 3공장
		 * 
		 * 삼성 공장 가동
		 * 1공장을 가동합니다.
		 * ....
		 * 5 공장을 가동합니다
		 * 
		 * 삼성공장중지
		 * 1 공장을 중지합니다
		 * ....
		 * 5 공장을 중지합니다
		 * 
		 * 엘지공장가동
		 * 1 공장
		 */
		
//		Factory factory = new Factory();
		
		
		//------------------------------------------------------------//
		
		SamsungFactory[] samsungFactories = new SamsungFactory[5];
		samsungFactories[0] = new SamsungFactory(1);
		samsungFactories[1] = new SamsungFactory(2);
		samsungFactories[2] = new SamsungFactory(3);
		samsungFactories[3] = new SamsungFactory(4);
		samsungFactories[4] = new SamsungFactory(5);
		
		LGFactory[] lgFactories = new LGFactory[3];
		lgFactories[0] = new LGFactory(1);
		lgFactories[1] = new LGFactory(2);
		lgFactories[2] = new LGFactory(3);
		
		for(int i = 0; i < samsungFactories.length; i++) {
			samsungFactories[i].start();
		}
		
		System.out.println();
		for(int i = 0; i < samsungFactories.length; i++) {
			samsungFactories[i].stop();
		}
		System.out.println();
		for(int i = 0; i < lgFactories.length; i++) {
			lgFactories[i].start();
		}
		System.out.println();
		for(int i = 0; i < lgFactories.length; i++) {
			lgFactories[i].stop();
		}
					
	}

}
