package pattern100above;

public class p111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int t=5;
		for (int i = 0; i < 5; i++)
		{
			int t2=5;
			for (int j = 0; j < 5; j++)
			{
				if(j-i>=0)
					System.out.print(t2);
				else
					System.out.print(t2--);
				
			}System.out.println();
			//t--;
		}



	}

}
