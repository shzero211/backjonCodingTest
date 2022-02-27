package 수학1;

import java.util.Scanner;

public class 손익분기점 {
public static void main(String[] args) throws Exception{
	//특징은 수학공식 처럼 수식을 내서 풀수있다는거, 반복문 사용하면 21억 이상수들어가면 시간초과발생
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	//n(제품수)>a/(c-b)
	if(c-b<=0) {
		System.out.println(-1);
		return;
	}
	System.out.println((a/(c-b))+1);
}
}
