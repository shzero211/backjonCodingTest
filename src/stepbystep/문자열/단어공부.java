package stepbystep.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 단어공부 {
public static void main(String[] args) throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String str=br.readLine();
	str=str.toLowerCase();
	//핵심:알파벳숫자만큼 크기의배열
	int[] alpha=new int[26];
	for(int i=0;i<str.length();i++) {
		alpha[str.charAt(i)-'a']++;
	}
	int max=0;
	char ch='?';
	
	for(int i=0;i<26;i++) {
		if(max<alpha[i]) {
			max=alpha[i];
			//대문자는 65부터시작 소문자는 97부터시작
			ch=(char)(i+65);
			alpha[i]=0;
		}//핵심
		else if(max==alpha[i]) {
			ch='?';
		}
	}
	System.out.println(ch);
	
}
}
