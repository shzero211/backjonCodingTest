package ³«¼­Àå;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class note1 {
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int[] arr=new int[9];
	int sum=0;
	for(int i=0;i<9;i++) {
		arr[i]=Integer.parseInt(br.readLine());
		sum+=arr[i];
	}
	Arrays.sort(arr);
	boolean flag=false;
	for(int i=0;i<8;i++) {
		for(int j=i+1;j<9;j++) {
			if(sum-arr[i]-arr[j]==100) {
				flag=true;
				for(int k=0;k<9;k++) {
					if(i!=k&&j!=k)
						System.out.println(arr[k]);
				}
				break;
			}
				
		}
		if(flag==true) {
			break;
		}
	}
}
}
