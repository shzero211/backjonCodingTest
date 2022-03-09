package 브루트포스N과M;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class N과M_15649 {
	static boolean[] visited;
	static int[] arr;

public static void main(String[] args) throws IOException {
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st=new StringTokenizer(br.readLine());
	int n=Integer.parseInt(st.nextToken());
	visited=new boolean[n];
	
	int m=Integer.parseInt(st.nextToken());
	arr=new int[m];
	dfs(n,m,0);
}
public static void dfs(int n,int m,int depth) {
	if(depth==m) {
		for(int num:arr) {
			System.out.print(num+" ");
		}
		System.out.println();
		return;
	}
	
	for(int i=0;i<n;i++) {
		if(!visited[i]) {
			visited[i]=true;
			arr[depth]=i+1;
			dfs(n,m,depth+1);
			visited[i]=false;
		}
		
		
	}
}
}
