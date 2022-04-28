package ³«¼­Àå;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class note10 {
	static boolean[] visit;
	static int m;
	static int n;
public static void main(String[] args) throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st=new StringTokenizer(br.readLine());
	m=Integer.parseInt(st.nextToken());
	n=Integer.parseInt(st.nextToken());
	visit=new boolean[m+1];
	String str="";
	dfs(1,0,str);
}
public static void dfs(int idx,int len,String str) {
	if(len==n) System.out.println(str);
	for(int i=idx;i<=m;i++) {
		if(visit[i]==true)continue;
		visit[i]=true;
		dfs(i,len+1,str+String.valueOf(i)+" ");
		visit[i]=false;
	}
}
}
