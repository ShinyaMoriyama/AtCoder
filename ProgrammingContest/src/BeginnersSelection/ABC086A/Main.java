package BeginnersSelection.ABC086A;

import java.util.Scanner;
/**
* https://atcoder.jp/contests/abs/tasks/abc086_a
*/
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		// スペース区切りの整数の入力
		int b = sc.nextInt();
		
		if(a*b%2!=0) {
			System.out.println("Odd");
		}else {
			System.out.println("Even");
		}

	}

}
