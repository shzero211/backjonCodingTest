package stepbystep.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 수정렬하기 {
public static void main(String[] args) throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int[] arr=new int[Integer.parseInt(br.readLine())];
	for(int i=0;i<arr.length;i++) {
		arr[i]=Integer.parseInt(br.readLine());
	}
	Arrays.sort(arr);
	for(int i:arr) {
		System.out.println(i);
	}
}
}
