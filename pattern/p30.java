package pattern;

public class p30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 12; i++) 
		{
			
			for (int j = 0; j < 6; j++) 
			{
				if(j-i<=-6 || i+j<6)
				{
					if(i<6)
						System.out.print((char)(70-i-j));
					else
						System.out.print((char)(i-6-j+65));
				}
				else
					System.out.print(" ");
			
			}System.out.println();
		}
	}

}
