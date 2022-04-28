package ³«¼­Àå;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class note12 {
	static int[] nums;
	static boolean[] visit;
	static int n;
	static int m;
public static void main(String[] args) throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st=new StringTokenizer(br.readLine());
	n=Integer.parseInt(st.nextToken());
	m=Integer.parseInt(st.nextToken());
	nums=new int[n];
	visit=new boolean[n];
	st=new StringTokenizer(br.readLine());
	for(int i=0;i<n;i++) {
		nums[i]=Integer.parseInt(st.nextToken());
	}
	Arrays.sort(nums);
	String str="";
	
	dfs(0,0,str);
	
}
public static void dfs(int idx,int len,String str) {
	if(len==m) {
		System.out.println(str);
		return;
	}
	
	for(int i=0;i<n;i++) {
		if(visit[i]==true)continue;
		visit[i]=true;
		dfs(i,len+1,str+String.valueOf(nums[i])+" ");
		visit[i]=false;
	}
}
}
