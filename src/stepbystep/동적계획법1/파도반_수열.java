package stepbystep.동적계획법1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 파도반_수열 {
static Long[] dp;

public static void main(String[] args) throws NumberFormatException, IOException {
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int m=Integer.parseInt(br.readLine());

for(int i=0;i<m;i++) {
	int k=Integer.parseInt(br.readLine());
	dp=new Long[k+1];
	System.out.println(fibo(k-1));
}
}

public static Long  fibo(int k) {
	
	if(k==0||k==1||k==2) {
		
		return dp[k]=(long)1;
	}
	if(dp[k]!=null) {
		return dp[k];
	}
	return dp[k]=fibo(k-3)+fibo(k-2);
	
}
}
