package stepbystep.수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 달팽이는_올라가고_싶다 {
public static void main(String[] args) throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st=new StringTokenizer(br.readLine());
	int up=Integer.parseInt(st.nextToken());
	int down=Integer.parseInt(st.nextToken());
	int finish=Integer.parseInt(st.nextToken());
	
	int day=(finish-down)/(up-down);
	if((finish-down)%(up-down)!=0) {
		day++;
	}
	System.out.println(day);
}
}
