package stepbystep.재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 하노이탑 {
	static StringBuilder sb=new StringBuilder();
public static void main(String[] args) throws NumberFormatException, IOException {
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int m=Integer.parseInt(br.readLine());
sb.append((int)(Math.pow(2,m)-1)).append("\n");
hanoi(m,1,3,2);
System.out.println(sb.toString());
}
public static void hanoi(int m,int start,int end,int mid) {
	if(m==1) {
		sb.append(start+" "+end+"\n");
		return;
	}
	hanoi(m-1,start,mid,end);
	hanoi(1,start,end,mid);
	hanoi(m-1,mid,end,start);
}
}
