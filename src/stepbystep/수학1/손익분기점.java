package stepbystep.수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 손익분기점 {
public static void main(String[] args) throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st=new StringTokenizer(br.readLine());
	int base=Integer.parseInt(st.nextToken());
	int p1=Integer.parseInt(st.nextToken());
	int p2=Integer.parseInt(st.nextToken());

	if(p1>=p2) {
		System.out.println(-1);
		return;
	}else {
		//while문으로 풀시에는 시간초과가 발생하고 21억에 곱하기를사용하면
		//int 의 범위를 초과하기때문에 이상한 값이 발생한다
		//카테코리가 수학이기 때문에 방정식의 정실을 이용해서
		//(고정비용+가변비용*몇대)=판매비용*몇대 인순간에 손익분기점 직전이기 떄문에
		//고정비용/(판매비용-가변비용)+1 하는 순간이 손익 분기 점이라는것을 알수 있다.
		System.out.println(base/(p2-p1)+1);
		return;
	}
	
	
}
}
