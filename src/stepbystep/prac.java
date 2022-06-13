package stepbystep;

import java.util.Arrays;

public class prac{
public static void main(String[] args) {
	int[] arr=new int[3];
	arr[0]=1;
	arr[1]=2;
	arr[2]=3;
	int[] arrn = new int[3];
System.arraycopy(arr, 0,arrn, 0, 3);
System.out.println(Arrays.toString(arrn));
}
}
