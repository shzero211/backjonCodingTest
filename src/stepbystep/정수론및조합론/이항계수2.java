package stepbystep.�����й����շ�;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ���װ��2 {
static int A;
static int B;
static int arr[][];
//���丮�� dp�λ���
public static int factory(int n) {
	if(n==1) {
		return 1;
	}
	return n*factory(n-1);
}

public static int doub(int a,int b) {
	if(b==0||a==b) {
		return arr[a][b]=1;
	}else if(arr[a][b]!=0) {
		return arr[a][b];
	}
	return (arr[a][b]=doub(a-1,b-1)+doub(a-1,b))% 10007;
}
public static void main(String[] args) throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st=new StringTokenizer(br.readLine());
	A=Integer.parseInt(st.nextToken());
	B=Integer.parseInt(st.nextToken());
	arr=new int[A+1][B+1];
	System.out.println(doub(A,B));
}
}
