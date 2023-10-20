package pattern70above;

public class p71 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) 
		{
			int temp=1;
			for (int j = 0; j < 9; j++) 
			{
				if(i+j>=4 && j-i<=4)
				{
					if(j<=4)
					System.out.print(temp++);
					else
						System.out.print(temp-j+3);
				}
			//	else
			//		System.out.print(" ");
			}System.out.println();
		}

	}

}
