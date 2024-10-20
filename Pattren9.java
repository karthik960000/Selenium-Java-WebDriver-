package Auto;

public class Pattren9 {

	public static void main(String[] args) {
		int n=6;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
			if(i ==n|| j==1 ||j==n || i==1)
			{
			System.out.print("# ");
			}
			else {
					System.out.print("0 ");
			}
					System.out.print("  ");
			}
			System.out.println(" ");
		}	}
	}
