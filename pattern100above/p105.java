
public class p105 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=1;
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 5; j++)
			{
				if(count%2==0)
				{
					System.out.print(0);
					count++;
				}
				else
				{
					System.out.print(1);
					count++;
				}
			}System.out.println();
		}
  

	}

}
