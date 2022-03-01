package 코딩테스트_기초.수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class 약수의합2_17427 {
	//특정수 이하의 약수의 합은 패턴이있다
	//약수의 개수는 (특정수/원하는 약수)
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int a=Integer.parseInt(br.readLine());
	long sum=0;
	for(int i=1;i<=a;i++) {
		sum+=(a/i)*i;
	}
	System.out.println(sum);
}
}
