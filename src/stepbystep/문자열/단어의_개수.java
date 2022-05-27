package stepbystep.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 단어의_개수 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		if(str.equals(" ")) {
			System.out.println(0);
			return;
		}
		String[] strsplit=str.trim().split(" ");

		System.out.println(strsplit.length);
 	}
}