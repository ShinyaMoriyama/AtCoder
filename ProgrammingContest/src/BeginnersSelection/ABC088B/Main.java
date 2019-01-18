package BeginnersSelection.ABC088B;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author morisin
 * https://atcoder.jp/contests/abs/tasks/abc088_b
 * 
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// カードの数
		int N = sc.nextInt();

		// カード
		List<Integer> listA = new ArrayList<>();
		
		// カードの入力
		for(int i=0;i<N;i++) {
			listA.add(sc.nextInt());
		}
		
		// 降順にソート
		Collections.sort(listA);
		Collections.reverse(listA);
		Integer[] reversedA = listA.toArray(new Integer[N]);
		
		int alice = 0;
		int bob = 0;
		
		for (int i=0;i<N;i++) {
			if (i%2==0) {
				alice+=reversedA[i];
			}else {
				bob+=reversedA[i];
			}
		}
		System.out.println(alice - bob);
	}

}
