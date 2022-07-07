package stepbystep.�����й����շ�;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ���װ�� {
	static int n;
	static int k;
private static int factory(int num) {
	if(num==0)return 1;
	return num*factory(num-1);
}
private static int factorysol(int n,int k) {
	return factory(n)/(factory(k)*factory(n-k));
}

private static int combination(int n,int k) {
	if(n==k||k==0) {
		return 1;
	}
	return combination(n-1,k-1)+combination(n-1,k);
}

static int[][] dp;
private static int memory(int a,int b) {
	if(dp[a][b]>0) return dp[a][b];
	if(a==b||b==0) {
		return dp[a][b]=1;
	}
	return dp[a][b]=memory(a-1, b-1)+memory(a-1, b);
}
public static void main(String[] args) throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st=new StringTokenizer(br.readLine());
	n=Integer.parseInt(st.nextToken());
	k=Integer.parseInt(st.nextToken());
//Ǯ�̹��3����
//���丮�� ���
System.out.println(factorysol(n,k));

/*
//������ �����̿�
System.out.println(combination(n,k));

//���� ���� + �޸����̼�
dp=new int [n+1][k+1];
System.out.println(memory(n,k));
*/
}
}
