package stepbystep.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 단어의개수 {
public static void main(String[] args) throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String str=br.readLine();
	int count=0;
	for(int i=1;i<str.length()-1;i++) {
		if(str.charAt(i)==' ') {
			count++;
		}
	}
	if(str.equals(" ")) {
		System.out.println(0);
		return;
	}
		System.out.println(count+1);
}
}
