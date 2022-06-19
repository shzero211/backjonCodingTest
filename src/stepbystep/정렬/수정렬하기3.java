package stepbystep.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 수정렬하기3 {
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	StringBuilder sb=new StringBuilder();
	int m=Integer.parseInt(br.readLine());
	int[] count=new int[10001];
	
	for(int i=0;i<m;i++) {
		count[Integer.parseInt(br.readLine())]++;
	}
	
	for(int i=1;i<10001;i++) {
		while(count[i]>0) {
			sb.append(i+"\n");
			count[i]--;
		}
	}
	
	System.out.println(sb.toString());
}
}
