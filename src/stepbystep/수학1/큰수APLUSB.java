package stepbystep.����1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ū��APLUSB {
public static void main(String[] args) throws IOException {
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
StringTokenizer st=new StringTokenizer(br.readLine());
String stnum1=st.nextToken();
String stnum2=st.nextToken();
String temp="";

//���ڿ��� ���̸� �����ֱ� ���ؼ� ������� ���ڿ��� stnum1�� ��ġ�ϱ����� ��ȯ
if(stnum1.length()<stnum2.length()) {
	temp=stnum1;
	stnum1=stnum2;
	stnum2=temp;
}
//���ڿ� ���̰� ������������ ���̰� ª�� ���ڿ��� 0�� �տ� �ٿ��ֱ�
while(stnum2.length()!=stnum1.length()) {
	stnum2="0"+stnum2;
}

//10�� ������ �տ����� 1�� �����ֱ����� boolean
boolean flag=false;
//���� ���������� �����ϱ� ���� ����
StringBuilder sb=new StringBuilder();
//�����ڸ����� ���ϱ⸦ 1�ڸ����ϴ� �ݺ���
for(int i=stnum1.length()-1;i>=0;i--) {
	//���ڸ���
	int a;
	int b;
	//������ 10�� �Ѿ����� +1 �ƴϸ� �״��
	if(flag==true) {
		a=Integer.parseInt(stnum1.charAt(i)+"")+1;
		b=Integer.parseInt(stnum2.charAt(i)+"");
	}else {
		a=Integer.parseInt(stnum1.charAt(i)+"");
		b=Integer.parseInt(stnum2.charAt(i)+"");
	}

	//�̹� �ڸ�������10�� ������ boolean�� �ٲ��ְ� ���ڸ��� ���ο� ���ڿ� �߰�
	if(a+b>=10) {
		flag=true;
		String last=((a+b)+"").charAt(1)+"";
		sb.insert(0,last);
		continue;
	}
	//�ƴѰ��� flag�� �ٲ��ְ� �׳� ���ؼ� ���ο���ڿ� �߰�
	else {
		flag=false;
		String last=(a+b)+"";
		sb.insert(0,last);
	}

	
}
//������ flag�� true�̸� 1�� �ö󰬱� ������ ��¿� �߰�
//�ƴѰ��� �׳� ���
if(flag==true) {
	System.out.println("1"+sb.toString());
}else {
	System.out.println(sb.toString());
}
}
}
