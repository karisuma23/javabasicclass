package pm;

import am.A;

public class C {

	public void print(){
		A a = new A();
		
		System.out.println(a.a); // public    : 다른패키지 내에서도 사용가능하다 
//		System.out.println(a.b); // protected : 동일한 패키지내에서만 사용가능
//		System.out.println(a.c); // default   : 동일한 패키지내에서만 사용가능
//		System.out.println(a.d); // private   : 접근 지정자로 지정된 필드는 접근 불가 
		 

	}

}
