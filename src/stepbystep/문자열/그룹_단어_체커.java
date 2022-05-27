package stepbystep.문자열;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;


public class 그룹_단어_체커 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int m=Integer.parseInt(br.readLine());
		String str="";
		int answer=0;
		
		for(int i=0;i<m;i++) {
			
		str=br.readLine();
		int count=0;
		boolean[] alpha=new boolean[26+1];
		for(int j=0;j<str.length();j++) {
			
			int num=str.charAt(j)-'a'+1;
			if(!alpha[num]) {
				alpha[num]=true;
				count++;
				continue;
			}else {
				if(str.charAt(j-1)==str.charAt(j)) {
					count++;
					continue;
				}else {
					break;
				}
			}
			
		}
		if(count==str.length()) {
			answer++;
		}
		}
		
		System.out.println(answer);

	}

}
