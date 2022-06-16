package stepbystep.재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class 하노이탑 {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        move(N, 1, 3, 2); // 3개의 원판을 1번타워에서 3번 타워로 옮기고 2번 타워는 서브로 사용.
    }

	private static void move(int N, int start, int end, int sub) {
    	if( N==1 ) {
        	System.out.println(start + " -> " + end);
            return ;
        }
        
        move(N-1, start, sub, end); // N-1개를 목표 지점이 아닌 타워에다가 옮겨 놔야 가장 큰 원판을 옮길 수 있겠죠?
        	move(1, start, end, sub); // 위에 move 메소드가 끝나면, sub에 나머지 원판이 쌓여있고, 3번 타워에는 비워있게 되어서 바로 큰 원판을 옮기면 된다.
        move(N-1, sub, end, start); // 아까 옮겨 놓았던 원판을 다시 sub -> end 타워로 옮기는 호출을 한다.
    }
}
