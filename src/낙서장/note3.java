package ³«¼­Àå;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class note3 {
public static void main(String[] args) throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st=new StringTokenizer(br.readLine());
	int[] num=new int[3];
	int a=1,b=1,c=1;
	int i=0;
	while(st.hasMoreTokens()) {
		num[i++]=Integer.parseInt(st.nextToken());
	}
	i=1;
	while(true) {
		if(num[0]==a&&num[1]==b&&num[2]==c)break;
		a++;
		b++;
		c++;
		if(a>15)a=1;
		if(b>28)b=1;
		if(c>19)c=1;
		i++;
	}
	System.out.println(i);
}
}
