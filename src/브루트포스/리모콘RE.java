package ���Ʈ����;

import java.util.Scanner;

public class ������RE {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int target=sc.nextInt();
	int m=sc.nextInt();
	boolean[] broken=new boolean[10];
	
	for(int i=0;i<m;i++) {
		int n=sc.nextInt();
		broken[n]=true;
	}
	
	//������ +,-�� ��ǥ�� �����Ұ�� Ƚ��
	int result=Math.abs(target-100);
	
	//��ư�� �������� ��� ���
	for(int i=0;i<=999999;i++) {
		String str=String.valueOf(i);
		//������ ��ȣ ����
		int len=str.length();
		
		boolean isbreak=false;
		for(int j=0;j<len;j++) {
		if(broken[str.charAt(j)-'0']==true) {
			isbreak=true;
			break;
		}
		}
		if(isbreak==false) {
			int min=Math.abs(target-i)+len;
			result=Math.min(min,result);
		}
	}
	System.out.println(result);
	
}
}
