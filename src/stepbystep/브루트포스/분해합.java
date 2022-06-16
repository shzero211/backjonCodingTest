package stepbystep.브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 분해합 {
	static boolean[] visit;
	static int min=Integer.MAX_VALUE;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(br.readLine());
		visit = new boolean[10];

		
		for (int i = m; i >= 0; i--) {
			ArrayList<Integer> list=new ArrayList<>();
			int num = i;
			int cnt = 0;
			while (num >= 10) {
				list.add(num%10);
				num /= 10;
			}
			list.add(num);
			Collections.reverse(list);
			String str="";
			int sum=0;
			
			while(cnt<list.size()) {
				str+=list.get(cnt)+"";
				sum+=list.get(cnt);
				cnt++;
			}
			if((sum+Integer.parseInt(str))==m)	min=Math.min(Integer.parseInt(str),min);
			
		}
		if(Integer.MAX_VALUE>min) {
			System.out.println(min);
		}else {
			System.out.println(0);
		}
	}

}
