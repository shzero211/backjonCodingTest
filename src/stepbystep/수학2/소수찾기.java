package stepbystep.����2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class �Ҽ�ã�� {
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int m=Integer.parseInt(br.readLine());
	StringTokenizer st=new StringTokenizer(br.readLine());
	
	//�ε����� ���� �Ҽ� �̸� false, �Ҽ��� �ƴϸ� true
	//�ִ� 1000 ���� ���� �Ҽ� Ȯ���ؾ��ϱ⶧����
	boolean[] numarr=new boolean[1001];
	//�Ҽ� ����
	int answer=0;
	//0��1�� �Ҽ����� ����
	numarr[0]=true;
	numarr[1]=true;
	//�����佺�׳׽���ü �� �̿��� �Ҽ� boolean �迭 �����
	//������ ������ �������� Ȯ�����ָ�ȴ�.
	for(int i=2;i<=50;i++) {
		//2����ͽ���
		int k=2;
		//���� 1000�� �ѱ������� i�� ��� �Ҽ�Ȯ��
		while(true) {
			if(i*k>1000) break;
			numarr[i*k]=true;
			k++;
		}
	}
	
	for(int i=0;i<m;i++) {
		int num=Integer.parseInt(st.nextToken());
		//�Ҽ��̸�
		if(numarr[num]==false) {
			answer++;
		}
	}
	System.out.println(answer);
}
}
