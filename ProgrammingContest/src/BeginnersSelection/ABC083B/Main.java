package BeginnersSelection.ABC083B;

import java.util.Scanner;

/**
 * 
 * @author morisin
 *
 * https://atcoder.jp/contests/abs/tasks/abc083_b
 * 
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 整数
		int N = sc.nextInt();
		// 以上
		int A = sc.nextInt();
		// 以下
		int B = sc.nextInt();
		// 総和
		int sum = 0;
		
		for (int i=1;i<=N;i++) {
			String[] value = Integer.toString(i).split("");
			int tempSum = 0;
			for (int j=0;j<value.length;j++) {
				int a = Integer.parseInt(value[j]);
				tempSum+=a;
			}
			if(tempSum<=B && tempSum>=A) {
				sum+=i;
			}
		}
		System.out.println(sum);
	}

}
