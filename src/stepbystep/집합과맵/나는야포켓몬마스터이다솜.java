package stepbystep.집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class 나는야포켓몬마스터이다솜 {
public static void main(String[] args) throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st=new StringTokenizer(br.readLine());
	int n=Integer.parseInt(st.nextToken());
	int m=Integer.parseInt(st.nextToken());
	Map<String,Integer> maps=new HashMap<>();
	Map<Integer,String> mapn=new HashMap<>();
	for(int i=0;i<n;i++) {
		String str=br.readLine();
		maps.put(str,i+1);
		mapn.put(i+1,str);
	}
	StringBuilder sb=new StringBuilder();
	for(int i=0;i<m;i++) {
		String s=br.readLine();
		if(s.charAt(0)>='0'&&s.charAt(0)<='9') {
			String s1=mapn.get(Integer.parseInt(s));
			sb.append(s1+"\n");
		}else {
			int n1=maps.get(s);
			sb.append(n1+"\n");
		}
	}
	System.out.println(sb.toString());
}
}
