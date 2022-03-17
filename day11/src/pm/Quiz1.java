//package pm;
//
//class ScoreException extends Exception{
//	
//} 
//public class Quiz1 {
//	
//	
//	
//public void OverException(int num) {
//		
//		try {
//			if (num > 100){
//				throw new ScoreException();
//				}
//			System.out.println("정상적인 값입니다");
//		}catch(ScoreException s) {
//			System.out.println("100점 초과");
//			}
//	}
//	
//public void minException(int num) {
//		
//		try {
//			if (num < 0 ){
//				throw new ScoreException();
//			}
//			
//			else if(0<num | num<100) {
//				System.out.println("정상적인 값입니다");
//			}
//		}catch(ScoreException s) {
//			System.out.println("음수 값 입력");
//			}
//	}
//
//	public static void main(String[] args) {
//		
//		Quiz1 score = new Quiz1();
//		score.OverException(102);
//		score.minException(-1);
//	}
//}
//		// 사용자 예외 클래스 정의하여 예외를 발생 시키시오 
//        // 예외 발생 조건 - 100점 초과 
////		      예외 발생 : 100점 초과
////		      0점 미만 :
////		      예외 발생 : 음수 값 입력
////		      
////		 정상 값 0 ~ 100
////         정상적인 값입니다.		 
	
package pm;

public class Quiz1 {

	public static void main(String[] args) {
		// 사용자 예외 클래스를 정의하여 예외를 발생 시키시오.
		// 예외 발생 조건 - 100점 초과  OverException
//		                                  예외 발생 : 100점 초과 
		
//		                  0점 미만  MinusException
//                        예외 발생 : 음수 값 입력
//                        
//                        정상 값 0~ 100 
//                        정상적인 값입니다.
		AA aa = new AA();
		
		try {
			aa.checkScore(85);
			aa.checkScore(110);
		} catch (MinusException | OverException e) {
			System.out.println(e.getMessage());
		}
		
//		정상적인 값입니다.
//		예외 발생 : 100점 초과
	}

}


class AA {
	void checkScore(int score) throws MinusException, OverException{
		if(score < 0) {
			throw new MinusException("예외 발생:음수값 입력");
		} else if (score >100) {
			throw new OverException("예외 발생:100점 초과");
		} else {
			System.out.println("정상적인 값입니다.");
		}
	}
}

class MinusException extends Exception {
	public MinusException(String message) {
		super(message);
	}
}

class OverException extends Exception {
	public OverException(String message) {
		super(message);
	}
}