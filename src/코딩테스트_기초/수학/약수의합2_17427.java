package 코딩테스트_기초.수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class 약수의합2_17427 {
	//특정수 이하의 약수의 합은 패턴이있다
	//약수의 개수는 (특정수/원하는 약수)
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	long[] arr=new long[1000001];
	long[] hap=new long[1000001];
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
        int a=Integer.parseInt(br.readLine());
		System.out.println(hap[a]);
}
}
