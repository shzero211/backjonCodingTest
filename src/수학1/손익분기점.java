package ����1;

import java.util.Scanner;

public class ���ͺб��� {
public static void main(String[] args) throws Exception{
	//Ư¡�� ���а��� ó�� ������ ���� Ǯ���ִٴ°�, �ݺ��� ����ϸ� 21�� �̻������ �ð��ʰ��߻�
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	//n(��ǰ��)>a/(c-b)
	if(c-b<=0) {
		System.out.println(-1);
		return;
	}
	System.out.println((a/(c-b))+1);
}
}
