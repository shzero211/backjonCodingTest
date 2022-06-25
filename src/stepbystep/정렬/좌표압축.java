package stepbystep.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class 좌표압축 {
public static void main(String[] args) throws IOException {
	BufferedReader  br=new BufferedReader(new InputStreamReader(System.in));
	StringBuilder sb=new StringBuilder();
	int m=Integer.parseInt(br.readLine());
	int[] origin=new int[m];
	int[] sorted=new int[m];
	HashMap<Integer,Integer> map=new HashMap<>();
	StringTokenizer st=new StringTokenizer(br.readLine());
	for(int i=0;i<m;i++) {
		int num=Integer.parseInt(st.nextToken());
		origin[i]=num;
		sorted[i]=num;
	}
	
	Arrays.sort(sorted);
	int idx=0;
	for(int num:sorted) {
		if(!map.containsKey(num)) {
			map.put(num,idx++);
		}
	}
	
	for(int i=0;i<m;i++) {
		sb.append(map.get(origin[i])+" ");
		}
	
	System.out.println(sb.toString());
	
}
}
