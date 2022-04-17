package 큐와그래프_1260;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DFS와BFS {
	static int[][] arr;
	static boolean[] checked;
	static int a;
	static int b;
	static int c;
public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 a=sc.nextInt();
 b=sc.nextInt();
 c=sc.nextInt();
 arr=new int[a+1][a+1];
 checked=new boolean[a+1];
 for(int i=0;i<b;i++) {
	 int s1=sc.nextInt();
	 int s2=sc.nextInt();
	 arr[s1][s2]=arr[s2][s1]=1;
 }
 dfs(c);
 checked=new boolean[a+1];
 System.out.println();
 bfs(c);
 
 
}
public static void dfs(int start) {
	checked[start]=true;
	System.out.print(start+" ");
	for(int j=1;j<=a;j++) {
		if(checked[j]==false&&arr[start][j]==1) {
			dfs(j);
		}
	}
}
public static void bfs(int start) {
	Queue<Integer> q=new LinkedList<Integer>();
	q.add(start);
	checked[start]=true;
	while(!q.isEmpty()) {
		
		int k=q.poll();
		System.out.print(k+" ");
		for(int i=1;i<=a;i++) {
			if(checked[i]==false&&arr[k][i]==1) {
				q.add(i);
				checked[i]=true;
			}
		}
	}
}
}
