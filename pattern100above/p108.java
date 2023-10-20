package pattern100above;

public class p108 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t=1;
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 5; j++)
			{
		
				
					if(i==j)
					System.out.print(t++);
					else
						System.out.print(0);
				
			}System.out.println();
		}



	}

}
