package kanthaara;

import java.util.ArrayList;
import java.util.HashMap;

public class lamdafunction {
public static void main(String[] args) {
	//Lamda for array
	ArrayList<Integer> al=new ArrayList<>();
	al.add(1);
	al.add(2);
	al.add(3);
	al.add(4);
	al.add(5);
    al.forEach(n -> {System.out.println(n);});
	
	// Lamda for map
//	HashMap<Character, Integer> map=new HashMap<>();
//	map.put('a', 1);
//	map.put('b', 2);
//	map.forEach((key,value) -> {System.out.println(key+" : "+value);});
	
	
//	String s="abcdfabcd";
//	String[] str = s.split("");
//	for(int i=0;i<str.length;i++) {
//		if(s.indexOf(str[i])==s.lastIndexOf(str[i])) {
//			System.out.println(str[i]+" "+i);
//		}
//	}
    String s="gowtham";
    for(int i=0;i<s.length()/2;i++) {
    	System.out.print(s.charAt(i));
    }
    for (int i = s.length(); i<=s.length()/2; i--) {
		System.out.print(s.charAt(i));
	}
}
}
