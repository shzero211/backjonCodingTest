package stepbystep.����1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class �γ�ȸ����_���׾� {
public static void main(String[] args) throws NumberFormatException, IOException {
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int m=Integer.parseInt(br.readLine());

//�� ����ȣ���� ���� �ο����� �����ϱ����� �迭
int[][] arr=new int[15][15];

//0~14������ 1ȣ�� 1ä���,0�� ȣ�� �ʱ�ȭ
for(int i=0;i<15;i++) {
	arr[i][1]=1;
	arr[0][i]=i;
}
//1������ 14������ 2ȣ���� �ο���ä���
//�ٽ��� �������� ����ȣ���� �Ʒ����� ����ȣ������ �հ� ����.
//�׷��� arr[i][j-1]:����ȣ�� + arr[i-1][j]:�Ʒ��� ����ȣ�� =>���� ȣ��
for(int i=1;i<=14;i++) {
	for(int j=2;j<=14;j++) {
		arr[i][j]=arr[i][j-1]+arr[i-1][j];
	}
}
for(int i=0;i<m;i++) {
	int K=Integer.parseInt(br.readLine());
	int N=Integer.parseInt(br.readLine());
	System.out.println(arr[K][N]);
}
}
}
