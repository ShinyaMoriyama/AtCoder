package contest;

import java.util.Arrays;
import java.util.List;

public class Test1 {
	public static void main(String args[]){
		System.out.println("Hello world again");
		
		int A[] = {3,1,2,4,3};
		
        int ret = 0;

		int sum = 0;
		for (int i=0;i<A.length;i++) {
			sum+=A[i];
		}
		
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
