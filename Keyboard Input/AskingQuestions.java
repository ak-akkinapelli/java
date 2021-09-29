import java.util.Scanner;

public class AskingQuestions
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		int age;
		int height;
		int inches;
		double weight;
		String total;
		System.out.print( "How old are you? " );
		age = keyboard.nextInt();

		System.out.print( "How many feet tall are you?  " );
		height = keyboard.nextInt();
		System.out.print( "And how many inches? " );
		inches = keyboard.nextInt();	

		System.out.print( "How much do you weigh? " );
		weight = keyboard.nextDouble();
		total = String.valueOf(height) + "'" + String.valueOf(inches)+'"';

System.out.println( "So you're " + age + " old, " + total+ " tall and " + weight + " heavy." );
	}
}