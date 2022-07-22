package stepbystep.동적계획법1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 연속합 {
static int[] arr;
static Integer[] dp;
static int max;
public static void main(String[] args) throws NumberFormatException, IOException {
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

int m=Integer.parseInt(br.readLine());
arr=new int[m];
dp=new Integer[m];

StringTokenizer st=new StringTokenizer(br.readLine());

for(int i=0;i<m;i++) {
	arr[i]=Integer.parseInt(st.nextToken());
}

max=arr[0];
dp[0]=arr[0];

recur(m-1);
System.out.println(max);
}

public static int recur(int k) {
	if(dp[k]==null) {
		dp[k]=Math.max(recur(k-1)+arr[k],arr[k]);
		
		max=Math.max(dp[k],max);
	}
	return dp[k];
}

}