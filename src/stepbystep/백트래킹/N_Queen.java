package stepbystep.백트래킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N_Queen {
	static int m;
	static boolean[][] visited;

public static void queen() {
	
}
public static void main(String[] args) throws NumberFormatException, IOException {
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
m=Integer.parseInt(br.readLine());
visited=new boolean[m][m];
queen();
}
}
