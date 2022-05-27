package stepbystep.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 알파벳찾기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in ));
		String str=br.readLine();
		int[] alplo=new int[26];
		
		for(int i=0;i<alplo.length;i++) {
			alplo[i]=-1;
		}
		
		for(int i=0;i<str.length();i++) {
			int idx=str.charAt(i)-'a';
			if(alplo[idx]==-1) {
				alplo[idx]=i;
			}
		}
		
		for(int i=0;i<alplo.length;i++) {
			System.out.print(alplo[i]+" ");
		}
		
	}

}
