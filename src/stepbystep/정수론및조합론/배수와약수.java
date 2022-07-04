package stepbystep.정수론및조합론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 배수와약수 {
public static void main(String[] args) throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	while(true) {
		StringTokenizer st=new StringTokenizer(br.readLine());
		int l=Integer.parseInt(st.nextToken());
		int r=Integer.parseInt(st.nextToken());
		if(l==0&&r==0) {
			break;
		}
		if(r>l&&r%l==0) System.out.println("factor");
		else if(r<l&&l%r==0) System.out.println("multiple");
		else System.out.println("neither");
	}
}
}
