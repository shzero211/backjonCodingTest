package ��������;

public class ������ {
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
		//�ǹ����� ū �����͸� ã��
		while(left<=end&&array[left]<=array[pivot])
			left++;
		//�ǹ����� ���� �����͸� ã��
		while(right>start&&array[right]>=array[pivot])
			right--;
		//�ε����� �������ٸ� �ǹ��� �������� ��ȯ
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
