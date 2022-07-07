package stepbystep.정수론및조합론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 링 {
public static void main(String[] args) throws NumberFormatException, IOException {
BufferedReader  br=new BufferedReader(new InputStreamReader(System.in));
int m=Integer.parseInt(br.readLine());
int[] arr=new int[m];
StringTokenizer st=new StringTokenizer(br.readLine());
for(int i=0;i<arr.length;i++) {
	arr[i]=Integer.parseInt(st.nextToken());
}
for(int i=1;i<arr.length;i++) {
	int k=gcd(arr[0],arr[i]);
	System.out.println(arr[0]/k+"/"+arr[i]/k);
}
}

private static int gcd(int a, int b) {
	if(b==0)return a;
	return gcd(b,a%b);
}

}
