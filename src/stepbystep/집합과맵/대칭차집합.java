package stepbystep.ÁýÇÕ°ú¸Ê;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;

public class ´ëÄªÂ÷ÁýÇÕ {
public static void main(String[] args) throws IOException {
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
StringTokenizer st=new StringTokenizer(br.readLine());
int a=Integer.parseInt(st.nextToken());
int b=Integer.parseInt(st.nextToken());
Set<Integer> s1=new HashSet<Integer>();
Set<Integer> s2=new HashSet<Integer>();

st=new StringTokenizer(br.readLine());
for(int i=0;i<a;i++) {
	s1.add(Integer.parseInt(st.nextToken()));
}

st=new StringTokenizer(br.readLine());
for(int i=0;i<b;i++) {
	s2.add(Integer.parseInt(st.nextToken()));
}
int cnt1=0;
int cnt2=0;

Iterator<Integer> iter1=s1.iterator();
Iterator<Integer> iter2=s2.iterator();

while(iter1.hasNext()) {
	int num=iter1.next();
	if(s2.contains(num)) {
		cnt1++;
	}
		
}
while(iter2.hasNext()) {
	int num=iter2.next();
	if(s1.contains(num)) {
		cnt2++;
	}
		
}
System.out.println(a-cnt1+b-cnt2);
}
}
