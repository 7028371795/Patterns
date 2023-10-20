package patternAbove50;

public class p57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t=1;
		for (int i = 0; i < 5; i++) 
		{ 
			for (int j = 0; j < 5; j++)
			{
				if(j-i<=0)
				 System.out.print((t++));
				else
					System.out.print(" ");
			}System.out.println();
		}



	}

}
