package stepbystep.수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 부녀회장이_될테야 {
public static void main(String[] args) throws NumberFormatException, IOException {
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int m=Integer.parseInt(br.readLine());

//각 층별호수에 따른 인원수를 저장하기위한 배열
int[][] arr=new int[15][15];

//0~14층까지 1호에 1채우기,0층 호수 초기화
for(int i=0;i<15;i++) {
	arr[i][1]=1;
	arr[0][i]=i;
}
//1층부터 14층까지 2호부터 인원수채우기
//핵심은 같은층의 이전호수가 아랫층의 이전호수들의 합과 같다.
//그래서 arr[i][j-1]:이전호수 + arr[i-1][j]:아랫층 같은호수 =>현재 호수
for(int i=1;i<=14;i++) {
	for(int j=2;j<=14;j++) {
		arr[i][j]=arr[i][j-1]+arr[i-1][j];
	}
}
for(int i=0;i<m;i++) {
	int K=Integer.parseInt(br.readLine());
	int N=Integer.parseInt(br.readLine());
	System.out.println(arr[K][N]);
}
}
}
