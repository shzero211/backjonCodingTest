package stepbystep.동적계획법1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RGB거리 {
	static int r = 0;
	static int g = 1;
	static int b = 2;
	static int[][] arr;
	static Integer[][] dp;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(br.readLine());
		dp = new Integer[m][3];
		arr=new int[m][3];
		for (int i = 0; i < m; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 3; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		dp[0][r] = arr[0][r];
		dp[0][g] = arr[0][g];
		dp[0][b] = arr[0][b];

		System.out.println(Math.min(paint(m-1,r),Math.min(paint(m-1,g),paint(m-1,b))));
	}

	public static int paint(int row, int col) {
		if (dp[row][col] == null) {
			if (col == r) {
				dp[row][col] = Math.min(paint(row-1,g), paint(row-1,b)) + arr[row][col];
			} else if (col == g) {
				dp[row][col] = Math.min(paint(row-1,r), paint(row-1,b)) + arr[row][col];
			} else if (col == b) {
				dp[row][col] = Math.min(paint(row-1,r), paint(row-1,g)) + arr[row][col];
			}
			
		}
		return dp[row][col];
	}
}
