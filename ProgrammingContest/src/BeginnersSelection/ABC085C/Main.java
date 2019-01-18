package BeginnersSelection.ABC085C;

import java.util.Scanner;

/**
 * 
 * @author morisin
 * https://atcoder.jp/contests/abs/tasks/abc085_c
 * 
 */
public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 枚数
		int N = sc.nextInt();
		// 合計金額
		int Y = sc.nextInt();
				
		for (int i=0;i<=N;i++) {
			for(int j=0;j<=N-i;j++) {
				int k = N-i-j;
				if((i+j+k == N) && (10000*i + 5000*j + 1000*k == Y)) {
					System.out.println(i+" "+j+" "+k);
					return;
				}
			}
		}
		System.out.println("-1 -1 -1");
		
	}

}
