package stepbystep.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 소트인사이드 {
public static void main(String[] args) throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String str=br.readLine();
	int[] arr=new int[str.length()];
	int[] count=new int[10];
	ArrayList<Integer> list=new ArrayList<>();
	for(int i=0;i<str.length();i++) {
		arr[i]=Integer.parseInt(str.charAt(i)+"");
	}
	for(int i=0;i<arr.length;i++) {
		count[arr[i]]++;
	}
	for(int i=0;i<count.length;i++) {
		while(count[i]>0){
			list.add(i);
			count[i]--;
		}
	}
	Collections.reverse(list);
	for(int i=0;i<list.size();i++) {
		System.out.printf("%d",list.get(i));
	}
}
}
