package stepbystep.���ڿ�;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class �ܾ���_���� {
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