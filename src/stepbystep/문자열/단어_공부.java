package stepbystep.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 단어_공부 {
public static void main(String[] args) throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	String str=br.readLine();
	str=str.toUpperCase();
	
	int[] alpha=new int[26];
	
	for(int i=0;i<str.length();i++) {
		int idx=str.charAt(i)-'A';
		if(alpha[idx]==0) {
			alpha[idx]=1;
		}else {
			alpha[idx]++;
		}
	}

	int maxval=0;
	int maxidx=0;
	
	for(int i=0;i<alpha.length;i++) {
		if(maxval<alpha[i]) {
			maxval=alpha[i];
			maxidx=i;
		}
	}
	
	for(int i=0;i<alpha.length;i++) {
		if(maxval==alpha[i]&&maxidx!=i) {
			System.out.println("?");
			return;
		}
	}
		char ch=(char)('A'+maxidx);
		System.out.println(ch);

}
}
