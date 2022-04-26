package ³«¼­Àå;

import java.util.Scanner;

public class note5 {
	static int n;
	static int m,ans;
	static int[][] map;
	static int[] dx= {0,0,1,-1};
	static int[] dy= {1,-1,0,0};
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	m=sc.nextInt();
	map=new int[n][m];
	for(int i=0;i<n;i++) {
		for(int j=0;j<m;j++) {
			map[i][j]=sc.nextInt();
		}
	}
	boolean[][] visit=new boolean[n][m];
	for(int i=0;i<n;i++) {
		for(int j=0;j<m;j++) {
			visit[i][j]=true;
			dfs(i,j,1,map[i][j],visit);
			visit[i][j]=false;
			check(i,j);
		}
	}
	System.out.println(ans);
}
public static void dfs(int x,int y,int cnt,int sum,boolean[][] visit) {
	if(cnt>=4) {
		ans=Math.max(ans, sum);
		return;
	}
	for(int i=0;i<4;i++) {
		int nx=x+dx[i];
		int ny=y+dy[i];
		if(nx<0||ny<0||nx>=n||ny>=m||visit[nx][ny]) {
			continue;
		}
		visit[nx][ny]=true;
		dfs(nx,ny,cnt+1,sum+map[nx][ny],visit);
		visit[nx][ny]=false;
	}
}
static void check(int x,int y) {
	if(x<n-2&&y<m-1)
		ans=Math.min(ans,map[x][y]+map[x+1][y]+map[x+2][y]+map[x+1][y+1]);
	if(x<n-2&&y>0)
		ans=Math.min(ans,map[x][y]+map[x+1][y]+map[x+2][y]+map[x+1][y-1]);
	if(x<n-1&&y<m-2)
		ans=Math.min(ans,map[x][y]+map[x][y+1]+map[x][y+2]+map[x+1][y+1]);
	if(x>0&&y<m-2)
		ans=Math.min(ans,map[x][y]+map[x][y+1]+map[x][y+2]+map[x-1][y+1]);
}
}
