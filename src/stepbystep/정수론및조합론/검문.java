package stepbystep.정수론및조합론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 검문 {
public static void main(String[] args) throws NumberFormatException, IOException {
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int m=Integer.parseInt(br.readLine());
int arr[]=new int[m];
for(int i=0;i<m;i++)
{
	arr[i]=Integer.parseInt(br.readLine());
}
Arrays.sort(arr);
int d=arr[1]-arr[0];
int temp=0;
for(int i=2;i<arr.length;i++) {
	int f=arr[i]-arr[i-1];
	d=gcd(d,f);
}
for(int i=2;i<=d;i++) {
	if(d%i==0) {
		System.out.print(i+" ");
	}
}

}
public static int gcd(int a,int b) {
	if(b==0) {
		return a;
	}
	return gcd(b,a%b);
}
}
