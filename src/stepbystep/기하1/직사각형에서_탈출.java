package stepbystep.기하1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 직사각형에서_탈출 {
public static void main(String[] args) throws IOException {
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
StringTokenizer st=new StringTokenizer(br.readLine());
int[] arr=new int[4];
int i=0;
while(st.hasMoreTokens()) {
	arr[i++]=Integer.parseInt(st.nextToken());
}

int a=Math.abs(arr[0]-arr[2]);
int b=Math.abs(arr[1]-arr[3]);
int c=Math.abs(arr[0]-0);
int d=Math.abs(arr[1]-0);
int max1=a>=b?b:a;
int max2=c>=d?d:c;
System.out.println(max1>max2?max2:max1);
}
}
