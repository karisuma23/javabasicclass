package am;

public class Exam2 {

	public static void main(String[] args) {
/*
 연산자의 종류 산술 연산자 + - * / % 
 증감 연산자 ++ -- ex) i++ 
 비트 연산자 & (and) | (or) 
 비교 연산자 < > <= >= == != 
 대입 연산자 = += -= *= /= 
 삼항 연산자 (조건식) ? true : false
*/
     
		
//		int a = 1;
//		// a = a+ 1; a +=1;
//		// a++; // 후위형 
//		++a;   //  전위형 
//		System.out.println(a);
        
		
//		int a = 3; 
//		int b = ++a; // a값을 증가 시킨 후의 값을 b에 대입  
//		System.out.println(a); //3? - > 4
//	    System.out.println(b); //4 - > 4
//	    
//	    int c = 3;
//	    int d = c++;  // 증가하기 전 값의 c 가 먼저 d로 대입되고나서 c값이 하나 증가 
//	    System.out.println(c);  // 4 
//	    System.out.println(d);  // 3
        
		// 삼항 연산자 : 3개의 피연산자가 있는 연산자 
		//(조건식) ? true : false 
		
//		int a = (true) ? 1 : 2;
//		System.out.println(a);
//	    
//		int b = (a % 2 == 0) ? 10 : 20;
//		System.out.println(b);
		
//		int a = 2;
//		int b;
//		if (a % 2 == 0) {
//			b = 10; 
//		}else {
//			b =20;
//		}
//		System.out.println(b);
		
//		int value = 3;
//		System.out.println((value % 2 == 0) ? "짝수" : "홀수");
		
		
		
		int score = 85;
		// 삼항 연산자를 사용하여 90 이상이면 a , 80 b , 70 c,60 d 나머지 전부 f로 출력 
		char credit = (score >= 90) ? 'A' : (score >= 80) ?  'B' : (score >= 70) ? 'C' : (score >= 60) ? 'D' : 'F';
		System.out.println(credit);
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
	}

}
