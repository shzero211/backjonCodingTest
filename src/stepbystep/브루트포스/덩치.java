package stepbystep.브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class 덩치 {
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int m=Integer.parseInt(br.readLine());
	int[][] stu=new int[m][2];
	int[] ans=new int[m];
	for(int i=0;i<ans.length;i++) {
		ans[i]=1;
	}
	for(int i=0;i<m;i++) {
		StringTokenizer st=new StringTokenizer(br.readLine());
		stu[i][0]=Integer.parseInt(st.nextToken());
		stu[i][1]=Integer.parseInt(st.nextToken());
	}
	for(int i=0;i<m;i++) {
		int rank=2;
		for(int j=0;j<m;j++) {
			if (i==j) continue;
			if(stu[i][0]<stu[j][0]&&stu[i][1]<stu[j][1]) {
				ans[i]=rank++;
			}
		}
	}
	for(int i=0;i<m;i++) {
		System.out.printf(ans[i]+" ");
	}
}
}
