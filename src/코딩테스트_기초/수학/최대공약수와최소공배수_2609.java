package 코딩테스트_기초.수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 최대공약수와최소공배수_2609 {
	//최대공약수:두수 공통된 약수들의 곱으로 구할수있으니 인수분해시간너무오래걸림
	//그래서 유클리드 호제법사용
	//GCD(A,B)=GCD(B,A%B)!!=>오른쪽값이 0일때 나누어 떨어짐으로 왼쪽이 최대 공약수이다.
	//최소공배수는 A=ad,B=bd 일때 a*b*d임으로 A*B/GCD(A,B)하면 된다.
	
public static void main(String[] args) throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st=new StringTokenizer(br.readLine());
	int n=Integer.parseInt(st.nextToken());
	int m=Integer.parseInt(st.nextToken());
	int temp=0;
	if(n<m) {
		temp=n;
		n=m;
		m=temp;
	}
	int num1=gcd(n,m);
	int num2=n*m/num1;
	System.out.println(num1);
	System.out.println(num2);
}
public static int gcd(int n,int m) {
	if(m==0)
		return n;
	return gcd(m,n%m);
}
}
