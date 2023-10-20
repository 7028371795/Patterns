package pattern70above;

public class p75 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 9; i=i+2)
		{
			for (int j = 0; j < 9; j++) 
			{
					if(i%2==0)
						if(j-i<=1)
						System.out.print("*");
					else
						System.out.print(" ");
			}System.out.println();
		}
	}

}
