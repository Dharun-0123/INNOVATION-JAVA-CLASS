package aa;

public class Auto_ {
public static void main(String[] args) {
	// int a = Integer.valueOf(50);
	Integer intVal =50;
	Double doubleVal =36.456789;
	Boolean bval = true;
	Character cval= 'k';
	
	System.out.println(intVal);
	System.out.println(doubleVal);
	System.out.println(bval);
	System.out.println(cval);
	
	System.out.println("unboxing");
	int d1 = intVal;
	double d2 = doubleVal;
	boolean d3 = bval;
	char d4 = cval;
	
	System.out.println(d1);
	System.out.println(d2);
	System.out.println(d3);
	System.out.println(d4);
}
}
