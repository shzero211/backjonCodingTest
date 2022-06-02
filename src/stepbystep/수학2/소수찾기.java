package stepbystep.수학2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 소수찾기 {
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int m=Integer.parseInt(br.readLine());
	StringTokenizer st=new StringTokenizer(br.readLine());
	
	//인덱스에 값이 소수 이면 false, 소수가 아니면 true
	//최대 1000 까지 수를 소수 확인해야하기때문에
	boolean[] numarr=new boolean[1001];
	//소수 개수
	int answer=0;
	//0과1은 소수에서 제외
	numarr[0]=true;
	numarr[1]=true;
	//에라토스테네스의체 를 이용한 소수 boolean 배열 만들기
	//제곱근 까지의 수까지만 확인해주면된다.
	for(int i=2;i<=50;i++) {
		//2배부터시작
		int k=2;
		//값이 1000을 넘기전까지 i의 배수 소수확인
		while(true) {
			if(i*k>1000) break;
			numarr[i*k]=true;
			k++;
		}
	}
	
	for(int i=0;i<m;i++) {
		int num=Integer.parseInt(st.nextToken());
		//소수이면
		if(numarr[num]==false) {
			answer++;
		}
	}
	System.out.println(answer);
}
}
