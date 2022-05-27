package stepbystep.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 다이얼 {
public static void main(String[] args) throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String str=br.readLine();
	int answer=0;
	for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		if(ch=='A'||ch=='B'||ch=='C') {
			answer+=3;
		}else if(ch=='D'||ch=='E'||ch=='F') {
			answer+=4;
		}else if(ch=='G'||ch=='H'||ch=='I') {
			answer+=5;
		}else if(ch=='J'||ch=='K'||ch=='L') {
			answer+=6;
		}else if(ch=='M'||ch=='N'||ch=='O') {
			answer+=7;
		}else if(ch=='P'||ch=='Q'||ch=='R'||ch=='S') {
			answer+=8;
		}else if(ch=='T'||ch=='U'||ch=='V') {
			answer+=9;
		}else if(ch=='W'||ch=='X'||ch=='Y'||ch=='Z') {
			answer+=10;
		}
	}
	System.out.println(answer);
}
}
