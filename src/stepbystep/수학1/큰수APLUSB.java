package stepbystep.수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 큰수APLUSB {
public static void main(String[] args) throws IOException {
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
StringTokenizer st=new StringTokenizer(br.readLine());
String stnum1=st.nextToken();
String stnum2=st.nextToken();
String temp="";

//문자열의 길이를 맞춰주기 위해서 긴길이의 문자열을 stnum1에 배치하기위한 교환
if(stnum1.length()<stnum2.length()) {
	temp=stnum1;
	stnum1=stnum2;
	stnum2=temp;
}
//문자열 길이가 같아질때까지 길이가 짧은 문자열에 0을 앞에 붙여주기
while(stnum2.length()!=stnum1.length()) {
	stnum2="0"+stnum2;
}

//10을 넘으면 앞에수에 1을 더해주기위한 boolean
boolean flag=false;
//새로 더해진수를 저장하기 위한 변수
StringBuilder sb=new StringBuilder();
//끝에자리부터 더하기를 1자리씩하는 반복문
for(int i=stnum1.length()-1;i>=0;i--) {
	//각자리수
	int a;
	int b;
	//이전에 10을 넘었으면 +1 아니면 그대로
	if(flag==true) {
		a=Integer.parseInt(stnum1.charAt(i)+"")+1;
		b=Integer.parseInt(stnum2.charAt(i)+"");
	}else {
		a=Integer.parseInt(stnum1.charAt(i)+"");
		b=Integer.parseInt(stnum2.charAt(i)+"");
	}

	//이번 자리수에서10을 넘으면 boolean을 바꿔주고 뒷자리를 새로운 숫자에 추가
	if(a+b>=10) {
		flag=true;
		String last=((a+b)+"").charAt(1)+"";
		sb.insert(0,last);
		continue;
	}
	//아닌경우는 flag를 바꿔주고 그냥 더해서 새로운숫자에 추가
	else {
		flag=false;
		String last=(a+b)+"";
		sb.insert(0,last);
	}

	
}
//끝날때 flag가 true이면 1이 올라갔기 떄문에 출력에 추가
//아닌경우는 그냥 출력
if(flag==true) {
	System.out.println("1"+sb.toString());
}else {
	System.out.println(sb.toString());
}
}
}
