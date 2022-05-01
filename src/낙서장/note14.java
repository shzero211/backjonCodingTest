package ³«¼­Àå;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class note14 {
	static String[] arr;
	static boolean[] visited;
	static int L;
	static int C;
public static void main(String[]args) throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st=new StringTokenizer(br.readLine());
	L=Integer.parseInt(st.nextToken());
	C=Integer.parseInt(st.nextToken());
	arr=new String[C];
	st=new StringTokenizer(br.readLine());
	for(int i=0;i<C;i++) {
		arr[i]=st.nextToken();
	}
	visited=new boolean[C];
	Arrays.sort(arr);
	StringBuilder sb=new StringBuilder();
	dfs(0,sb);
}
public static void dfs(int idx,StringBuilder str) {
	if(str.length()==L&&check(str.toString())) {
		System.out.println(str.toString());
		return;
	}
	
	for(int i=idx;i<C;i++) {
		if(visited[i]) continue;
		visited[i]=true;
		dfs(i,str.append(arr[i]));
		str.deleteCharAt(str.length()-1);
		visited[i]=false;
	}
}

public static boolean check(String str) {
	int cntm=0;
	int cntz=0;
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
			cntm++;
		}else {
			cntz++;
		}
	}
	
	if(cntm>=1&&cntz>=2)return true;
	
	return false;
}
}
