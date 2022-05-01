package ³«¼­Àå;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class enxt {
	static int m;
	static int[] arr;
	static boolean[] visit;
	
public static void main(String[] args) throws NumberFormatException, IOException {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] arr=new int[n];
for(int i=0;i<arr.length;i++) {
	arr[i]=sc.nextInt();
}
arr=prevPermutation(arr);
for(int val:arr) System.out.print(val+" ");

}
public static int[] prevPermutation(int[] arr) {
	int i=arr.length-1;
	while(i>0&&arr[i-1]>=arr[i])i--;
	if(i<=0) return new int[] {-1};
	int j=arr.length-1;
	while(arr[j]<=arr[i-1])j--;
	swap(arr,i-1,j);
	j=arr.length-1;
	while(i<j) {
		swap(arr,i,j);
		i++;
		j--;
	}
	return arr;
}
private static void swap(int[] arr,int index1,int index2) {
	int temp=arr[index1];
	arr[index1]=arr[index2];
	arr[index2]=temp;
}
}
