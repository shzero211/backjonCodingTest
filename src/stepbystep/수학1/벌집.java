package stepbystep.¼öÇĞ1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ¹úÁı {
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int m=Integer.parseInt(br.readLine());
	//1(1)~6(2~7)~12(8~19)~18(20~37)
	int start=1;
	int round=0;
	int count=1;
	while(true) {
		if(start+(6*round)>=m) {
			System.out.println(count);
			break;
		}
		start=start+(6*round);
		count++;
		round++;
		
	}
	
}
}
