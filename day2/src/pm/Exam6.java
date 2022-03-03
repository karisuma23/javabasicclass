package pm;

import java.util.Scanner;

public class Exam6 {

	public static void main(String[] args) {
		 	
		  // import 방법  crtl + shift + o 여러개를 모두 import
		  //            ctrl + space     해당 클래스만 import  
		                          
//	      Scanner sc = new Scanner(System.in);
//	      System.out.print("월을 입력하세요(1~12)>");
//	      int mon = sc.nextInt();
//	      
//	      switch(mon) {
//	      case 1 : System.out.println("jan");break;
//	      case 2 : System.out.println("feb");break;
//	      case 3 : System.out.println("mar");break;
//	      case 4 : System.out.println("apr");break;
//	      case 5 : System.out.println("may");break;
//	      case 6 : System.out.println("jun");break;
//	      case 7 : System.out.println("jul");break;
//	      case 8 : System.out.println("aug");break;
//	      case 9 : System.out.println("sept");break;
//	      case 10 : System.out.println("oct");break;
//	      case 11 : System.out.println("nov");break;
//	      case 12 : System.out.println("dec");break;
//	      default : 
//	    	        System.out.println("1~12 사이의 숫자를 입력하세요");
//	      }
              
	      
// 반복문 for
//  실행 구문을 반복적으로 수행하는 반복 제어문으로 일반적으로 반복 횟수가 정확할때
//  주로 사용된다. 즉, for문의 구문을 보면 몇번 반복할지 유추할수 있어야한다. 
	      
//for(start; stop; step) {	
//}
//
//         for (int i = 0; i <= 10; i++ ) {
//        	 System.out.println(i);
//         }
//          int j; 
//          for (j= 0; j <= 10; j++ ) {
//        	 System.out.println(j);
//         }
          
//          for(int i = 0, j = 0 ; i < 10 ; i++, j++) {
//        	  System.out.println(i + j + "");
//          }
		    
		    // for 문에서의 무한루프 
//            for (int i = 0;     ; i++) {
//            	System.out.println(i);
//            }
//            
//            for(;;) {
//            	System.out.println("무한루프");
//            }
		
		      //이중 for문 
//		        for(int i = 1; i <= 3; i++) {
//		        	for(int j = 1; j <= 5; j++) {
//		        		System.out.println(i + "일차" + j + "교시");
//		        	}
//		        }
		        
		        
		        // for each
		        // array 배열 
		        
		        //String name = "홍길동"; 변수 1개에 데이터에 1개 저장
//		        String[] names = {"홍길동","이몽룡","성춘향"};
//		        int [] numbers = {1,2,3,4,5};
//		        
//		        for(String name : names) {
//		        	System.out.println(name);
//		        }
//		         
//		        for(int number : numbers) {
//		        	System.out.println(number);
//		        }
//		        
		           Scanner sc = new Scanner(System.in);
		           
		           int sum = 0;
		           int value;
		       do {  
		    	     System.out.print("Enter the value:");
		        	 value = sc.nextInt();
		        	 sum += value;
		        	 System.out.println("입력받은 값은 :" + sum + " 입니다");
		        	 
		        }while(value < 100); 
		        	System.out.println("프로그램이 종료되었습니다");
		        }
		        	
		        
	                    
	}
		       

 


