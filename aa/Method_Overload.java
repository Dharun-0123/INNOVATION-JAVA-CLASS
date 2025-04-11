package aa;

public class Method_Overload {
	
	int ans;
	public void add(int a,int b) {
		ans=a+b;
		System.out.println(ans);
	}
	public void add(int a,int b,int c) {
		ans=a+b+c;
		System.out.println(ans);
	}
	public void add(String name,int a)
	{
		System.out.println(name+" "+a);
	}	
public static void main(String[] args) {
	Method_Overload ove=new Method_Overload();
	ove.add(10, 10);
	ove.add("dhaune", 15);
	ove.add(10, 10,10);
}
}
