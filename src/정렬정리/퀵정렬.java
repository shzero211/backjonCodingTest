package 정렬정리;

public class 퀵정렬 {
public static void main(String[] args) {
	int[] array= {5,7,9,0,3,1,6,2,4,8};
	quickSort(array,0,array.length-1);
	for(int i:array) {
		System.out.printf("%d",i);
	}
}
public static void quickSort(int[] array,int start,int end) {
	if(start>=end)
		return;
	int pivot=start;
	int left=start+1;
	int right=end;
	while(left<=right) {
		//피벗보다 큰 데이터를 찾기
		while(left<=end&&array[left]<=array[pivot])
			left++;
		//피벗보다 작은 데이터를 찾기
		while(right>start&&array[right]>=array[pivot])
			right--;
		//인덱스가 엇갈린다면 피벗과 작은값을 교환
		if(left>right) {
			int tmp=array[right];
			array[right]=array[pivot];
			array[pivot]=tmp;
			quickSort(array, start,right-1);
			quickSort(array,right+1, end);
		}else {
			int tmp=array[right];
			array[right]=array[left];
			array[left]=tmp;
		}
		
	}
}
}
