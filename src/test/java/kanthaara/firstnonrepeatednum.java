package kanthaara;

public class firstnonrepeatednum {
public static void main(String[] args) {
	String s="tester";
	char [] ch=s.toCharArray();
	for (int i = 0; i < ch.length; i++) {
		if(s.indexOf(ch[i])==s.lastIndexOf(ch[i])) { 
			System.out.println(ch[i]+" "+i);
			break;
		}
	}
	
//	int [] a= {1,2,3,5,1,2,3};
//	for (int i = 0; i < a.length; i++) {
//		int count=1;
//		for(int j=i+1;j<a.length;j++) {
//			if(a[i]==a[j]) {
//				count++;
//				a[j]=10;
//			}
//		}
//		if(a[i]!=10 && count==1) {
//			System.out.println(a[i]+" index is "+i);
//			break;
//		}
//	}
}
}
