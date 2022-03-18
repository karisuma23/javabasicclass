package am;

public class Exam2 {
    // public static void main(String []args){
/*
   변수명 짓기
   1. 영문 대소문자와 한글도 사용할수는 있다.(한글 쓰지말자)         
   2. 특수문자는 밑줄과 $만 사용할수 있다.
   3. 숫자를 사용할수는 있지만 단 첫번재 글자로는 쓸수 없다. a1 1a(x)
   4. 이미 예약어로 지정된 단어는 사용할수 없다. int public....
   *. 영어 소문자로 시작하자, 한글은 쓰지말자
   *. 영어 단어를 2개상 사용할떄는 새로운 단어 첫 글자는 대문자로
      myClass, minVal, bestLoc, camel case

   상수명 짓기
   final int MY_DATA; 상수명은 대문자로 그리고 언더바 snake case
   

   변수의 생존 기간
*/

public static void main(String[]args){
   int value1 = 3; // 전역변수
   { 
     int value2 = 5; // 지역변수
     System.out.println(value1);
     System.out.println(value2);
   } //value2가 사라진다. 블록 안에서 선언을 했기 때문에...
   System.out.println(value1);
    //System.out.println(value2);

   // 형변환.

   float value5 = 1.2F; //실수형 float F를 붙여서 표현한다 
   double value6 = 1.5; // 실수형 double이 기본 실수형 자료형 
   
   double value7 = 5; // 자동타입변환 - int형보다 double형이 크기 떄문에 값이 저장된다

   System.out.println(value7);

   int value8 = (int)5.3; // 강제 형변환

   System.out.println(value8);
   long value9 = (long)10;

    //   형변환은 자바가 자동으로 수행하는 자동 형변환과 개발자가
    //   직접 형 변환을 수행해야 하는 수동 형변환이 있다. 크기가 작은
    //   자료형을 큰 자료형에 대입할떄는 어떤 손실도 발생하지 않는다.
    //   따라서 작은 자료형을 큰 자료형에 담으면 개발자가 변환 
    //   코드를 넣어주지 않아도 자바가 자동으로 타입을 변환해주는데 
    //   이것을 업캐스팅이라고한다. 

    // 자바에서 자료형의 크기를 순서대로 
    //  long / double > int / float > short / char > byte / boolean


//     1 int a = 3;
//     2      {
//               int b;
//                 b=5;
//     }
//       int c=7;
//  }
//  }

//  a = 생성 1 소멸 7  b = 생성 3 소멸 5  c = 생성 6 소멸 7 
}
}