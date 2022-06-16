package stepbystep.���;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class �ϳ���ž {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        move(N, 1, 3, 2); // 3���� ������ 1��Ÿ������ 3�� Ÿ���� �ű�� 2�� Ÿ���� ����� ���.
    }

	private static void move(int N, int start, int end, int sub) {
    	if( N==1 ) {
        	System.out.println(start + " -> " + end);
            return ;
        }
        
        move(N-1, start, sub, end); // N-1���� ��ǥ ������ �ƴ� Ÿ�����ٰ� �Ű� ���� ���� ū ������ �ű� �� �ְ���?
        	move(1, start, end, sub); // ���� move �޼ҵ尡 ������, sub�� ������ ������ �׿��ְ�, 3�� Ÿ������ ����ְ� �Ǿ �ٷ� ū ������ �ű�� �ȴ�.
        move(N-1, sub, end, start); // �Ʊ� �Ű� ���Ҵ� ������ �ٽ� sub -> end Ÿ���� �ű�� ȣ���� �Ѵ�.
    }
}
