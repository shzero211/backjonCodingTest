package stepbystep.조건문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 알람시계 {
public static void main(String[] args) throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st=new StringTokenizer(br.readLine());
	int h=Integer.parseInt(st.nextToken());
	int m=Integer.parseInt(st.nextToken());
	
	if(m-45<0) {
		if(h-1<0) {
			h=23;
		}else{
			h=h-1;
		}
		m=60-Math.abs(m-45);
	}else {
		m=Math.abs(m-45);
	}
	
	
	System.out.println(h+" "+m);
}
}
