package ���Ʈ����;

import java.util.Scanner;
//�ٽ�
//�ڹٴ� callby value �̱⶧���� �Լ��� ���ؼ� ���� ���� ���ٲ�
//���Ʈ����=>�ð����⵵�� ����ؼ� ���� Ž�� ��������Ȯ���ؼ� 
//�����ϸ� ����츦 ���� ��� ���⼭�� �ð����⵵�� N^4(4��for ��)
public class ��������_3085 {
	
	public static char[][] board;
	public static int N;
	public static int max=0;
	//�̰� ���������� �׳� ����
	//�ٽ��� ����Ű�����ؼ� ���� 
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
			
			// ��, �� üũ
			arrCheck();
			
			// ������ ��ȯ�� ���� ����
			//swap(board[j][i], board[j+1][i]);
			temp = board[j][i];
			board[j][i] = board[j+1][i];
			board[j+1][i] = temp;
		}
	}
	
	System.out.println(max);
	
}
}
