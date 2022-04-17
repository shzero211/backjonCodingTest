package 브루트포스;

import java.util.Scanner;

public class 리모콘RE {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int target=sc.nextInt();
	int m=sc.nextInt();
	boolean[] broken=new boolean[10];
	
	for(int i=0;i<m;i++) {
		int n=sc.nextInt();
		broken[n]=true;
	}
	
	//오로지 +,-로 목표에 도달할경우 횟수
	int result=Math.abs(target-100);
	
	//버튼이 눌러지는 모든 경우
	for(int i=0;i<=999999;i++) {
		String str=String.valueOf(i);
		//누르는 번호 길이
		int len=str.length();
		
		boolean isbreak=false;
		for(int j=0;j<len;j++) {
		if(broken[str.charAt(j)-'0']==true) {
			isbreak=true;
			break;
		}
		}
		if(isbreak==false) {
			int min=Math.abs(target-i)+len;
			result=Math.min(min,result);
		}
	}
	System.out.println(result);
	
}
}
