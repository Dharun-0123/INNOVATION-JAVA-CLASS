
public class number_pat {
public static void main(String[] args) {
	int i,j;
	int n=5;
	
	for(i=1;i<=n;i++)
	{
		for(j=0;j<=n-i;j++) {
			System.out.print(" ");
		}
		for(j=1;j<=i;j++) {
			System.out.print(i+" ");
		}
		
	
		System.out.println();
	}
	
	
	
}

}
