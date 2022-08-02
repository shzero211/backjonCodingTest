package stepbystep.동적계획법1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 계단_오르기 {
static int[] arr;
static Integer[] dp;
static int before;
public static void main(String[] args) throws NumberFormatException, IOException {
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int m=Integer.parseInt(br.readLine());
arr=new int[m];
dp=new Integer[m];

for(int i=0;i<m;i++) {
	arr[i]=Integer.parseInt(br.readLine());
}
dp[0]=arr[0];
dp[1]=arr[1];
System.out.println(recur(m-1));

}

public static int recur(int idx) {
	
	if(dp[idx]==null) {
		
			dp[idx]=Math.max(recur(idx-2),recur(idx-3)+arr[idx-1])+arr[idx];
		
	}
	return dp[idx];
}
}
