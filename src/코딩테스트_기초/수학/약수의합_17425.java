package �ڵ��׽�Ʈ_����.����;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class �������_17425 {
public static void main(String[] args) throws NumberFormatException, IOException {
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	StringBuilder sb=new StringBuilder();
	int[] arr=new int[1000000];
	int[] hap=new int[1000000];
	int t=Integer.parseInt(br.readLine());
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
	//�ݺ�����
	while(t-->0) {
		int a=Integer.parseInt(br.readLine());
		sb.append(hap[a]).append("\n");
	}
	System.out.println(sb);
}

}
