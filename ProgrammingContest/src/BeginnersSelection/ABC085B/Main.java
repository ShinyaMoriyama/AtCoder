package BeginnersSelection.ABC085B;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 
 * @author morisin
 * https://atcoder.jp/contests/abs/tasks/abc085_b
 * 
 */
public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 枚数
		int N = sc.nextInt();
		
		// 餅
		Set<Integer> list = new HashSet<>();
		
		for(int i=0;i<N;i++) {
			list.add(sc.nextInt());
		}
		
		System.out.println(list.size());
		
	}

}
