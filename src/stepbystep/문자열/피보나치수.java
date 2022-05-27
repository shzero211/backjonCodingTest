package stepbystep.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 피보나치수 {
	
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int m=Integer.parseInt(br.readLine());
	int[] fibo=new int[m+1];
	fibo[0]=0;
	fibo[1]=1;
	for(int i=2;i<=m;i++) {
		fibo[i]=fibo[i-1]+fibo[i-2];
	}
	System.out.println(fibo[m]);
	
}
}
