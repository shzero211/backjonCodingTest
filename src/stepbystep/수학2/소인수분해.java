package stepbystep.수학2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 소인수분해 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		boolean[] visit = new boolean[10000001];
		visit[0] = true;
		visit[1] = true;
		for (int i = 2; i < Math.sqrt(10000000); i++) {
			for (int j = i * 2; j < 10000000; j += i) {
				if (!visit[j])
					visit[j] = true;
			}
		}
		for (int i = 2; i <=num; i++) {
			if (num % i == 0 && !visit[i]) {
				
				System.out.println(i);
				num/=i;
				i--;
				
			}
		}
	}
}
