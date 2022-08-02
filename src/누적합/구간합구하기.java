package 누적합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 구간합구하기 {
public static void main(String[] args) throws IOException {
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
StringTokenizer st=new StringTokenizer(br.readLine());
int n=Integer.parseInt(st.nextToken());
int m=Integer.parseInt(st.nextToken());
int[] arr=new int[n+1];
st=new StringTokenizer(br.readLine());
for(int i=1;i<=n;i++) {
	arr[i]=Integer.parseInt(st.nextToken())+arr[i-1];
}
for(int i=0;i<m;i++) {
	st=new StringTokenizer(br.readLine());
	int a=Integer.parseInt(st.nextToken());
	int b=Integer.parseInt(st.nextToken());
	System.out.println(arr[b]-arr[a-1]);
}


}
}