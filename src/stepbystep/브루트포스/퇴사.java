package stepbystep.���Ʈ����;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ��� {
	static int m=0;
    //�ִ� pay�� ���� ����
	static int sum=0;
    
public static void main(String[] args) throws IOException {
	//�Է°�ü
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    //�Է� ����
	m=Integer.parseInt(br.readLine());
    //���ϴµ� �ɸ��� �ð��� �����迭
	int []arr=new int[m];
    //pay�� ���� �迭
	int [] pay=new int[m];
    //m���� �Է��� �޾� ���� �迭�� ����
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

//���帹�� �޴� pay�� �ջ��ϱ����� dfs �Լ�
//idx�� ���� ���ϰ��ִ� �ϼ�����,tmp�� pay�� ��
public static void find(int[] arr,int[] pay,int idx,int tmp) {
	//���� �ϼ��� ���� m�� �̻��̸�
	if(idx>=m) {
		//System.out.println("tmp:"+tmp);
        //�ִ� pay�� �պ��� ������ pay�� ���������� sum�� ����
		sum=Math.max(sum, tmp);
		return;
	}
    
	//i�� �ʱⰪ�� idx�� �������� ���� �Ͽ��� �����Ҽ��� ���⶧��
	for(int i=idx;i<m;i++) {
    	//�ش��ϼ� �������� ���� idx + �ش��ϼ��� ���ϸ� ���ϴ� �Ⱓ �� m���� ���� ������
        //pay�� ���� �����ش�.
		if(i+arr[i]<=m) {
			//System.out.println("idx<m:"+(idx+arr[i])+",tmp:"+(tmp+pay[i]));
			find(arr,pay,i+arr[i],tmp+pay[i]);
		}
        //m���� ������ ���� ������ pay�� �ո� ����(������ ����ϸ鼭 if������ �񱳰��Ǽ� return��)
        else {
			//System.out.println("idx>m:"+(idx+arr[i])+",tmp:"+(tmp));
			find(arr,pay,i+arr[i],tmp);
		}
	}
		
}
}