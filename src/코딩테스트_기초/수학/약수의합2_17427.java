package �ڵ��׽�Ʈ_����.����;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class �������2_17427 {
	//Ư���� ������ ����� ���� �������ִ�
	//����� ������ (Ư����/���ϴ� ���)
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int a=Integer.parseInt(br.readLine());
	long sum=0;
	for(int i=1;i<=a;i++) {
		sum+=(a/i)*i;
	}
	System.out.println(sum);
}
}
