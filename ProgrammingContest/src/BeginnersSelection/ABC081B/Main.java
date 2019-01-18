package BeginnersSelection.ABC081B;

import java.util.Scanner;

/**
 * 
 * @author morisin
 * https://atcoder.jp/contests/abs/tasks/abc081_b
 * 
 */
public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);

		// 回数の入力
		int N = sc.nextInt();
		int A[] = new int[200];
		int times = 0;
		
		for(int i=0;i<N;i++) {
			int input = sc.nextInt();
			A[i]=input;
		}

		boolean end = false;
		while(!end) {
			for(int i=0;i<N;i++) {
				if(A[i]%2==0) {
					A[i]=A[i]/2;
				}else {
					end = true;
					break;
				}
			}
			if(!end) {
				times++;
			}
		}
		System.out.println(times);

	}

}
