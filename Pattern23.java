package Auto;

public class Pattern23 {

			public static void main(String[] args) {
				int n=7;
				for(int i=1;i<=n;i++) {
					for(int j=1;j<=n;j++) {
						if (i==(n+1)/2||j==(n+1)/2||i+j==n+1||i==j) {
							System.out.print("* ");
						}
						else
						{
							System.out.print("  ");
						}
					
				} System.out.println();
					}
			}
		}
