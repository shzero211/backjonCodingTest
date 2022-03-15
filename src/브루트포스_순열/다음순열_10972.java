package ���Ʈ����_����;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ��������_10972 {
	//nextPermutation ����������ϸ�ȴ�.
	static int m;
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	m=Integer.parseInt(br.readLine());
	StringTokenizer st=new StringTokenizer(br.readLine());
	int [] arr=new int [m];
	int i=0;
	while(st.hasMoreTokens()) {
		arr[i++]=Integer.parseInt(st.nextToken());
	}
	nextpermu(arr);
	
}
public static void nextpermu(int[] arr) {
	
	boolean b=true;
	//�����ʺ��� �����ؼ� ���ʰ��� ��������츦 ã�´�.
	for(int i=m-1;i>0;i--) {
		if(arr[i-1]<arr[i]) {
			//ã�Ҵٸ� �ٽ� �� �����ʺ��� i-1���� ���ʷ� ū���� ��ȯ���ش�.
			for(int j=m-1;j>=i;j--) {
				if(arr[j]>arr[i-1]) {
					int temp=arr[j];
					arr[j]=arr[i-1];
					arr[i-1]=temp;
					int k=m-1;
					//�׸��� i������ �����ϰ� k���� ��ȯ�س�����.
					while(i<k) {
						int temp2=arr[i];
						arr[i]=arr[k];
						arr[k]=temp2;
						i++;
						k--;
					}
					b=false;
					break;
				}
			}
			if(!b) {
				break;
			}
		}
	}
	if(b) {
		System.out.println(-1);
	}else {
		for(int i=0;i<m;i++) {
			System.out.println(arr[i]);
		}
	}
}
}
