package stepbystep.���ڿ�;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ũ�ξ�Ƽ��_���ĺ� {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String[] strs={"c=","c-","dz=","d-","lj","nj","s=","z="};
		//contains�� replace�� �߿伺�� �˷��ִ� ����
		for(int i=0;i<strs.length;i++) {
			if(s.contains(strs[i])) {
				s=s.replace(strs[i],"!");
			}
		}
		
		System.out.println(s.length());
		
		
	}
}
