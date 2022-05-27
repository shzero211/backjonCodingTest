package stepbystep.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 상수 {
public static void main(String[] args) throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st=new StringTokenizer(br.readLine());
	String num1=st.nextToken();
	String num2=st.nextToken();
	StringBuilder sb1=new StringBuilder();
	StringBuilder sb2=new StringBuilder();
	for(int i=2;i>=0;i--) {
		sb1.append(num1.charAt(i));
		sb2.append(num2.charAt(i));
	}
	int str1=Integer.parseInt(sb1.toString());
	int str2=Integer.parseInt(sb2.toString());
	System.out.println(str1>str2?str1:str2);
	
}
}
