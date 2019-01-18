package BeginnersSelection.ABC049C;

import java.util.Scanner;

/**
 * 
 * @author morisin
 * https://atcoder.jp/contests/abs/tasks/arc065_a 
 *
 */
public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		// 文字列
		String S = sc.next();
		int Slength = S.length();
		String ret;
		
		String divide[] = { "dreamer", "dream", "eraser", "erase" };

		boolean next = false;
		do {
			next = false;
			for(int i=0;i<divide.length;i++) {
				int leftcount = Slength - divide[i].length();
				if (leftcount>=0 && divide[i].equals(S.substring(leftcount,Slength))) {
					Slength=leftcount;
					next = true;
				}
			}
		}while(next);
				
		if(Slength==0) {
			ret = "YES";
		}else {
			ret = "NO";
		}
		System.out.println(ret);
	}
}
