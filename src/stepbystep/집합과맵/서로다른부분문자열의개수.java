package stepbystep.���հ���;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ���δٸ��κй��ڿ��ǰ��� {
public static void main(String[] args) throws IOException {
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
Set<String>set=new HashSet<>();
String str=br.readLine();
for(int i=0;i<str.length();i++) {
	String make="";
	for(int j=i;j<str.length();j++) {
		make+=str.charAt(j);
		set.add(make);
	}
}
System.out.println(set.size());
}

}
