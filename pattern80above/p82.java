package pattern80above;

public class p82 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) 
		{
			for (int j = 0; j < 10; j++) 
			{
				if(j-i<=0 || i+j>=9)
					System.out.print(i+1);
				else
					System.out.print(" ");
			}System.out.println();
		}

	}

}
