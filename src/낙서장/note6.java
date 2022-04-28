package ³«¼­Àå;

import java.util.Scanner;

public class note6 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int len=sc.nextInt();
	for(int i=0;i<len;i++) {
		int n=sc.nextInt();
		int m=sc.nextInt();
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		int num=0;
		int lcm=n*m/gcd(n,m);
		int ans=-1;
		while(num*n<lcm) {
			if((num*n+x-y)%m==0) {
				ans=n*num+x;
				break;
			}
			num++;
		}
		System.out.println(ans);
		
	}
}
public static int gcd(int n1,int n2) {
	if(n2==0)
		return n1;
	return gcd(n2,n1%n2);
}
}
