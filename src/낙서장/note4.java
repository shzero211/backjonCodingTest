package ³«¼­Àå;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class note4 {
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st;
	int a=Integer.parseInt(br.readLine());
	int b=Integer.parseInt(br.readLine());
	boolean[] nums=new boolean[10];
	st=new StringTokenizer(br.readLine());
	while(st.hasMoreTokens()) {
		nums[Integer.parseInt(st.nextToken())]=true;
	}
	int result=Math.abs(a-100);
	for(int i=0;i<999999;i++) {
		String str=String.valueOf(i);
		int len=str.length();
		boolean isBreak=false;
		for(int j=0;j<len;j++) {
			
			if(nums[str.charAt(j)-'0']) {
				isBreak=true;
				break;
			}
		}
		if(!isBreak) {
			int min=Math.abs(a-i)+len;
			result=Math.min(min, result);
		}
	}
	System.out.println(result);
	
}
}
