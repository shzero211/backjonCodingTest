package stepbystep.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 크로아티아_알파벳 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String[] strs={"c=","c-","dz=","d-","lj","nj","s=","z="};
		//contains와 replace의 중요성을 알려주는 문제
		for(int i=0;i<strs.length;i++) {
			if(s.contains(strs[i])) {
				s=s.replace(strs[i],"!");
			}
		}
		
		System.out.println(s.length());
		
		
	}
}
