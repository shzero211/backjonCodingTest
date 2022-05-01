package ³«¼­Àå;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class note15 {
	public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int m=Integer.parseInt(br.readLine());
	int[] T=new int[m];
	int[] P=new int[m];
	int[] dp=new int[m+1];
	StringTokenizer st;
	for(int i=0;i<m;i++) {
		st=new StringTokenizer(br.readLine());
		T[i]=Integer.parseInt(st.nextToken());
		P[i]=Integer.parseInt(st.nextToken());
	}
	for(int i=0;i<m;i++) {
		if(i+T[i]<=m) {
			dp[i+T[i]]=Math.max(dp[i]+P[i],dp[i+T[i]]);
		}
		dp[i+1]=Math.max(dp[i],dp[i+1]);
	}
	System.out.println(dp[m]);
	}
}
