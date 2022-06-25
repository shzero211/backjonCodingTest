package stepbystep.집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class 문자열집합 {
public static void main(String[] args) throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st=new StringTokenizer(br.readLine());
	int n=Integer.parseInt(st.nextToken());
	int m=Integer.parseInt(st.nextToken());
	Map<String,Integer> map=new HashMap<>();
	for(int i=0;i<n;i++) {
		map.put(br.readLine(),1);
	}
	int cnt=0;
	for(int i=0;i<m;i++) {
		if(map.get(br.readLine())!=null) {
			cnt++;
		}
	}
	System.out.println(cnt);
}
}
