package ��������;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ī�������� {
public static void main(String[] args) throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int m=Integer.parseInt(br.readLine());
	System.out.println("�Է¹��� ���� ����:"+m);
	StringTokenizer st=new StringTokenizer(br.readLine());
	
	//0~10 ���������� ���ǰ����� �������� �迭
	int[] counting=new int[11];
	
	//0~10������ �������ִ� m���� ���� �迭�� ����
	for(int i=0;i<m;i++) {
		//�Է¹��� ���� �ε��� ������ �̿��ؼ� ���� ����
		//�ε����� ���� �������ִ��̋� �̹� ������ �ٵȰŶ�� ����.
		//�׳� �ε����� ������� ���ε� �ڵ����� �Ǵ� ���̴�.
		counting[Integer.parseInt(st.nextToken())]++;
	}
	System.out.println("������ ������ �����ϴ� �迭:"+Arrays.toString(counting));
	
	//���ڿ� ��������� ��ü
	StringBuilder sb=new StringBuilder();
	
	//0~10���� ���� ������ŭ ���ڿ��� �Ǿ��ִ� �ݺ���
	for(int i=0;i<counting.length;i++) {
		while(counting[i]>0) {
			sb.append(i+" ");
			counting[i]--;
		}
	}
	
	System.out.println("������:"+sb.toString());
	
}
}
