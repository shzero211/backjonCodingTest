package stepbystep.���ǹ�;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ����ð� {
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st=new StringTokenizer(br.readLine());
	int a=Integer.parseInt(st.nextToken());
	int b=Integer.parseInt(st.nextToken());
	int c=Integer.parseInt(br.readLine());
	
	if(b+c>=60) {
		if(a+(b+c)/60>=24) {
			a=a+(b+c)/60-24;
		}else {
			a+=((b+c)/60);
		}
		b=(b+c)%60;
		
	}else {
		b+=c;
	}
	System.out.println(a+" "+b);
}
}
