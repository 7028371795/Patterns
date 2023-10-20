package patternAbove50;

public class p56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) 
		{ int t=1;
			for (int j = 0; j < 5; j++)
			{
				if(i+j>=4)
				 System.out.print(" "+(t++));
				else
					System.out.print(" ");
			}System.out.println();
		}

	}

}
