public class ModulusAnimation
{
	public static void main( String[] args ) throws Exception
	{
		int repeats = 5;
		int steps_per_second = 10;

		for ( int i=0; i<repeats*20 ; i++ )
		{
			if ( i%20 == 0 )
				System.out.print(" .-_-..... \r");
			else if ( i%20 == 1 )
				System.out.print(" ..-_-.... \r");
			else if ( i%20 == 2 )
				System.out.print(" ...-_-... \r");
			else if ( i%20 == 3 )
				System.out.print(" ....-_-.. \r");
			else if ( i%20 == 4 )
				System.out.print(" .....-_-. \r");
			else if ( i%20 == 5 )
				System.out.print(" ......-_- \r");
			else if ( i%20 == 6 )
				System.out.print(" .......-_ \r");
			else if ( i%20 == 7 )
				System.out.print(" -.......- \r");
			else if ( i%20 == 8 )
				System.out.print(" _-....... \r");
			else if ( i%20 == 9 )
				System.out.print(" -_-...... \r");
			else if ( i%20 == 10 )
				System.out.print(" .-_-..... \r");

			Thread.sleep(1000/steps_per_second);
		}
		
	}
}