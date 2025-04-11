package aa;

public class Childs2  extends Parent_1{
public void property() {
	System.out.println("Can built a small apartment");	
}
public static void main(String[] args) {
	Parent_1 p1=new Child1();
	Parent_1 p2=new Childs2();
	
	p1.property();
	p2.property();	
}

}
