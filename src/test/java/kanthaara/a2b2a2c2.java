package kanthaara;

public class a2b2a2c2 {
	public static void main(String[] args) {
		String s = "aabbaacc";
		char ch[] = s.toCharArray();
		boolean b[] = new boolean[ch.length];
		for (int i = 0; i < b.length; i++) {
			int count = 0;
			if (b[i] == false) {
				for (int j = i; j < b.length; j++) {
					if (ch[i] == ch[j]) {
						count++;
						b[i] = true;
					} else {
						break;
	}
	}
	if(count>1)
	System.out.println(ch[i] + " : " + count);
	}
	}
	}
}
