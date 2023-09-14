package kanthaara;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Demo1Test {
 public void m1() throws ParseException {
String date="25/05/2023";
SimpleDateFormat input = new SimpleDateFormat("dd/mm/yyyy");
SimpleDateFormat output = new SimpleDateFormat("dd-m-yy");
Date date1 = input.parse(date);
String outputdate = output.format(date1);
System.out.println(outputdate);
}
 
 public static void main(String[] args) {
	String date="25-5-23";
	LocalDate newdate = LocalDate.parse(date).plusDays(7);
	DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-m-yy");
	String formetdate = newdate.format(format);
	System.out.println(formetdate);
}
}