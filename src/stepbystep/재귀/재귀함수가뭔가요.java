package stepbystep.���;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ����Լ��������� {
	static String under="";
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int k=Integer.parseInt(br.readLine());
	System.out.println("��� �� ��ǻ�Ͱ��а� �л��� ������ �������� ã�ư� ������.");
	re(k);
	
}
public static void re(int k) {
	String line=under;
	if(k==0) {
		System.out.println(line+"\"����Լ��� ������?\"");
		System.out.println(line+"\"����Լ��� �ڱ� �ڽ��� ȣ���ϴ� �Լ����\"");
		System.out.println(line+"��� �亯�Ͽ���.");
		return;
	}
	
	System.out.println(line+"\"����Լ��� ������?\"");
	System.out.println(line+"\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���.");
	System.out.println(line+"���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���.");
	System.out.println(line+"���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\"");
	under+="____";
	re(k-1);
	System.out.println(line+"��� �亯�Ͽ���.");
}
}
