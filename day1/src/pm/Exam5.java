package pm;

public class Exam5 {
	public static void main(String[]args) {
		//변수의 범위...
		// 변수의 생존 기간은 메모리에 변수가 만들어진 이후 사라지기까지의
		// 기간으로 볼수있다. 자바는 개발자가 직접변수를 생성한다. 하지만
		// 변수를 삭제하는 작업은 자바가 알아서 한다. 변수를 삭제하는 주체가 
		// 개발자가 아니기 때문에 메모리에서 변수가 사라지는 시점을 이해하는 
		// 것은 중요하다.
		// 만약 사라진 변수값을 읽거나 값들 대입하려고 하면 문법 오류가 발생한다.
			    int value1 = 3; // 변수  value1가 생성되는 지점
			    {
			    	int value2 = 5; // 변수 value2가 생성되는 지점
			    	System.out.println(value1);
			    	System.out.println(value2);
			    }// 변수 value2가 사라지는 지점 
		    	    System.out.println(value1);
		    	    //System.out.println(value2);
		    	 
}// 변수value1이 사라지는 지점

}
