package ³«¼­Àå;

import java.util.Scanner;

public class note6 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int len=sc.nextInt();
	for(int i=0;i<len;i++) {
		int n=sc.nextInt();
		int m=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int num1=1;
		int num2=1;
		int num=1;
		boolean flag=false;
		
		while(num1<=n&&num2<=m) {
			num2++;
			num++;
			if(a==num1&&b==num2) {
				System.out.println(num);
				flag=true;
				break;
			}
			if(num2>m) {
				num1++;
				num2=1;
			}
			
			
		}
		if(flag==false)
			System.out.println(-1);
	}
}
}
