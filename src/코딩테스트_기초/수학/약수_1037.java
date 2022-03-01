package 코딩테스트_기초.수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 약수_1037 {
public static void main(String[] args) throws IOException {
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int a=Integer.parseInt(br.readLine());
	int[] arr=new int[a];
	StringTokenizer st=new StringTokenizer(br.readLine());
	for(int i=0;i<a;i++) {
		arr[i]=Integer.parseInt(st.nextToken());
	}
	Arrays.sort(arr);
	System.out.println(arr[0]*arr[a-1]);
}
}
