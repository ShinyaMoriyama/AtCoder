package BeginnersSelection.ABC081A;

import java.util.Scanner;

/**
 * 
 * @author morisin
 * https://atcoder.jp/contests/abs/tasks/abc081_a
 * 
 */
public class Main {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		// '0'or'1'の連続文字列を入力
		String a = sc.next();
		String sa[] = a.split("");
		int sum=0;
		for(String c:sa) {
			if("1".equals(c)) {
				sum++;
			}
		}
		// '1'の合計を出力
		System.out.println(sum);

	}

}
