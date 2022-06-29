package stepbystep.±âÇÏ1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Âü¿Ü¹ç {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(br.readLine());
		
		int[] arr = new int[6];
		int rowMax = 0;
		int colMax = 0;
		int rowMin = 0;
		int colMin = 0;
		int indexr = 0;
		int indexc = 0;
		for (int i = 0; i < 6; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int dir = Integer.parseInt(st.nextToken());
			arr[i] = Integer.parseInt(st.nextToken());
			if ((dir == 1 || dir == 2) && rowMax < arr[i]) {
				rowMax = arr[i];
				indexr = i;
			}
			if ((dir == 4 || dir == 3) && colMax < arr[i]) {
				colMax = arr[i];
				indexc = i;
			}
		}
		int right=0;
		int left=0;
		if (indexr + 1 == 6) {
			right=arr[0];
		} else {
			right=arr[indexr+1];
		}
		if (indexr -1 == -1) {
			left=arr[5];
		} else {
			left=arr[indexr-1];
		}
		colMin=Math.abs(right-left);
		
		if (indexc + 1 == 6) {
			right=arr[0];
		} else {
			right=arr[indexc+1];
		}
		if (indexc -1 == -1) {
			left=arr[5];
		} else {
			left=arr[indexc-1];
		}
		rowMin=Math.abs(right-left);
		System.out.println(((rowMax*colMax)-(rowMin*colMin))*m);
	}
}
