package ���Ʈ����;

import java.util.Scanner;
//���� Ž�� �ϰ� ����
//���Ʈ����
//if�� ��ġ�� ���ؾ���
public class ��¥���_1476 {
	static int count=1;
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	String[] arr=sc.nextLine().split(" ");
	int[] arrInt=new int[arr.length];
	for(int i=0;i<arr.length;i++) {
		arrInt[i]=Integer.parseInt(arr[i]);
	}
	find(arrInt,new int[] {1,1,1});
	
}
public static void find(int[] arr,int[] date) {
	if(arr[0]==date[0]&&arr[1]==date[1]&&arr[2]==date[2]) {
		System.out.println(count);
		return;
	}
	date[0]++;
	date[1]++;
	date[2]++;
	if(date[0]>=16) {
		date[0]=1;
		
	}
	
	if(date[1]>=29) {
		date[1]=1;
		
	}
	
	if(date[2]>=20) {
		date[2]=1;
		
	}
	
	count++;
	find(arr,date);
	
}
}
