package �ڵ��׽�Ʈ_����.����;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class �������2_17427 {
	//Ư���� ������ ����� ���� �������ִ�
	//����� ������ (Ư����/���ϴ� ���)
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	long[] arr=new long[1000001];
	long[] hap=new long[1000001];
	Arrays.fill(arr,1);
	//�ٽɷ���(���Ʈ�����������ƴ� �׽�Ʈ ���̽��� Ǭ����)
	for(int i=2;i<arr.length;i++) {
		for(int j=1;i*j<arr.length;j++) {
			arr[i*j]+=i;
		}
	}
        
        for(int i=1;i<arr.length;i++) {
		hap[i]=hap[i-1]+arr[i];
	}
        int a=Integer.parseInt(br.readLine());
		System.out.println(hap[a]);
}
}
