package stepbystep.조건문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class 주사위세개 {
public static void main(String[] args) throws IOException {
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
StringTokenizer st=new StringTokenizer(br.readLine());
int[] num=new int[3];

num[0]=Integer.parseInt(st.nextToken());
num[1]=Integer.parseInt(st.nextToken());
num[2]=Integer.parseInt(st.nextToken());
Arrays.sort(num);
int samen=0;
int max=0;
for(int i=0;i<2;i++) {
	int count=1;
	for(int j=i+1;j<3;j++) {
		if(num[i]==num[j]) {
			samen=num[i];
			count++;
			max=Math.max(max,count);
		}
			
	}
}
if(max==0) {
	System.out.println(100*num[0]);
}else if (max==2) {
	System.out.println(1000+samen*100);
}else if (max==3) {
	System.out.println(10000+samen*1000);
}
}
}
