package stepbystep.백트래킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N과M4 {
static int n;
static int m;
static int[] arr;
static boolean[] visited;
static StringBuilder sb;
public static void dfs(int cnt,int idx) {
	if(cnt==m) {
		for(int var :arr) {
			sb.append(var+" ");
		}
		sb.append("\n");
		return;
	}
	for(int i=idx;i<n;i++) {
		arr[cnt]=i+1;
		dfs(cnt+1,i);
	}
}
public static void main(String[] args) throws IOException {
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
StringTokenizer st=new StringTokenizer(br.readLine());
n=Integer.parseInt(st.nextToken());
m=Integer.parseInt(st.nextToken());
arr=new int[m];
sb=new StringBuilder();
dfs(0,0);
System.out.println(sb.toString());
}
}
