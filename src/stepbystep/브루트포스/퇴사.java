package stepbystep.브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 퇴사 {
	static int m=0;
    //최대 pay의 합을 저장
	static int sum=0;
    
public static void main(String[] args) throws IOException {
	//입력객체
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    //입력 개수
	m=Integer.parseInt(br.readLine());
    //일하는데 걸리는 시간을 담은배열
	int []arr=new int[m];
    //pay를 담은 배열
	int [] pay=new int[m];
    //m개의 입력을 받아 각자 배열에 저장
	for(int i=0;i<m;i++) {
		StringTokenizer st=new StringTokenizer(br.readLine());
		arr[i]=Integer.parseInt(st.nextToken());
		pay[i]=Integer.parseInt(st.nextToken());
	}
	//System.out.println(Arrays.toString(arr));
	//System.out.println(Arrays.toString(pay));
	find(arr,pay,0,0);
	System.out.println(sum);
}

//가장많이 받는 pay를 합산하기위한 dfs 함수
//idx는 현재 일하고있는 일수의합,tmp는 pay의 합
public static void find(int[] arr,int[] pay,int idx,int tmp) {
	//일한 일수의 합이 m일 이상이면
	if(idx>=m) {
		//System.out.println("tmp:"+tmp);
        //최대 pay의 합보다 더많은 pay를 벌수있으면 sum에 삽입
		sum=Math.max(sum, tmp);
		return;
	}
    
	//i의 초기값을 idx로 준이유는 이전 일에는 일을할수가 없기때문
	for(int i=idx;i<m;i++) {
    	//해당일수 전까지의 합인 idx + 해당일수에 일하면 일하는 기간 이 m일을 보다 작으면
        //pay에 값을 더해준다.
		if(i+arr[i]<=m) {
			//System.out.println("idx<m:"+(idx+arr[i])+",tmp:"+(tmp+pay[i]));
			find(arr,pay,i+arr[i],tmp+pay[i]);
		}
        //m일을 넘으면 이전 까지의 pay의 합만 전달(어차피 재귀하면서 if문에서 비교가되서 return됨)
        else {
			//System.out.println("idx>m:"+(idx+arr[i])+",tmp:"+(tmp));
			find(arr,pay,i+arr[i],tmp);
		}
	}
		
}
}