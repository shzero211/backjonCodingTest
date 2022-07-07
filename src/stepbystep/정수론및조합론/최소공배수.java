package stepbystep.정수론및조합론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 최소공배수 {
public static void main(String[] args) throws IOException {
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int m=Integer.parseInt(br.readLine());

for(int i=0;i<m;i++) {
	StringTokenizer st=new StringTokenizer(br.readLine());
	int a=Integer.parseInt(st.nextToken());
	int b=Integer.parseInt(st.nextToken());
	int temp=0;
	if(a<b) {
		temp=a;
		a=b;
		b=temp;
	}
	int numg=gcd(a,b);
	int numl=a*b/numg;
	System.out.println(numl);
}
}
public static int gcd(int a,int b) {
	if(b==0) {
		return a;
	}
	return gcd(b,a%b);
}
}
