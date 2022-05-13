package stepbystep.조건문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//삼항연산자 학습하기 좋았다
public class 시험성적 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		System.out.println((n>=90)?"A":(n>=80)?"B":(n>=70)?"C":(n>=60)?"D":"F");
	}
}
