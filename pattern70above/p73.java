package pattern70above;

public class p73 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) 
		{
			int temp=65;
			for (int j = 0; j < 9; j++) 
			{
				if(i+j>=4 && j-i<=4)
				{
					if(j<=4)
					System.out.print((char)temp++);
					else
						System.out.print((char)(temp-j+3));
				}
			//	else
			//		System.out.print(" ");
			}System.out.println();
		}

	}

}
