package Auto;

public class Pattren13 {

	public static void main(String[] args) {
		int n=10;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
			if(i==1 && j!=1 && j!=n 
				|| j==1 && i!=n && i!=1
				|| i==n && j!=1 && j!=n
				|| j==n && i!=1 && i!=n ) 
			{
			System.out.print("*");
			} 
			else {
					System.out.print(" ");
			}
					System.out.print("  ");
			}
			System.out.println(" ");
		}	}
	}