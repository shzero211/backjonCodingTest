package 코딩테스트_기초.수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 소수찾기_1978 {
	//에라토스테네스의 체 문제=>소수를 찾을 때 체를 거르듯이 하는방법
	//약수문제와 같은 풀이인  미리 인덱스를 기준으로 소수인지 적어놓고 답을 찾는 테스트 케이스문제
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int[] arr=new int[1001];
		int a=Integer.parseInt(br.readLine());
		int count=0;
		Arrays.fill(arr,1);
		arr[0]=0;
		arr[1]=0;
		for(int i=2;i<=1000;i++) {
			for(int j=2;i*j<=1000;j++) {
				arr[i*j]=0;
			}
		}
		StringTokenizer st=new StringTokenizer(br.readLine());
		while(a-->0) {
			if(arr[Integer.parseInt(st.nextToken())]==1) {
				count++;
			}
		}
		System.out.println(count);
	}

}
