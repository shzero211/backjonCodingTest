package ³«¼­Àå;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class note2 {
	static int m;
	static char[][] arr;
	static int max=0;
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	m=Integer.parseInt(br.readLine());
	arr=new char[m][m];
	
	for(int i=0;i<m;i++) {
		String s=br.readLine();
		for(int j=0;j<s.length();j++) {
			arr[i][j]=s.charAt(j);
		}
	}
	
	char temp;
	
	for(int i=0;i<m;i++) {
		for(int j=0;j<m-1;j++) {
			temp=arr[i][j];
			arr[i][j]=arr[i][j+1];
			arr[i][j+1]=temp;
			find();
			temp=arr[i][j];
			arr[i][j]=arr[i][j+1];
			arr[i][j+1]=temp;
		}
	}
	
	for(int i=0;i<m;i++) {
		for(int j=0;j<m-1;j++) {
			temp=arr[j][i];
			arr[j][i]=arr[j+1][i];
			arr[j+1][i]=temp;
			find();
			temp=arr[j][i];
			arr[j][i]=arr[j+1][i];
			arr[j+1][i]=temp;
		}
	}
	
	System.out.println(max);
}
public static void find() {
	int cnt=1;
	for(int i=0;i<m;i++) {
		cnt=1;
		for(int j=0;j<m-1;j++) {
			if(arr[i][j]==arr[i][j+1]) {
				cnt++;
			}else {
				cnt=1;
			}
			max=Math.max(max,cnt);
		}
	}
	cnt=1;
	for(int i=0;i<m;i++) {
		cnt=1;
		for(int j=0;j<m-1;j++) {
			if(arr[j][i]==arr[j+1][i]) {
				cnt++;
			}else {
				cnt=1;
			}
			max=Math.max(max,cnt);
				
		}

	}
}
}
