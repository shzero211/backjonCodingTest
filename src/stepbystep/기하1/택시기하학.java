package stepbystep.기하1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 택시기하학 {
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int m=Integer.parseInt(br.readLine());
	System.out.println(Math.PI*m*m);
	System.out.println(2*m*m);
}
}
