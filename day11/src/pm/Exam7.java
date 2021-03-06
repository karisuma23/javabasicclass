package pm;


class FoolException extends Exception {
}
	

	public class Exam7 {
	    public void sayNick(String nick) {
	        try {
	            if("fool".equals(nick)) {
	                throw new FoolException();
	            }
	            System.out.println("당신의 별명은 "+nick+" 입니다.");
	        }catch(FoolException e) {
	            System.err.println("FoolException이 발생했습니다.");
	        }
	    }

	    public static void main(String[] args) {
	        Exam7 sample = new Exam7();
	        sample.sayNick("fool"); //예외가 발생했지만 처리
	        sample.sayNick("genious"); // 잘 실행된다. 
	    }
	}
	
	