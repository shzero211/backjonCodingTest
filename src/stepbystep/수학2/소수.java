package stepbystep.����2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class �Ҽ� {
public static void main(String[] args) throws NumberFormatException, IOException {
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//�Ҽ�ã�� ���۰�
int M=Integer.parseInt(br.readLine());
//�Ҽ�ã�� ���ᰪ
int N=Integer.parseInt(br.readLine());
boolean[] barr=new boolean[10001];
//0��1�� �Ҽ����� ����
barr[0]=true;
barr[1]=true;
//for ������ �� �����佺�׳׽���ü �˰���
for(int i=2;i<=100;i++) {
	for(int j=2*i;j<=10000;j+=i) {
		barr[j]=true;
	}
}

int min=Integer.MAX_VALUE;
int sum=0;

for(int i=M;i<=N;i++) {
	if(!barr[i]) {
		if(min>i) min=i;
		sum+=i;
	}
}
if(sum==0) {
	System.out.println(-1);
}else {
	System.out.println(sum);
	System.out.println(min);
}
}
}
