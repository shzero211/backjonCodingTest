package stepbystep.백트래킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N과M2 {
	static int n;
	static int m;
	static int[] arr;
	static boolean[] visited;
	public static void dfs(int cnt,int idx) {
		if(cnt==m) {
			for (int v:arr) {
				System.out.printf(v+" ");
			}
			System.out.println();
			return;
		}
		for(int i=idx;i<n;i++) {
			if(!visited[i]) {
				visited[i]=true;
				arr[cnt]=i+1;
				dfs(cnt+1,i+1);
				visited[i]=false;
			}
		}
	}
public static void main(String[] args) throws IOException {
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
StringTokenizer st=new StringTokenizer(br.readLine());
n=Integer.parseInt(st.nextToken());
m=Integer.parseInt(st.nextToken());
arr=new int[m];
visited=new boolean[n];
dfs(0,0);
}
}
