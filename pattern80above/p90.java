package pattern80above;

public class p90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) 
		{
			for (int j = 0; j < 5; j++) 
			{
				if(i==0 ||j==0||j==4||i==4)
					System.out.print((char)(65+15));
				else
					System.out.print((char)(65+16));
			}System.out.println();
		}


	}

}
