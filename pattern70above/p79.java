package pattern70above;

public class p79 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 9; i++)
		{
			for (int j = 0; j < 10; j++)
			{
				if((j-i<=0 && i<5)|| (i+j>=9 && i<5)||(i+j<9 && i>=5)||(j-i>=1 && i>=5))
					System.out.print("*");
				else
					System.out.print(" ");
			}System.out.println();
		}
	}

}
