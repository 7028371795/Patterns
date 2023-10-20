package pattern;

public class p40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) 
		{ 
			int t=1;
			for (int j = 0; j < 5; j++)
			{
				if(i+j<=4)
					System.out.print(j+t);
				else
					System.out.print(" ");
			}System.out.println();
		}


	}

}
