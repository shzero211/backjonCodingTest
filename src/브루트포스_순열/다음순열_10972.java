package 브루트포스_순열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 다음순열_10972 {
	//nextPermutation 공식을사용하면된다.
	static int m;
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	m=Integer.parseInt(br.readLine());
	StringTokenizer st=new StringTokenizer(br.readLine());
	int [] arr=new int [m];
	int i=0;
	while(st.hasMoreTokens()) {
		arr[i++]=Integer.parseInt(st.nextToken());
	}
	nextpermu(arr);
	
}
public static void nextpermu(int[] arr) {
	
	boolean b=true;
	//오른쪽부터 시작해서 왼쪽값이 더작을경우를 찾는다.
	for(int i=m-1;i>0;i--) {
		if(arr[i-1]<arr[i]) {
			//찾았다면 다시 맨 오른쪽부터 i-1보다 최초로 큰값과 교환해준다.
			for(int j=m-1;j>=i;j--) {
				if(arr[j]>arr[i-1]) {
					int temp=arr[j];
					arr[j]=arr[i-1];
					arr[i-1]=temp;
					int k=m-1;
					//그리고 i값부터 시작하고 k값과 교환해나간다.
					while(i<k) {
						int temp2=arr[i];
						arr[i]=arr[k];
						arr[k]=temp2;
						i++;
						k--;
					}
					b=false;
					break;
				}
			}
			if(!b) {
				break;
			}
		}
	}
	if(b) {
		System.out.println(-1);
	}else {
		for(int i=0;i<m;i++) {
			System.out.println(arr[i]);
		}
	}
}
}
