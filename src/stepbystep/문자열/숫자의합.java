package stepbystep.���ڿ�;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class �������� {
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int answer=0;
	
	int len=Integer.parseInt(br.readLine());
	String numstr=br.readLine();
	
	for(int i=0;i<len;i++) {
		int idxnum=(int)(numstr.charAt(i)-'0');
		answer+=idxnum;
	}
	
	System.out.println(answer);
}
}
