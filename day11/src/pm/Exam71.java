package pm;

class FoolException extends Exception {

	}

public class Exam71 {
	
	    public void sayNick(String nick)throws FoolException {
	            if("fool".equals(nick)) {
	                throw new FoolException();
	            }
	            System.out.println("당신의 별명은 "+nick+" 입니다.");
	 
	        }
	    

	    public static void main(String[] args) {
	        Exam71 sample = new Exam71();
	        
	        try {
	        	sample.sayNick("fool"); //예외가 발생했지만 처리
		        sample.sayNick("genious"); // 잘 실행된다. 	
	        }catch(FoolException e) {
	        	System.out.println("FoolException 이 발생했습니다");
	        }
	        
	    }
	}