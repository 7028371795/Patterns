package pattern;

public class p5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 9; i++) 
		{
			for (int j = 0; j < 5; j++)
			{
				if( j-i<=-4 || i+j<5 )
					System.out.print("*");
			}System.out.println();
		}
	}

}
