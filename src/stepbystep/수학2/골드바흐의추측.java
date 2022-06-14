package stepbystep.수학2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 골드바흐의추측 {
public static void main(String[] args) throws NumberFormatException, IOException {
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
boolean[] visit=new boolean[100001];
visit[0]=true;
visit[1]=true;

for(int i=2;i<Math.sqrt(10000);i++) {
	for(int j=i*2;j<10000;j+=i) {
		if(!visit[j]) visit[j]=true;
	}
}

int m=Integer.parseInt(br.readLine());

for(int i=0;i<m;i++) {
	int num=Integer.parseInt(br.readLine());
	int head=num/2;
	int tail=num/2;
	while(true) {
		
		if(!visit[head]&&!visit[tail]) {
			System.out.println(head+" "+tail);
			break;
		}else {
			head--;
			tail++;
		}
	}
}
}
}
