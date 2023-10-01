package kanthaara;

public class lamdachild {
public static void main(String[] args) {
	lamdaparent pobj=(a) -> System.out.println(a+" Functional interface");
	pobj.run(10);
}
}