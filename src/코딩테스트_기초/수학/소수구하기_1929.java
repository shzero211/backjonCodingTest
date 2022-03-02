package 코딩테스트_기초.수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 소수구하기_1929 {
public static void main(String[] args) throws IOException {
	
	int[]arr=new int[1000001];
	Arrays.fill(arr,1);
	arr[0]=0;
	arr[1]=0;
	for(int i=2;i<1000001;i++) {
		for(int j=2;i*j<1000001;j++) {
			arr[i*j]=0;
		}
	}
	int count=0;
	BufferedReader br=new BufferedReader(new java.io.InputStreamReader(System.in));
	StringTokenizer st=new StringTokenizer(br.readLine());
	int n=Integer.parseInt(st.nextToken());
	int m=Integer.parseInt(st.nextToken());
	for(int i=n;i<=m;i++) {
		if(arr[i]!=0) {
			System.out.println(i);
		}
	}
	
}
}
