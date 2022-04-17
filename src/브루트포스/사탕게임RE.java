package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 사탕게임RE {
	static String[][] arr;
	static int max=0;
	static int n=0;
public static void arrcheck() {
	int count;
	for(int i=0;i<n;i++) {
		count=0;
		for(int j=0;j<n-1;j++) {
			if(arr[i][j].equals(arr[i][j+1])){
				count++;
			}else {
				count=0;
			}
			max=Math.max(max,count);
		}
	}
	for(int i=0;i<n;i++) {
		count=0;
		for(int j=0;j<n-1;j++) {
			if(arr[j][i].equals(arr[j+1][i])){
				count++;
			}else {
				count=0;
			}
			max=Math.max(max,count);
		}
	}
}
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	n=Integer.parseInt(br.readLine());
	arr=new String[n][n];
	String temp="";
	for(int i=0;i<n;i++) {
		String s=br.readLine();
		String[] c=s.split("");
		for(int j=0;j<n;j++) {
			arr[i][j]=c[j];
		}
	}
	
	for(int i=0;i<n;i++) {
		for(int j=0;j<n-1;j++) {
			temp=arr[i][j];
			arr[i][j]=arr[i][j+1];
			arr[i][j+1]=temp;
			arrcheck();
			temp=arr[i][j];
			arr[i][j]=arr[i][j+1];
			arr[i][j+1]=temp;
		}
	}
	
	for(int i=0;i<n;i++) {
		for(int j=0;j<n-1;j++) {
			temp=arr[j][i];
			arr[j][i]=arr[j+1][i];
			arr[j+1][i]=temp;
			arrcheck();
			temp=arr[j][i];
			arr[j][i]=arr[j+1][i];
			arr[j+1][i]=temp;
		}
	}
	System.out.println(max+1);
}
}
