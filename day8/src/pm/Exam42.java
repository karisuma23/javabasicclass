package pm;

public class Exam42 {

	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new B();
		A a3 = new C();
		A a4 = new D();
		
	  //B b1 = new A(); //에러 
		B b2 = new B();
		B b3 = new C();
		B b4 = new D();
		
//		C c1 = new A();//에러 발생
//		C c2 = new B();//에러 발생
//		C c3 = new C();//에러 발생
//		C c4 = new D();//에러 발생
//		
//		D d1 = new A();
//		D d2 = new B();
//		D d3 = new C();
//		D d4 = new D();

	}

}
class A {}
class B extends A{}
class C extends B{}
class D extends B{}