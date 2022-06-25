package stepbystep.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class 나이순정렬 {
	static class human{
		int age;
		String name;
		int idx;
		human(int age,String name,int idx){
			this.age=age;
			this.name=name;
			this.idx=idx;
		}
	}
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int m=Integer.parseInt(br.readLine());
	human[] humans=new human[m];
	for(int i=0;i<m;i++) {
	StringTokenizer st=new StringTokenizer(br.readLine());
	human h=new human(Integer.parseInt(st.nextToken()),st.nextToken(),i);
	humans[i]=h;
	}
	Arrays.sort(humans,new Comparator<human>() {

		@Override
		public int compare(human o1, human o2) {
			if(o1.age==o2.age) {
				return o1.idx-o2.idx;
			}else {
				return o1.age-o2.age;
			}
		}
		
	});
	for(int i=0;i<m;i++) {
		System.out.println(humans[i].age+" "+humans[i].name);
	}
	
	
	
	
	
	
	
}
}
