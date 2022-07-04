package stepbystep.정수론및조합론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 약수 {
public static void main(String[] args) throws NumberFormatException, IOException {
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int m=Integer.parseInt(br.readLine());
int[] arr=new int[m];
StringTokenizer st=new StringTokenizer(br.readLine());
for(int i=0;i<m;i++) {
	arr[i]=Integer.parseInt(st.nextToken());
}
Arrays.sort(arr);
int first=arr[0];
int last=arr[m-1];
System.out.println(first*last);
}
}
