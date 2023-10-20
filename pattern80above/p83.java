package pattern80above;

public class p83 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) 
		{
			int temp=1;
			int temp1=1;
			for (int j = 0; j < 10; j++) 
			{
				if(j-i<=0)
					System.out.print(temp++);
				else if ( i+j>=9) 
					System.out.print(temp1++);
				else
					System.out.print(" ");
			}System.out.println();
		}


	}

}
