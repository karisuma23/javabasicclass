package am;

public class Exam3 {
    /*
    연산자 + - * / 
    */
    public static void main(String[]args) {
        int a = 3;
        ++a; // 전위형 
         // 후위형 
        System.out.println(a);

        int b = 3;
        b++; // 후위형 b = b + 1; b = +=1 
        System.out.println(b);

        // // quiz a가 홀수인지 짝수를 출력 출력하세요 
        // a 는 홀수입니다 

        int c = 5;
        if(c%2==0){
            System.out.println("c는 짝수입니다");
        }else {
            System.out.println("c는 홀수입니다");
        }
        // quiz d가 3의 배수인지를 출력하세요 
        int d = 9;
        if (d%3 ==0){
            System.out.println("d는 3의 배수입니다.");
        }else {
            System.out.println("d는 3의 배수가 아닙니다.");
        }

          int q = 3;
          int w = 2;
          int e = 5;

          System.out.println(q ==w);
          System.out.println(q==e);

          String str1 = new String("안녕");
          String str2 = new String("안녕");
          
          System.out.println(str1 == str2);
          System.out.println(str1.equals(str2));
    }
}
