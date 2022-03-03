package am;

public class Exam3 {
  public static void main(String[]args) {
	  // 제어문 - 조건문 - if,          switch , (삼항연산자)
	  //      - 반복문 - while, for,  do~while 
//	  
//	  if (5 > 3) {
//		  System.out.println("출력1");
//	  }
//	   
//	  int a = 3;
//	  if (a == 3) {
//		  System.out.println("출력2");
//	  }
	  
	  
//	  if (5 > 3) {
//		  System.out.println("안녕");
//		  System.out.println("방가");
//	  }
	  
//	  if (5 > 3) {//괄호를 생략 가능하지마 언제나 괄호를 사용하자  괄호를 안넣으면 
//		  System.out.println("안녕");} - 해당 부분까지만 자동으로 괄호가 적용된다 
//		  System.out.println("방가"); - 해당 부분은 if 문과는 관계없이 출력문만 독립적으로 작동한다 
	  
	  
	  
	  
//	  if(5>3) {
//		  System.out.println("실행");
//	  } else {
//		  System.out.println("실행2");
//	  }
	  
	  
	  int a = 85;
	  if (a >= 90) {
		  System.out.println("A학점");
	  }
	  else if (a >= 80) {
		  System.out.println("B학점");
	  }
	  else if (a>= 70) {
		  System.out.println("C학점");
	  }
	  else if (a>= 60) {
		  System.out.println("D학점");
	  }
	  else {
		  System.out.println("F학점");
	  }
	  
	  
  }
}
