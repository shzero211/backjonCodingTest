package stepbystep.기하1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 네번째점 {
public static void main(String[] args) throws IOException {
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
StringTokenizer st=new StringTokenizer(br.readLine());
int[][] arr=new int[4][2];
arr[0][0]=Integer.parseInt(st.nextToken());
arr[0][1]=Integer.parseInt(st.nextToken());
st=new StringTokenizer(br.readLine());
arr[1][0]=Integer.parseInt(st.nextToken());
arr[1][1]=Integer.parseInt(st.nextToken());
st=new StringTokenizer(br.readLine());
arr[2][0]=Integer.parseInt(st.nextToken());
arr[2][1]=Integer.parseInt(st.nextToken());
int x=0;
int y=0;
if(arr[0][0]==arr[1][0]) {
	x=arr[2][0];
}else if(arr[1][0]==arr[2][0]) {
	x=arr[0][0];
	
}else {
	x=arr[1][0];
}
if(arr[0][1]==arr[1][1]) {
	y=arr[2][1];
}else if(arr[1][1]==arr[2][1]) {
	y=arr[0][1];
	
}else {
	y=arr[1][1];
}

System.out.println(x+" "+y);

}
}
