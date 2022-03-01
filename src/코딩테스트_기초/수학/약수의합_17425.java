package 코딩테스트_기초.수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 약수의합_17425 {
public static void main(String[] args) throws NumberFormatException, IOException {
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	StringBuilder sb=new StringBuilder();
	int[] arr=new int[1000000];
	int[] hap=new int[1000000];
	int t=Integer.parseInt(br.readLine());
	Arrays.fill(arr,1);
	//핵심로직(브루트포스문제가아닌 테스트 케이스로 푼문제)
	for(int i=2;i<arr.length;i++) {
		for(int j=1;i*j<arr.length;j++) {
			arr[i*j]+=i;
		}
	}
	
	for(int i=1;i<arr.length;i++) {
		hap[i]=hap[i-1]+arr[i];
	}
	//반복문팁
	while(t-->0) {
		int a=Integer.parseInt(br.readLine());
		sb.append(hap[a]).append("\n");
	}
	System.out.println(sb);
}

}
