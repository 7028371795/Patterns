package pattern;

public class p35 {

	public static void main(String[] args) {
		// TODO Auto-generated method st
int t=0;
		for (int i = 0; i <6 ; i++) 
	{
		for (int j = 0; j <6; j++)
		{
			if(j-i<=0)
			{
				System.out.print((char)(65+t++));
			}
			else
				System.out.print(" ");
		}System.out.println();
	}

	}
}
