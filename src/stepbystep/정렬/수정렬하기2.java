package stepbystep.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class 수정렬하기2 {
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	StringBuilder sb=new StringBuilder();
	int m=Integer.parseInt(br.readLine());
	ArrayList<Integer> arr=new ArrayList<>();
	for(int i=0;i<m;i++) {
		arr.add(Integer.parseInt(br.readLine()));
	}
	Collections.sort(arr);
	for(int i: arr) {
		sb.append(i+"\n");
	}
	System.out.println(sb.toString());
}

}
