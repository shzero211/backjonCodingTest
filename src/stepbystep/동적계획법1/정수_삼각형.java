package stepbystep.µ¿Àû°èÈ¹¹ý1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Á¤¼ö_»ï°¢Çü {
static int[][] arr;
static Integer[][] dp;
static int max=0;
public static void main(String[] args) throws NumberFormatException, IOException {
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int m=Integer.parseInt(br.readLine());
arr=new int[m][m];
dp=new Integer[m][m];
for(int i=0;i<m;i++) {
	StringTokenizer st=new StringTokenizer(br.readLine());
	int j=0;
	while(st.hasMoreTokens()) {
		arr[i][j++]=Integer.parseInt(st.nextToken());	
	}
}
for(int i=0;i<m;i++) {
	dp[m-1][i]=arr[m-1][i];
}
System.out.println(recur(0,0));

}
public static int recur(int row,int col ) {
	if(dp[row][col]==null) {
		dp[row][col]=Math.max(recur(row+1,col),recur(row+1,col+1))+arr[row][col];
		
	}
	return dp[row][col];
}
}
