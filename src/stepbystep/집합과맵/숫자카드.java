package stepbystep.집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class 숫자카드 {
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int n=Integer.parseInt(br.readLine());
	Map<Integer,Integer> map=new HashMap<>();
	StringTokenizer st=new StringTokenizer(br.readLine());
	StringBuilder sb=new StringBuilder();
	for(int i=0;i<n;i++) {
		map.put(Integer.parseInt(st.nextToken()),1);
	}
	int m=Integer.parseInt(br.readLine());
	int[] arr=new int[m];
	st=new StringTokenizer(br.readLine());
	for(int i=0;i<m;i++) {
		Integer num=map.get(Integer.parseInt(st.nextToken()));
		if(num!=null) {
			sb.append(num+" ");
		}else {
			sb.append(0+" ");
		}
	}
	System.out.println(sb.toString());
}
}
