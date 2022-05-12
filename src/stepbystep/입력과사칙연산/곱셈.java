package stepbystep.ÀÔ·Â°ú»çÄ¢¿¬»ê;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class °ö¼À {
public static void main(String[] args) throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int n=Integer.parseInt(br.readLine());
	int m=Integer.parseInt(br.readLine());
	int num1=n*(m%10);
	int num2=n*((m%100)/10);
	int num3=n*(m/100);
	System.out.println(num1);
	System.out.println(num2);
	System.out.println(num3);
	System.out.println(num1+num2*10+num3*100);
}
}
