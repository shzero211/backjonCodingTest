package stepbystep.수학2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 베르트랑공준 {
public static void main(String[] args) throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	boolean[] visit=new boolean[123456*2+1];
	visit[0]=true;
	visit[1]=true;
	for(int i=2;i<Math.sqrt(123456*2);i++) {
		for(int j=i*2;j<=123456*2;j+=i) {
			if(!visit[j]) {
				visit[j]=true;
			}
		}
	}
	while(true) {
		int in=Integer.parseInt(br.readLine());
		if(in==0)break;
		int cnt=0;
		for(int i=in+1;i<=in*2;i++) {
			if(!visit[i]) {
				cnt++;
				
			}
			
		}
		System.out.println(cnt);
	}
}
}
