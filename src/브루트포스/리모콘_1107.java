package ���Ʈ����;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ������_1107 {
	//����Ž������(���Ʈ����)
	//�ٽ��� boolean ������ broken[]���� ����
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int target=sc.nextInt();
	int m=sc.nextInt();
	boolean [] broken=new boolean[10];
	for(int i=0;i<m;i++) {
		int n=sc.nextInt();
		broken[n]=true;
	}
	//���� ���б� 100�� ���� ����
	int result=Math.abs(target-100);
	for(int i=0;i<=999999;i++) {
		String str=String.valueOf(i);
		int len=str.length();
		boolean isBreak=false;
		for(int j=0;j<len;j++) {
			if(broken[str.charAt(j)-'0']) {
				isBreak=true;
				break;
			}
		}
		if(!isBreak) {
			//�ּ�Ƚ���� ���밪 ���̰� �ּҶ�� �ǹ̿� ���� 
			int min=Math.abs(target-i)+len;
			result=Math.min(result,min);
		}
	}
	System.out.println(result);
}
}
