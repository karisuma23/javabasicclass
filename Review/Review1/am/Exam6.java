package am;

public class Exam6 {
    public static void main(String[] args) {
        
        // for(int i = 0; i < 10;){
        //     if (i%2 == 0){
        //        continue;
        //     }
        //       System.out.println(i);
        // }

        // for(;;){
        //     System.out.println("Hello World");
        // }
           // 369게임 만들기 
        for (int i = 1 ; i <= 100 ; i++) {

        int cnt = 0; //'짝'의 갯수
        int x = i/10;// 12 -> 1
        int y = i%10;// 12 -> 2

        if (x % 3 == 0)
            cnt++;
        if (y % 3 == 0) 
            cnt++;



        if (i % 10 == 0) {
            if(cnt ==2)
                System.out.println("짝짝");
            else if (cnt == 1)
                System.out.println("짝");
            else 
                System.out.println(i);

        } else {
            if(cnt ==2)
            System.out.print("짝짝\t");
        else if (cnt == 1)
            System.out.print("짝\t");
        else 
            System.out.print(i +"\t");

                        
            }
        }
    }
}


    
