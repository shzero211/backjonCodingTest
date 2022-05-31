package stepbystep.수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 설탕배달 {
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int m=Integer.parseInt(br.readLine());
	if(m==4||m==7) {
		System.out.println(-1);
		return;
	}
	if(m%5==0) {
		System.out.println(m/5);
		return;
	}else if(m%5==1||m%5==3) {
		System.out.println(m/5+1);
		return ;
	}else if(m%5==2||m%5==4) {
		System.out.println(m/5+2);
		return;
	}
	
}
}
