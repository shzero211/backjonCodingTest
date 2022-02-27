package baekjoon.기초;

import java.util.Scanner;

public class 팩토리얼 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c=sc.nextInt();

		if(c<b) {
			System.out.println(-1);
			return;
		}
		long mock=a;
		long gab=0;
		long count=0;
		while(mock>=gab) {
			mock+=b;
			gab+=c;
			count++;
		}
		System.out.println(count);
		return;

	}
}
