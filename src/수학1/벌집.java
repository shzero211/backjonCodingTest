package ����1;

import java.util.Scanner;

public class ���� {
	//������ ã�ƾ� �Ѵ�.
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int count=1;
	int val=2;
	if(a==1) {
		System.out.println(1);
		return;
	}
	while(val<=a) {
		val=val+(count*6);
		count++;
	}
	System.out.println(count);
}
}
