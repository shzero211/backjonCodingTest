package stepbystep.���ǹ�;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//���׿����� �н��ϱ� ���Ҵ�
public class ���輺�� {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		System.out.println((n>=90)?"A":(n>=80)?"B":(n>=70)?"C":(n>=60)?"D":"F");
	}
}
