package kanthaara;

import java.text.SimpleDateFormat;
import java.util.Date;

public class dateformatter {
public static void main(String[] args) {
	SimpleDateFormat input = new SimpleDateFormat("dd-MM-yy");
	Date date = new Date();
	String output = input.format(date);
	System.out.println(output);
}
}
