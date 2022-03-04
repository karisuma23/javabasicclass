package pm;

import java.util.Random;
import java.util.Scanner;

public class Exam6 {

	public static void main(String[] args) {
		   
        // 3자리의 양의 정수값(100 ~999)을 읽는 프로그램을 작성하세요
        // 입력한 값이 3의 양의 정수가 아니면 다시 입력하게 하세요. 
     Scanner sc = new Scanner(System.in);
//     int a;    
//           do {
//        	   System.out.print("숫자  입력 :");  
//        	   a = sc.nextInt();
//         	   
//           }
//           while(a < 100 || a > 999);
//           
//           System.out.println("입력한 값은" + a +"입니다");
           
           
//           숫자 맞추기 게임 
//             10부터 99사이의 숫자를 맞추세요 // 난수 발생 
//             어떤 숫자일까요?
//             더큰 숫자입니다. 
     
           Random rand = new Random();
           int no = 10 + rand.nextInt(90);		
           int n;
           do {
        	   System.out.print("숫자를 입력하세요 : ");
        	   n = sc.nextInt(); 
        	   if(no > n) {
        		   System.out.println("더 큰 숫자입니다.\n");
        	   }else if(no < n) {
        		   System.out.println("더 작은 숫자입니다.\n");
        	   }
           }while(no != n);
           System.out.println("정답입니다");
        	   
	}
}
