package contest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test1 {
	public static void main(String args[]){
		System.out.println("Hello world again");
		
		int A[] = {3,1,2,4,3};
		List<Integer> list = new ArrayList<>();
		for(int a:A) {
			list.add(a);
		}
		Collections.reverse(list);
		
		for (Integer a:list) {
			System.out.println(a);
			System.out.println((int)a);
		}
		
        int ret = 0;

		int sum = 0;
		for (int i=0;i<A.length;i++) {
			sum+=A[i];
		}
		
		Arrays.sort(A);
		
		int left = 0;
		int right = sum;
		int tmpDifferent = 0;
		int different = sum;
		for (int j=0;j<A.length;j++) {
			left += A[j];
			right -= A[j];
			if(left - right<0) {
				tmpDifferent = right - left;
			}else {
				tmpDifferent = left - right;
			}
			if (tmpDifferent < different) {
				different = tmpDifferent;
			}
		}
		ret = different;
		
		System.out.println(ret);
		
	}
	
	
}
