package �ڵ��׽�Ʈ_����.����;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class �Ҽ�ã��_1978 {
	//�����佺�׳׽��� ü ����=>�Ҽ��� ã�� �� ü�� �Ÿ����� �ϴ¹��
	//��������� ���� Ǯ����  �̸� �ε����� �������� �Ҽ����� ������� ���� ã�� �׽�Ʈ ���̽�����
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int[] arr=new int[1001];
		int a=Integer.parseInt(br.readLine());
		int count=0;
		Arrays.fill(arr,1);
		arr[0]=0;
		arr[1]=0;
		for(int i=2;i<=1000;i++) {
			for(int j=2;i*j<=1000;j++) {
				arr[i*j]=0;
			}
		}
		StringTokenizer st=new StringTokenizer(br.readLine());
		while(a-->0) {
			if(arr[Integer.parseInt(st.nextToken())]==1) {
				count++;
			}
		}
		System.out.println(count);
	}

}
