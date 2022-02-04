import java.util.Scanner;

/**
 * A simple class to run the Magpie class.
 * @author Laurie White
 * @version April 2012
 */
public class MagpieRunner2
{

	/**
	 * Create a Magpie, give it user input, and print its replies.
	 */
	public static void main(String[] args)
	{
		Magpie2 maggie = new Magpie2();

		System.out.println (maggie.getGreeting());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();
		statement = statement.trim();


		while (!statement.equals("Bye"))
		{
			if(statement.length()==0){
				System.out.println("Say something I'm giving up on you");
				statement = in.nextLine(); // this is the computer equivalent of waiting for the user to say something
		} else {
			System.out.println (maggie.getResponse(statement));
			statement = in.nextLine();
		}
	}
}
}
