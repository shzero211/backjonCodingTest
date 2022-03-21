package 브루트포스;

import java.util.Scanner;

public class 카잉달력_6064 {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	int k=sc.nextInt();
	for(int i=0;i<k;i++) {
		int m=sc.nextInt(),n=sc.nextInt(),x=sc.nextInt(),y=sc.nextInt();
		int lcd=m*n/gcd(m,n);
		int p=0;
		int ans=-1;
		while(p*m<lcd) {
			if((p*m+x-y)%n==0) {
				ans=p*m+x;
				break;
			}
				p++;
		}
		
		System.out.println(ans);
	}
	
}
public static int gcd(int a,int b) {
	return b!=0 ? gcd(b, a%b) : a;
}
}
