package stepbystep.����;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class �¾y�����ϱ� {
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int m=Integer.parseInt(br.readLine());
	int[][] arr=new int[m][2];
	for(int i=0;i<m;i++) {
		StringTokenizer st=new StringTokenizer(br.readLine());
		arr[i][0]=Integer.parseInt(st.nextToken());
		arr[i][1]=Integer.parseInt(st.nextToken());
	}
	Arrays.sort(arr,new Comparator<int[]>() {
		@Override
		public int compare(int[] o1, int[] o2) {
			if(o1[0]==o2[0]) {
				return o1[1]-o2[1];
				
			}else {
				return o1[0]-o2[0];
			}
		}
	});
	for(int i=0;i<m;i++) {
		System.out.println(arr[i][0]+" "+arr[i][1]);
	}
}
}
