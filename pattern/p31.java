package pattern;

public class p31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i <6 ; i++) 
		{
			int t=0;
			for (int j = 0; j <6; j++)
			{
				if(i+j>=5)
				{
					System.out.print(" "+(char)(65+t++));
				}
				else
					System.out.print(" ");
			}System.out.println();
		}

	}

}
