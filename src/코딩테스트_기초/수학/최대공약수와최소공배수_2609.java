package �ڵ��׽�Ʈ_����.����;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class �ִ��������ּҰ����_2609 {
	//�ִ�����:�μ� ����� ������� ������ ���Ҽ������� �μ����ؽð��ʹ������ɸ�
	//�׷��� ��Ŭ���� ȣ�������
	//GCD(A,B)=GCD(B,A%B)!!=>�����ʰ��� 0�϶� ������ ���������� ������ �ִ� ������̴�.
	//�ּҰ������ A=ad,B=bd �϶� a*b*d������ A*B/GCD(A,B)�ϸ� �ȴ�.
	
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
