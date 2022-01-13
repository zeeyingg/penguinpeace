/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
	/**
	 * Get a default greeting
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}

	/**
	 * Gives a response to a user statement
	 *
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		String response = "";

		if (statement.indexOf("no") >= 0)
		{
			response = "Why so negative?";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
		else if (statement.indexOf("dog") >= 0
						|| statement.indexOf("cat") >= 0)
		{
			response = "Tell me more about your pets";
		} else if(statement.indexOf("Mr. Mykolyk")>=0){
			response = "Mykolyk sensei is a very good teacher";
		} else if(statement.indexOf("weather")>=0){
			response = "I heard it's sunny and warm with a slight chance of rain today.";
		} else if(statement.indexOf("ice cream")>=0){
			response = "Ice cream is delicious. My favorite is strawberry.";
		} else if(statement.indexOf("yes")>=0){
			response = "That's what I like to hear";
		}
			else 
		{
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 6;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";

		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		} else if (whichResponse == 4)
		{
			response = "Huh";
		}  else if (whichResponse == 5){
			response = "How intriguing...";
		}
	return response;
	}
}

/*
How to prioritize responses in the reply method?

We can prioritize responses in the reply method by changing the order of the elseif
statements in getResponse() so that the most prioritized keywords that should be searched for
should come first.

*/
