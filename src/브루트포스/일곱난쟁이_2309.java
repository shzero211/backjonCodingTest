package ���Ʈ����;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class �ϰ�������_2309 {
	//�ٽ�
	//Ư�������� ã�°ź��� �ƴѰ��� ���°��� �ݹ�Ǯ��
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int[] arr=new int[9];
	int sum=0;
	
	for(int i=0;i<9;i++) {
		arr[i]=Integer.parseInt(br.readLine());
		sum+=arr[i];
	}
	Arrays.sort(arr);
	for(int i=0;i<arr.length-1;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(sum-arr[i]-arr[j]==100) {
				
				for(int k=0;k<9;k++) {
					if(k==i||k==j)
						continue;
					System.out.println(arr[k]);
				}
				break;
			}
		}
	}
}
}
