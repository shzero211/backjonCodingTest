package 브루트포스;

import java.util.Scanner;
//핵심
//자바는 callby value 이기때문에 함수를 통해서 원래 값을 못바꿈
//브루트포스=>시간복잡도를 계산해서 완전 탐색 가능한지확인해서 
//가능하면 모든경우를 만들어서 계산 여기서는 시간복잡도가 N^4(4중for 문)
public class 사탕게임_3085 {
	
	public static char[][] board;
	public static int N;
	public static int max=0;
	//이건 사용안하지만 그냥 놔둠
	//핵심을 상기시키기위해서 놔둠 
	public static void swap(char a,char b) {
		char temp=a;
		a=b;
		b=temp;
		
	}
	
	public static void arrCheck() {
		for(int i=0;i<N;i++) {
			int count=1;
			for(int j=0;j<N-1;j++) {
				if(board[i][j]==board[i][j+1])
					count++;
				else 
					count=1;
				max=Math.max(max,count);
			}
			
		}
		
		for(int i=0;i<N;i++) {
			int count=1;
			for(int j=0;j<N-1;j++) {
				if(board[j][i]==board[j+1][i])
					count++;
				else 
					count=1;
				max=Math.max(max,count);
			}
			
		}
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	N=sc.nextInt();
	board=new char[N][N];
	
	for(int i=0;i<N;i++) {
		String str=sc.next();
		for(int j=0;j<board[i].length;j++) {
			board[i][j]=str.charAt(j);
		}
	}
	
	for(int i=0;i<N;i++) {
		for(int j=0;j<N-1;j++) {
			char temp = board[i][j];
			board[i][j] = board[i][j+1];
			board[i][j+1] = temp;
			arrCheck();
			temp = board[i][j];
			board[i][j] = board[i][j+1];
			board[i][j+1] = temp;
		}
	}
	for(int i=0;i<N;i++) {
		for(int j=0;j<N-1;j++) {
			char temp = board[j][i];
			board[j][i] = board[j+1][i];
			board[j+1][i] = temp;
			
			// →, ↓ 체크
			arrCheck();
			
			// 이전에 교환한 문자 복구
			//swap(board[j][i], board[j+1][i]);
			temp = board[j][i];
			board[j][i] = board[j+1][i];
			board[j+1][i] = temp;
		}
	}
	
	System.out.println(max);
	
}
}
