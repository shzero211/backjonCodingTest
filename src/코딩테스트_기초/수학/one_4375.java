package �ڵ��׽�Ʈ_����.����;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//��⿬��
public class one_4375 {
public static void main(String[] args) throws IOException {
	//�������� ��� �������� �ݺ��ص� ���ڸ� �۾����� ���� �޶����� �ʴ´�.
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
