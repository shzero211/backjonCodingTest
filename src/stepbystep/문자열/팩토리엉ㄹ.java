package stepbystep.¹®ÀÚ¿­;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ÆÑÅä¸®¾û¤© {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int m=Integer.parseInt(br.readLine());
		int answer=1;
		if(m==0) {
			System.out.println(1);
			return;
		}else {
			for(int i=1;i<=m;i++) {
				answer*=i;
			}
		}
		System.out.println(answer);
	}
}
