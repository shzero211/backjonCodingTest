package stepbystep.���ڿ�;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class �׷�ܾ�üĿ {
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int n=Integer.parseInt(br.readLine());
	String[] strs=new String[n];
	int count=0;
	for(int i=0;i<n;i++) {
		strs[i]=br.readLine();
		if(group(strs[i])) {
			count++;
			System.out.println(strs[i]);
		}
	}
	System.out.println(count);
	
}

private static boolean group(String string) {
	//�ٽ��� ���ĺ� ũ��� �迭���ΰ�
	boolean[] alpha=new boolean[26];
	//���� ���� �����ؼ� �����ִ� ���
	int prev=-1;
	for(int i=0;i<string.length();i++) {
		int now=string.charAt(i)-'a';
		if(prev!=now) {
			if(alpha[now]==true) {
				return false;
			}else {
				alpha[now]=true;
				prev=now;
			}
		}else {
			continue;
		}
	}
	return true;
}
}
