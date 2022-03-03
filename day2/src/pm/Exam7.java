package pm;

import java.util.Scanner;

public class Exam7 {

	public static void main(String[] args) {
//1 1부터 100 까지의 자연수 중 3의 배수의 합을 계산하시오
//		int sum = 0;
//        for(int i = 3; i <= 1000;  i++){
//		   if(i%3 ==0) {			   
//		   }
//        	sum = sum + i; 
//        		
//        	}
//               System.out.println(sum);
//               
//2 for 문을 사용하여 아래와 같이 출력하시오
//		*
//		**
//		***
//		****
//		*****
//		
//	   for(int i = 0; i <= 5; i++) {
//			for(int j = 0; j < i; j++) {
//			System.out.print("*");
//		}
//			System.out.println();
//      }
//		
//	   for(int i = 5; i>=0; i--) {
//			for(int j = 0; j < i ; j++) {
//			System.out.print("*");
//	} 
//			System.out.println();
//}     
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number :");
		int row = sc.nextInt();

		for(int i= 0; i<row; i++){ 
			for(int j=1; j<row-i; j++){
				System.out.print(" ");
				
		  } for(int j=0; j<i*2+1; j++){
				System.out.print("*");
			}		
				System.out.println(); 
	}
//	
//	   int[] scores = {70,60,55,75,95,90,80,80,85,100};
//	   int sum = 0;
//	   int max = 0;
//	   int min = scores[0];
//	   double avg = 0;
	   
//	  for(int score:scores) {
//		  sum += score;
//		  avg = sum / scores.length;
//		  if(score > max ) {
//			  max = score;
//		  }
//		  if(score < min) {
//			  min = score;
//		  }
//		  
//		  
//		  
//	  }
//	    System.out.println("합계"+sum);
//	    System.out.println("평균"+avg);
}
	
}

