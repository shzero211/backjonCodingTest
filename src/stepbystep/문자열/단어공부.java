package stepbystep.���ڿ�;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class �ܾ���� {
public static void main(String[] args) throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String str=br.readLine();
	str=str.toLowerCase();
	//�ٽ�:���ĺ����ڸ�ŭ ũ���ǹ迭
	int[] alpha=new int[26];
	for(int i=0;i<str.length();i++) {
		alpha[str.charAt(i)-'a']++;
	}
	int max=0;
	char ch='?';
	
	for(int i=0;i<26;i++) {
		if(max<alpha[i]) {
			max=alpha[i];
			//�빮�ڴ� 65���ͽ��� �ҹ��ڴ� 97���ͽ���
			ch=(char)(i+65);
			alpha[i]=0;
		}//�ٽ�
		else if(max==alpha[i]) {
			ch='?';
		}
	}
	System.out.println(ch);
	
}
}
