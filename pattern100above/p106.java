package pattern100above;

public class p106 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean c=true;
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 5; j++)
			{
				if(j-i<=0)
				{
					if(i==j)
					System.out.print(1);
					else
						System.out.print(0);
				}
			}System.out.println();
		}

	}

}
