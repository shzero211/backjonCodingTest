package 브루트포스;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 리모콘_1107 {
	//완전탐색문제(브루트포스)
	//핵심은 boolean 생성과 broken[]안의 센스
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int target=sc.nextInt();
	int m=sc.nextInt();
	boolean [] broken=new boolean[10];
	for(int i=0;i<m;i++) {
		int n=sc.nextInt();
		broken[n]=true;
	}
	//문제 잘읽기 100번 부터 시작
	int result=Math.abs(target-100);
	for(int i=0;i<=999999;i++) {
		String str=String.valueOf(i);
		int len=str.length();
		boolean isBreak=false;
		for(int j=0;j<len;j++) {
			if(broken[str.charAt(j)-'0']) {
				isBreak=true;
				break;
			}
		}
		if(!isBreak) {
			//최소횟수는 절대값 차이가 최소라는 의미와 같음 
			int min=Math.abs(target-i)+len;
			result=Math.min(result,min);
		}
	}
	System.out.println(result);
}
}
