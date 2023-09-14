package kanthaara;

public class reversestring {
public static void main(String[] args) {
	String s="gowthamac";
	//Method 1
//	for (int i = s.length()-1; i>=0; i--) {
//		System.out.print(s.charAt(i));
//	}
	
	//Method2
//	String s1="";
//	for (int i = 0; i < s.length(); i++) {
//		s1=s.charAt(i)+s1;
//	}
//	System.out.println(s1);
	
	//Method3
//	StringBuilder sbr = new StringBuilder(s);
//	System.out.println(sbr.reverse());
	
	//Method4
//	char [] ch=s.toCharArray();
//	for (int i = ch.length-1; i >=0; i--) {
//		System.out.print(ch[i]);
//	}
	
	//Method5
	int length=s.length()-1;
	reversestring.reverse(s,length);
	
}
public static void reverse(String s,int length) {
	if(length>=0) {
	System.out.print(s.charAt(length));
	length--;
	reverse(s,length);
	}
}
}
