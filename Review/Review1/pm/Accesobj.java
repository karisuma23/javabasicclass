package pm;

public class Accesobj {
    public int p = 3;     // 모든 사용자 접근 허용 
    protected int p2 = 4; // 같은 패키지인 경우만 접근 허용 / 상속을 받으면 다른 패키지도 접근 허용 
    int k = 2;            // default, 자기 자신과 같은 패키지에서만 접근 허용 
    private int i = 5;    // 자기 자신 클래스에서만 접근 허용 

    
}
