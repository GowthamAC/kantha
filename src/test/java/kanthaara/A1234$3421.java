package kanthaara;

import java.util.Arrays;

public class A1234$3421 {
public static void main(String[] args) {
	int [] a= {1,2,3,4,5};
	int n=3;
	for(int i=0;i<n;i++) {
		int j=0;
		int first=a[0];
		for(j=0;j<a.length-1;j++) {
			a[j]=a[j+1];
		}
		a[j]=first;
	}
	System.out.println(Arrays.toString(a));
}
}
