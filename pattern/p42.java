package pattern;

public class p42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) 
		{ 
			int t=1;
			for (int j = 0; j < 5; j++)
			{
				if(i+j>8 || j-i>=0)
					if(i<5)
					System.out.print(" "+(1+j));
					else
						System.out.print(" "+(j+1));
				else
					System.out.print(" ");
			}System.out.println();
		}

	}

}
