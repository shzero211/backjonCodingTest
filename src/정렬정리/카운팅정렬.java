package 정렬정리;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 카운팅정렬 {
public static void main(String[] args) throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int m=Integer.parseInt(br.readLine());
	System.out.println("입력받은 값의 개수:"+m);
	StringTokenizer st=new StringTokenizer(br.readLine());
	
	//0~10 범위까지의 수의개수를 저장해줄 배열
	int[] counting=new int[11];
	
	//0~10까지의 범위에있는 m개의 수를 배열에 저장
	for(int i=0;i<m;i++) {
		//입력받은 값을 인덱스 값으로 이용해서 개수 증가
		//인덱스에 값을 증가해주는이떄 이미 정렬은 다된거라고 본다.
		//그냥 인덱스를 사용했을 뿐인데 자동정렬 되는 급이다.
		counting[Integer.parseInt(st.nextToken())]++;
	}
	System.out.println("숫자의 개수를 저장하는 배열:"+Arrays.toString(counting));
	
	//문자열 만들기위한 객체
	StringBuilder sb=new StringBuilder();
	
	//0~10까지 수를 개수만큼 문자열에 실어주는 반복문
	for(int i=0;i<counting.length;i++) {
		while(counting[i]>0) {
			sb.append(i+" ");
			counting[i]--;
		}
	}
	
	System.out.println("정렬후:"+sb.toString());
	
}
}
