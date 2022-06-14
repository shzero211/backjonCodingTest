package stepbystep.Àç±Í;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class º°Âï±â {
	static char[][] arr;
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int m=Integer.parseInt(br.readLine());
	arr=new char[m][m];
	star(0,0,m,false);
	StringBuilder sb=new StringBuilder();
	for(int i=0;i<m;i++) {
		for(int j=0;j<m;j++) {
			sb.append(arr[i][j]);
		}
		sb.append('\n');
	}
	System.out.println(sb);
	
}
public static void star(int x,int y,int m,boolean blank) {
	if(blank) {
		for(int i=x;i<x+m;i++) {
			for(int j=y;j<y+m;j++) {
				arr[i][j]=' ';
			}
		}
		return;
	}
	if(m==1) {
		arr[x][y]='*';
		return;
	}
	int size=m/3;
	int count=0;
	for(int i=x;i<x+m;i+=size) {
		for(int j=y;j<y+m;j+=size) {
			count++;
			if(count==5) {
				star(i,j,size,true);
			}else {
				star(i,j,size,false);
			}
		}
	}
}
}
