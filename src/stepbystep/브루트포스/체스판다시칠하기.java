package stepbystep.브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 체스판다시칠하기 {
	static int n;
	static int m;

public static void main(String[] args) throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st=new StringTokenizer(br.readLine());
	n=Integer.parseInt(st.nextToken());
	m=Integer.parseInt(st.nextToken());
	String[] strs=new String[n];
	int cntmin=Integer.MAX_VALUE;
	for(int i=0;i<n;i++) {
		strs[i]=br.readLine();
	}
	for(int i=0;i<n;i++) {
		for(int j=0;j<m;j++) {
			if(i+8>n) {
				continue;
			}
			if(j+8>m) {
				continue;
			}
			int cnt=solve(i,j,strs);
			if(cntmin>cnt) {
				cntmin=cnt;
			}
		}
	}
	System.out.println(cntmin);
}
public static int solve(int row,int col,String[] board) {
	int cnt=0;
	int startori=0;
	String[] ori={"BWBWBWBW","WBWBWBWB"};
	if(board[0].charAt(0)=='W') {
		startori=1;
	}
	for(int i=0;i<8;i++) {
		
		if(board[i+row].equals(ori[startori])) {
			
			startori=startori==1?0:1;
			continue;
		}
		
		for(int j=0;j<8;j++) {
			if(board[i+row].charAt(j+col)!=ori[startori].charAt(j)) {
				cnt++;
			}
			
		}
		startori=startori==1?0:1;
		
	}
	return Math.min(cnt, 64 - cnt);
}

}
