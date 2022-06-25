package stepbystep.집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class 숫자카드2 {
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int m=Integer.parseInt(br.readLine());
	Map<Integer,Integer>map=new HashMap<>();
	StringTokenizer st=new StringTokenizer(br.readLine());
	for(int i=0;i<m;i++) {
		int num=Integer.parseInt(st.nextToken());
		//핵심
		map.put(num,map.get(num)==null?1:map.get(num)+1);
	}
	int n=Integer.parseInt(br.readLine());
	st=new StringTokenizer(br.readLine());
	StringBuilder sb=new StringBuilder();
	for(int i=0;i<n;i++) {
		Integer num1=map.get(Integer.parseInt(st.nextToken()));
		sb.append(num1==null?0+" ":num1+" ");
	}
	System.out.println(sb.toString());
}
}
