package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 날짜계산RE {
	
public static void main(String[] args) throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String [] num=br.readLine().split(" ");
	int a[]=new int[num.length];
	int f1=0,f2 = 0,f3=0;
	int count=0;
	for(int i=0;i<num.length;i++) {
		a[i]=Integer.parseInt(num[i]);
	}
	while(true) {
		if(f1==a[0]&&f2==a[1]&&f3==a[2])
		 break;
		if(f1==15)
			f1=1;
		else
			f1++;
		if(f2==28)
			f2=1;
		else
			f2++;
		if(f3==19)
			f3=1;
		else
			f3++;
		count++;
	}
	
	System.out.println(count);
}
}
