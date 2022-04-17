package ºê·çÆ®Æ÷½º_Àç±Í;

import java.util.Scanner;

public class Åð»ç_14501 {
	static int[] time;
	static int[] pay;
	static int max=0;
	static boolean[] visited;
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int m=sc.nextInt();
	time=new int[m];
	pay=new int[m];
	visited=new boolean[m];
	for(int i=0;i<m;i++) {
		time[i]=sc.nextInt();
		pay[i]=sc.nextInt();
	}
	maxFind(0,0,0);
	System.out.println(max);
	
}

public static void maxFind(int idx,int hap,int payed) {
	if(time.length-1<=idx) {
		if(time.length==idx) {
			if(max<hap) {
				max=hap;
				
			}
			return;
		}
		if(max<hap-payed) {
			max=hap-payed;
		}
		return;
	}
	
	for(int i=idx;i<time.length;i++) {
		if(!visited[i]) {
			visited[i]=true;
			maxFind(idx+time[i], hap+pay[i],pay[i]);
			visited[i]=false;
		}
	}
}
}
