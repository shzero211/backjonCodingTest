package stepbystep.동적계획법1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 피보나치수1 {
	static int cntf=0;
	static int cntl=0;
	static int[] f;
public static int  fib(int n) {
	if(n==1||n==2) {
		return 1;
	}
		return fib(n-1)+fib(n-2);
}
public static int fibonacci(int n) {
	f[1]=f[2]=1;
	for(int i=3;i<=n;i++) {
		cntl++;
		f[i]=f[1]+f[2];
	}
	return f[n];
	
}
public static void main(String[] args) throws NumberFormatException, IOException {
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 int n=Integer.parseInt(br.readLine());
 f=new int[n+1];
 fibonacci(n);
 
 System.out.printf("%d %d",fib(n),cntl);
} 
}
