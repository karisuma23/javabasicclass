package pm;

import am.A;
public class Exam7 {
	/*
	 접근 제어자(지정자) modifier 는 클래스, 필드, 매서드, 생성자 등에게 
	 어떤 특징을 부여하는 문법 요소이다. 일종의 형용사로 생각할수 있다. 멋진 자동차  
	 사용 범위를 정의하는 역활을 한다. 
	 
	 
	 
	 public   >    protected   >   default(아무 표시가 없으면)    >  private

	public    : 같은 패키지 내의 모든 클래스 + 다른 패키지의 모든 클래스에서 접근 가능 
	protected : 동일 패키지 내의 모든 클래스 + 다른 패키지의 자식 클래스에서 접근 가능 
	default   : 동일 패키지 내의 모든 클래스 		
	private   :                       같은 클래스 에서만 사용 가능 		
		
			
			
			
	*/
	
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.a);
//		System.out.println(a.b);
//		System.out.println(a.c);
//		System.out.println(a.d);
		System.out.println();
		a.print(); 
		
	}
	

	}


