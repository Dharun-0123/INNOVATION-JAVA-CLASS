package aa;

public class NonAbstract extends Abstract_method {
	//Explicit 
	@Override
	public void FeatureDesignation() {
		// TODO Auto-generated method stub
		System.out.println("nothing just die");
		//
	}
	public static void main(String[] args) {
		Abstract_method ab=new NonAbstract();
		ab.name();
		ab.designation();
		ab.FeatureDesignation();
	}

}
