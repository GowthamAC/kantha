package kanthaara;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
public class occurence {
	public static void main(String[] args) {
	
String s="aabbccaa";
char ch[]=s.toCharArray();

//Method 1
//HashSet<Character> hs=new HashSet<Character>();
//for (int i = 0; i < ch.length; i++) {
//	hs.add(ch[i]);
//}
//
//for (Character ch1 : hs) {
//	int count=0;
//	for(int i=0;i<ch.length;i++) {
//	if(ch1==ch[i]) {
//		count++;
//	}
//	}
//	System.out.println(ch1+" "+count);
//}

//Method 2
//HashMap<Character, Integer> map = new HashMap<Character, Integer>();
//for (char c : ch) {
//	map.put(c,map.getOrDefault(c, 0) +1);
//}
//for(Entry<Character,Integer> hmap:map.entrySet()) {
//	System.out.println(hmap.getKey()+" "+hmap.getValue());
//}

//Method 3
for(int i=0;i<ch.length;i++) {
	int count=1;
	for (int j = i+1; j < ch.length; j++) {
		if(ch[i]==ch[j]) {
			count++;
			ch[j]='@';
		}
	}
	if(ch[i]!='@') {
		System.out.println(ch[i]+" "+count);
	}
}
}
}
