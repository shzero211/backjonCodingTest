package stepbystep.수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ACM호텔 {
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	//테스트 데이터 개수
	int m=Integer.parseInt(br.readLine());
	
	for(int i=0;i<m;i++) {
	StringTokenizer st=new StringTokenizer(br.readLine());
	//H:층수,W:각층수 방수,N:몇번째 손님
	int H=Integer.parseInt(st.nextToken());
	int W =Integer.parseInt(st.nextToken());
	int N=Integer.parseInt(st.nextToken());
	//호텔의 호수에서 층수를 나타내는 변수
	int head=N%H;
	//호텔의 호수에서 방을 나타내는 변수
	int tail=N/H;
	
	//호수의 층수를 구할때 나머지가 0이될경우
	if(head==0) {
		head=H;
		tail-=1;
	}
	//방수에 +1 을해줘야함
	tail+=1;
	
	//문자로 만들어주고
	String strhead=head+"";
	String strtail=tail+"";
	String answer="";
	//호수의 방수가 10보다작으면 0을 앞에 붙여줌
	if(tail<10) {
		answer=strhead+"0"+strtail;
	}else {
		answer=strhead+strtail;
	}

	System.out.println(answer);
	}
	
}
}
