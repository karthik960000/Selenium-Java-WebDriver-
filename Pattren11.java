package Auto;

public class Pattren11 {

	public static void main(String[] args) {
		int n=7;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
			if(i==j||j==n||j==1||i==n||i==1||i+j==n+1)
			{
			System.out.print("#  ");
			}
			else {
					System.out.print(" 0 ");
			}
			}
			System.out.println();
		}	}
	}
