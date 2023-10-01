package kanthaara;

import java.util.HashMap;

public class map {
public static void main(String[] args) {
String s="my name is gowtham";
int count=1;
for (int i = 0; i < s.length(); i++) {
	char ch=s.charAt(i);
	if(ch==' ') {
		count++;
	}
}
System.out.println(count);
}
}