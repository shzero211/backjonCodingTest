package BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ¼û¹Ù²ÀÁú {
	static int[] arr=new int[100001];
	static int n;
	static int m;
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	m=sc.nextInt();
	if(n==m) {
		System.out.println(0);
	}else {
		bfs(n);
	}
}
public static void bfs(int num) {
	Queue<Integer> q=new LinkedList<Integer>();
	q.add(num);
	arr[num]=1;
	while(!q.isEmpty()) {
	int temp=q.poll();
	for(int i=0;i<3;i++) {
		int next;
		if(i==0) {
		next=temp+1;
		}else if(i==1) {
			next=temp-1;
		}else {
			next=temp*2;
		}
		if(next==m) {
			System.out.println(arr[temp]);
			return;
		}
		
		if(next>=0&&next<arr.length&&arr[next]==0) {
			q.add(next);
			arr[next]=arr[temp]+1;
		}
	}
	}
	
}
}
