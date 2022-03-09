package pm;

import java.util.Arrays;

public class Exam7 {

	public static void main(String[] args) {
//		
//		int [] arr = new int[100];
//		for(int i = 0; i < arr.length;i++) {
//			 arr[i] = i+1;
//			
//		}
//		System.out.print(Arrays.toString(arr));
		
		
		int []arr1 = {5,4,3,2,1};
		int [] arr2 = new int[arr1.length];
		
		for(int i =0; i < arr1.length;i++) {
			 arr2[i] = arr1[arr1.length-1-i]; // 배열 선언시 인덱스는 범위가 1이 아닌 0부터 시작함으로 5개를 선언시 0~4 총 4개가된다
			                                  // 배열의 갯수를 length로 가져오게되면 0이 아닌 1부터 시작한 범위값을 가져오게 됨으로
			                                  // 배열명.length-1 을 선언해야 범위를 넘지 않고 마지막 요소값을 불러올수가 있다. 
			                             
			
		}
		 System.out.println(Arrays.toString(arr2));
		
	}

}
