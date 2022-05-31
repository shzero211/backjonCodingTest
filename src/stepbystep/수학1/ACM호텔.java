package stepbystep.����1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ACMȣ�� {
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	//�׽�Ʈ ������ ����
	int m=Integer.parseInt(br.readLine());
	
	for(int i=0;i<m;i++) {
	StringTokenizer st=new StringTokenizer(br.readLine());
	//H:����,W:������ ���,N:���° �մ�
	int H=Integer.parseInt(st.nextToken());
	int W =Integer.parseInt(st.nextToken());
	int N=Integer.parseInt(st.nextToken());
	//ȣ���� ȣ������ ������ ��Ÿ���� ����
	int head=N%H;
	//ȣ���� ȣ������ ���� ��Ÿ���� ����
	int tail=N/H;
	
	//ȣ���� ������ ���Ҷ� �������� 0�̵ɰ��
	if(head==0) {
		head=H;
		tail-=1;
	}
	//����� +1 ���������
	tail+=1;
	
	//���ڷ� ������ְ�
	String strhead=head+"";
	String strtail=tail+"";
	String answer="";
	//ȣ���� ����� 10���������� 0�� �տ� �ٿ���
	if(tail<10) {
		answer=strhead+"0"+strtail;
	}else {
		answer=strhead+strtail;
	}

	System.out.println(answer);
	}
	
}
}
