package stepbystep.수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 분수찾기 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//처음에는 입력값 저장에 사용되다가 반복문이후 에는 이동값을 저장
		int m = Integer.parseInt(br.readLine());
		
		//출력의 분자혹은 분모의 최대값을 저장하는 변수 
		int i = 1;
		
		//이문제에서 지그재그로 1,2,3,4...이렇게 등차수열로 포함하는 
		//값의 개수 가증가하기떄문에
		//반대로 처음부터 1~4500까지 뺴줘서 최초로 음수가 되면
		//그 범위안에 포함되기때문에 반복문을 통해서 최대값과 이동횟수를
		//찾아주는 방식을 사용
		//입력값이 최대 10,000,000이기때문에
		// 4500까지 반복문을 돈다.
		for (i = 1; i < 4500; i++) {
			
			//출력값의 분모혹은 분자의 최대값을 찾기 위한 if 문
			if (m - i <= 0) {
				//System.out.println("m:"+m);
				break;
			}
			//이동횟수를 찾기위해서 i를 뺴줌
			m -= i;
		}
		//System.out.println("i:"+i);
		
		//이동횟수를 저장하기 위한 count
		int count = m;

		// 홀수일때
		if (i % 2 == 1) {
			// 분자는 최대값부터 줄어들고
			for (int j = i; j >= 1; j--) {
				if (count == 1) 
					System.out.print(j + "/");
				count--;
			}
			//count 값 초기화
			count = m;
			// 분모는 1부터 최대값까지 증가
			for (int j = 1; j <= i; j++) {
				if (count == 1) 
					System.out.print(j);
				count--;
			}
		}
		
		// 짝수일때는
		else {
			// 분자는 1부터 최대값까지 증가하고
			for (int j = 1; j <= i; j++) {
				if (count == 1) 
					System.out.print(j+ "/");
				count--;
			}
			//count값 초기화
			count = m;

			// 분모는 최대값부터 1까지 감소한다.
			for (int j = i; j >= 1; j--) {
				if (count == 1) 
					System.out.print(j );
				count--;
			}
		}
	}
}
