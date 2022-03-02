package �ڵ��׽�Ʈ_����.����;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ������������_6588 {
public static void main(String[] args) throws NumberFormatException, IOException {
	//�ٽ��� �Ƹ�����ü�� i�� n-i�� ���ؾ� �Ѵٴ� ���̴�.
	int[] arr=new int[1000001];
	Arrays.fill(arr,1);
	for(int i=2;i<1000001;i++) {
		for(int j=2;i*j<1000001;j++) {
			arr[i*j]=0;
		}
	}
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	while(true) {
		boolean check=false;
		int n=Integer.parseInt(br.readLine());
		if(n==0) break;
		for(int i=2;i<=n/2;i++) {
			if(arr[i]!=0&&arr[n-i]!=0) {
				System.out.println(n+" "+"="+" "+i+" "+"+"+" "+(n-i));
				check=true;
				break;
			}
		}
		if(!check) {
			System.out.println("Goldbach's conjecture is wrong.");
		}
		
	}
}
}
