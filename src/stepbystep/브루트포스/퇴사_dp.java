package stepbystep.���Ʈ����;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ���_dp {
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	int n = Integer.parseInt(reader.readLine());
	
	int[] t = new int[n];
	int[] p = new int[n];
	
	StringTokenizer st;
	for (int i=0; i<n; i++) {
		st = new StringTokenizer(reader.readLine());
		
		t[i] = Integer.parseInt(st.nextToken());
		p[i] = Integer.parseInt(st.nextToken());
	}
	
	//dp : N�Ͽ� ���� �� �ִ� �ִ� ����
	int[] dp = new int[n+1];
	
	
	for (int i=0; i<n; i++) {
		if (i + t[i] <= n) {
			//��¥�� ������ �Ѿ�� �ʴ� ���
			//���߿� ������ ��ĥ�����־ �ִ�� �����ɼ� �ֵ���
			dp[i + t[i]] =Math.max(dp[i+t[i]],dp[i]+p[i]);
			//System.out.println("dp[i]:"+dp[i]);
			//System.out.println("p[i]:"+p[i]);
			//System.out.println("d[i+t[i]]:"+dp[i+t[i]]);
		}
		//���� ����� ���� 0�� �� �ֱ� ������ ������ �ִ밪�� �־���.
		//�ش� ��¥�� ���� �� �ֵ� ���� �������� ���� �ִ� ������ �־��־�� �Ѵ�.
		dp[i+1] = Math.max(dp[i+1], dp[i]);
	}
	//Math.max(dp[i+t[i]],dp[i]+p[i]) ��� dp[i]+p[i] �����
	//[0, 0, 0, 0, 0, 10, 20, 20, 40, 40, 50]
	//Math.max(dp[i+t[i]],dp[i]+p[i]) �����
	//[0, 0, 0, 0, 0, 50, 60, 60, 80, 80, 90]
	System.out.println(Arrays.toString(dp));
	System.out.println(dp[n]);
}
}
