package BeginnersSelection.ABC087B;

import java.util.Scanner;

/**
 * 
 * @author morisin
 * https://atcoder.jp/contests/abs/tasks/abc087_b
 * 
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 500円の枚数
		int A = sc.nextInt();
		// 100円の枚数
		int B = sc.nextInt();
		// 50円の枚数
		int C = sc.nextInt();
		// 合計金額
		int P = sc.nextInt();
		
		// 組み合わせ
		int sum = 0;
		
		for (int i=0;i<=A;i++) {
			for(int j=0;j<=B;j++) {
				for(int k=0;k<=C;k++) {
					if(500*i + 100*j + 50*k == P) {
						sum++;
					}
				}
			}
		}
		System.out.println(sum);
	}

}
