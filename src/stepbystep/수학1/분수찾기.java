package stepbystep.����1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class �м�ã�� {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//ó������ �Է°� ���忡 ���Ǵٰ� �ݺ������� ���� �̵����� ����
		int m = Integer.parseInt(br.readLine());
		
		//����� ����Ȥ�� �и��� �ִ밪�� �����ϴ� ���� 
		int i = 1;
		
		//�̹������� ������׷� 1,2,3,4...�̷��� ���������� �����ϴ� 
		//���� ���� �������ϱ⋚����
		//�ݴ�� ó������ 1~4500���� ���༭ ���ʷ� ������ �Ǹ�
		//�� �����ȿ� ���ԵǱ⶧���� �ݺ����� ���ؼ� �ִ밪�� �̵�Ƚ����
		//ã���ִ� ����� ���
		//�Է°��� �ִ� 10,000,000�̱⶧����
		// 4500���� �ݺ����� ����.
		for (i = 1; i < 4500; i++) {
			
			//��°��� �и�Ȥ�� ������ �ִ밪�� ã�� ���� if ��
			if (m - i <= 0) {
				//System.out.println("m:"+m);
				break;
			}
			//�̵�Ƚ���� ã�����ؼ� i�� ����
			m -= i;
		}
		//System.out.println("i:"+i);
		
		//�̵�Ƚ���� �����ϱ� ���� count
		int count = m;

		// Ȧ���϶�
		if (i % 2 == 1) {
			// ���ڴ� �ִ밪���� �پ���
			for (int j = i; j >= 1; j--) {
				if (count == 1) 
					System.out.print(j + "/");
				count--;
			}
			//count �� �ʱ�ȭ
			count = m;
			// �и�� 1���� �ִ밪���� ����
			for (int j = 1; j <= i; j++) {
				if (count == 1) 
					System.out.print(j);
				count--;
			}
		}
		
		// ¦���϶���
		else {
			// ���ڴ� 1���� �ִ밪���� �����ϰ�
			for (int j = 1; j <= i; j++) {
				if (count == 1) 
					System.out.print(j+ "/");
				count--;
			}
			//count�� �ʱ�ȭ
			count = m;

			// �и�� �ִ밪���� 1���� �����Ѵ�.
			for (int j = i; j >= 1; j--) {
				if (count == 1) 
					System.out.print(j );
				count--;
			}
		}
	}
}
