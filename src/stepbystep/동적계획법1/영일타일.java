package stepbystep.동적계획법1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 영일타일 {
static int dp[];
public static void main(String[] args) throws NumberFormatException, IOException {
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n=Integer.parseInt(br.readLine());
dp=new int[n+1];
System.out.println(fibo(n-1));
}
public static int fibo(int n) {
	if(dp[n]!=0) {
		return dp[n];
	}
	if(n==0) {
		return 1;
	}
	if(n==1) {
		return 2;
	}
	return dp[n]=fibo(n-1)+fibo(n-2)%15746;
}
}
