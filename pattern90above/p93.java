package pattern90above;

public class p93 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 10; j++)
			{
				if(j-i==0 || i+j==8)
					System.out.print("N");
				else
					System.out.print(" ");
			}System.out.println();
		}

	}

}
