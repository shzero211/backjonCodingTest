package stepbystep.백트래킹;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N과M1 {
	static int n;
	static int m;
	static int[] arr;
	static boolean[] visit;
	public static void dfs(int depth) {
		if(depth==m) {
			for(int val:arr) {
				System.out.printf(val+" ");
			}
			System.out.println();
			return;
		}
		for(int i=0;i<n;i++) {
			if(!visit[i]) {
				visit[i]=true;
				arr[depth]=i+1;
				dfs(depth+1);
				visit[i]=false;
			}
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		n=Integer.parseInt(st.nextToken());
		m=Integer.parseInt(st.nextToken());
		arr=new int[m];
		visit=new boolean[n];
		dfs(0);
	}
}
