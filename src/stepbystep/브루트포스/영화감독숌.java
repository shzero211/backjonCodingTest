package stepbystep.���Ʈ����;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ��ȭ������ {
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int m=Integer.parseInt(br.readLine());
	int cnt=0;
	for(int i=0;i<9999666;i++) {
		if(String.valueOf(i).contains("666")) {
			if(cnt==m-1) {
				System.out.println(i);
			}
			cnt++;
		}
	}
}
}
