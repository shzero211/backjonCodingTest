package ³«¼­Àå;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class note7 {
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int count=0;
	int plus=1;
	int num=10;
	int N=Integer.parseInt(br.readLine());
	for(int i=1;i<=N;i++) {
		if(i%num==0) {
			num*=10;
			plus++;
		}
		count+=plus;
	}
	System.out.println(count);
}
}
