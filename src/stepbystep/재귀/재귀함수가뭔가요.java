package stepbystep.���;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ����Լ��������� {
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int k=Integer.parseInt(br.readLine());
	System.out.println("��� �� ��ǻ�Ͱ��а� �л��� ������ �������� ã�ư� ������.");
	re(0,2);
	
}
public static void re(int n,int reach) {
	
	System.out.println("\"����Լ��� ������?\"\r\n"
			+ "\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���.\r\n"
			+ "���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���.\r\n"
			+ "���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\"");
}
}
