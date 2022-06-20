package stepbystep.브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 퇴사 {
	static boolean[]visit;
	static int m=0;
	static int sum=0;
    
public static void main(String[] args) throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	m=Integer.parseInt(br.readLine());
	int []arr=new int[m+100];
	int [] pay=new int[m+100];
	visit=new boolean[m+100];
	for(int i=0;i<m;i++) {
		StringTokenizer st=new StringTokenizer(br.readLine());
		arr[i]=Integer.parseInt(st.nextToken());
		pay[i]=Integer.parseInt(st.nextToken());
	}
	//System.out.println(Arrays.toString(arr));
	//System.out.println(Arrays.toString(pay));
	find(arr,pay,0,0);
	System.out.println(sum);
}
public static void find(int[] arr,int[] pay,int idx,int tmp) {
	if(idx>=m) {
		//System.out.println("tmp:"+tmp);
		sum=Math.max(sum, tmp);
		return;
	}
	//로직1
//	if(idx+arr[idx]<=m) {
//		find(arr,pay,idx+arr[idx],tmp+pay[idx]);
//	}else {
//		find(arr,pay,idx+arr[idx],tmp);
//	}
//	find(arr,pay,idx+1,tmp);
	
	for(int i=idx;i<m;i++) {
		if(i+arr[i]<=m) {
			//System.out.println("idx<m:"+(idx+arr[i])+",tmp:"+(tmp+pay[i]));
			find(arr,pay,i+arr[i],tmp+pay[i]);
		}else {
			//System.out.println("idx>m:"+(idx+arr[i])+",tmp:"+(tmp+pay[i]));
			find(arr,pay,i+arr[i],tmp);
		}
	}
		
}
}