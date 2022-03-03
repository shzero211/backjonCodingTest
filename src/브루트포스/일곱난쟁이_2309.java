package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 일곱난쟁이_2309 {
	//핵심
	//특정개수를 찾는거보다 아닌것을 빼는것이 금방풀림
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int[] arr=new int[9];
	int sum=0;
	
	for(int i=0;i<9;i++) {
		arr[i]=Integer.parseInt(br.readLine());
		sum+=arr[i];
	}
	Arrays.sort(arr);
	for(int i=0;i<arr.length-1;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(sum-arr[i]-arr[j]==100) {
				
				for(int k=0;k<9;k++) {
					if(k==i||k==j)
						continue;
					System.out.println(arr[k]);
				}
				break;
			}
		}
	}
}
}
