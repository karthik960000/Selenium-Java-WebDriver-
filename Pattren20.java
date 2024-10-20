package Auto;

public class Pattren20 {

			public static void main(String[] args) {
				int n=13;
				for(int i=1;i<=n;i++) {
					for(int j=1;j<=n;j++) {
						if (i==1 || i+j==n+1 &&i<=(n+1)/2
							|| i==j && i<=(n+1)/2){
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
