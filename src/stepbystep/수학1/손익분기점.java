package stepbystep.����1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ���ͺб��� {
public static void main(String[] args) throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st=new StringTokenizer(br.readLine());
	int base=Integer.parseInt(st.nextToken());
	int p1=Integer.parseInt(st.nextToken());
	int p2=Integer.parseInt(st.nextToken());

	if(p1>=p2) {
		System.out.println(-1);
		return;
	}else {
		//while������ Ǯ�ÿ��� �ð��ʰ��� �߻��ϰ� 21�￡ ���ϱ⸦����ϸ�
		//int �� ������ �ʰ��ϱ⶧���� �̻��� ���� �߻��Ѵ�
		//ī���ڸ��� �����̱� ������ �������� ������ �̿��ؼ�
		//(�������+�������*���)=�Ǹź��*��� �μ����� ���ͺб��� �����̱� ������
		//�������/(�Ǹź��-�������)+1 �ϴ� ������ ���� �б� ���̶�°��� �˼� �ִ�.
		System.out.println(base/(p2-p1)+1);
		return;
	}
	
	
}
}
