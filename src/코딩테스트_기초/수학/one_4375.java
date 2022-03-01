package 코딩테스트_기초.수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//모듈연산
public class one_4375 {
public static void main(String[] args) throws IOException {
	//나머지에 계속 나머지를 반복해도 숫자만 작아지지 값이 달라지지 않는다.
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String str="";
	while((str=br.readLine())!=null) {
		int a=Integer.parseInt(str);
		int b=1;
		int len=1;
		while(true) {
			if(b%a==0) break;
			len++;
			b=(b*10+1)%a;
		}
		System.out.println(len);
	}
}
}
