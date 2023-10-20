package pattern80above;

public class p81 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++)
		{
			int temp=1;
			for (int j = 0; j < 10; j++) 
			{
				if(j-i<=0 || i+j>=9)
					if(j<=4)
					System.out.print(temp++);
					else
						System.out.print(--temp);
				else
					System.out.print(" ");
			}System.out.println();
		}

	}

}
