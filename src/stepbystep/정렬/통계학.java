package stepbystep.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

public class 통계학 {
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	StringBuilder sb=new StringBuilder();
	int m=Integer.parseInt(br.readLine());
	int[] arr=new int[8001];
	int min=Integer.MAX_VALUE;
	int max=Integer.MIN_VALUE;
	double sum=0;
	for(int i=0;i<m;i++) {
		int value=Integer.parseInt(br.readLine());
		sum+=value;
		arr[4000+value]++;
		if(min>value)min=value;
		if(max<value)max=value;
	}
	
	int median=10000;
	int many_cnt=0;
	int many=10000;
	int cnt=0;
	boolean flag=false;
	for(int i=min+4000;i<=max+4000;i++) {
		if(arr[i]>0) {
			if(cnt<(m+1)/2) {
				cnt+=arr[i];
				median=i-4000;
			}
			if(flag==true&&many_cnt==arr[i]) {
				many=i-4000;
				flag=false;
			}
			
			
			if(many_cnt<arr[i]) {
				many_cnt=arr[i];
				many=i-4000;
				flag=true;
			}
			 
		}
		
	}
	sb.append((int)Math.round(sum/m)+"\n");
	sb.append(median+"\n");
	sb.append(many+"\n");
	sb.append((max-min)+"\n");
	System.out.println(sb.toString());
}

}
