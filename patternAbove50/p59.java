package patternAbove50;

public class p59 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 9; i++) 
		{ 
			int t=1;
			for (int j = 0; j < 5; j++)
			{
				if(j-i>=0 || i+j>=8)
				 System.out.print(t++);
				else
					System.out.print(" ");
			}System.out.println();
		}

	}

}
