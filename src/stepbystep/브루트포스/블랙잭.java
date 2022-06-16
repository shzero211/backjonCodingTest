package stepbystep.브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 블랙잭 {
	static boolean visit[];
	static int n=0;
	static int m=0;
	static int in=0;
	static int abs=Integer.MAX_VALUE;
public static void main(String[] args) throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st=new StringTokenizer(br.readLine());
	n=Integer.parseInt(st.nextToken());
	m=Integer.parseInt(st.nextToken());
	StringTokenizer stn=new StringTokenizer(br.readLine());
	int[] arr=new int[n];
	visit=new boolean[n];
	for(int i=0;i<n;i++) {
		arr[i]=Integer.parseInt(stn.nextToken());
	}
	dfs(arr,0,0);
	System.out.println(in);
	
}
public static void dfs(int[]arr,int sum,int len) {
	if(len==3) {
		if(Math.abs(sum-m)<abs&&sum<=m) {
			abs=Math.abs(sum-m);
			in=sum;
		}
		return;
	}
	for(int i=0;i<n;i++) {
		if(!visit[i]) {
			visit[i]=true;
			dfs(arr,sum+arr[i],len+1);
			visit[i]=false;
		}
	}
}
}
