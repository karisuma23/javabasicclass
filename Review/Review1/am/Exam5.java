package am;

public class Exam5 {
    public static void main(String[]args){
/* for문으로 0 1 2 3 4 5
    
// */  int [] arr = {0,1,2,3,4,5};
//    for(int i = 0; i<arr.length; i++){
//        System.out.print(arr[i] + " ");
//    }      
//    System.out.println();

//     int a =0;
//     while(a <6){
//         System.out.print(a + " ");
//         a++;
//     }
      
//     // 구구단을 출력하세요 
//     for(int i = 2; i < 10;i++){
//         for(int j = 1; j < 10;j++){
//             System.out.println(i + " * " + j + " = " + (i*j));
//         }
            
//     }
    int a = 2;
    int b = 1;   
    while(a < 10){
        b = 1;
       while(b < 10){  
        System.out.println(a + " * " + b + " = " + (a*b));
        b++;
       }
        a++;
    }

    for(int i = 1; i < 6; i++){
        for(int j = 1; j <= i; j++){
            System.out.print("*");    
        }
           System.out.println();
    }

    }

    
}
