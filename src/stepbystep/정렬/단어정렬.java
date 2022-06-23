package stepbystep.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class 단어정렬 {
public static void main(String[] args) throws NumberFormatException, IOException {
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int m=Integer.parseInt(br.readLine());
ArrayList<String> arr=new ArrayList<>();
for(int i=0;i<m;i++) {
	String str=br.readLine();
	if(!arr.contains(str)) {
		arr.add(str);
	}

}
Collections.sort(arr,new Comparator<String>() {

	@Override
	public int compare(String o1, String o2) {
		if(o1.length()==o2.length()) {
			for(int i=0;i<o1.length();i++) {
				if(o1.charAt(i)!=o2.charAt(i))
					return o1.charAt(i)-o2.charAt(i);
			}
			return 0;
		}else {
			return o1.length()-o2.length();
		}
	}
	
});
for(int i=0;i<arr.size();i++)
{
System.out.println(arr.get(i));
	
}
}}