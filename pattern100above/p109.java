package pattern100above;

public class p109 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t=1;
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 5; j++)
			{
				if(i+j>=4)
					System.out.print(t);
				else
					System.out.print(1);
				
			}System.out.println();t++;
		}



	}

}
