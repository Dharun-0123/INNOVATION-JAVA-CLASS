package aa;

public class GrandChild  extends Branch1 implements SubMinibranch{

	@Override
	public void extra() {
		// TODO Auto-generated method stub
		System.out.println("500 emplooyes extra");
	}
public static void main(String[] args) {
	GrandChild gc=new GrandChild();
	gc.branchmethod1();
	gc.extra();
	gc.parentCompany();
	
}

}

