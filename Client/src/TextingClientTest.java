/**
 * Test class implementation for the client class
 * @author nferry@email.sc.edu
 */
public class TextingClientTest
{
	/**
	 * Main method for the test class
	 * @param args
	 */
	public static void main(String[] args)
	{
		// Create a TextingClientJF object
		TextingClientJF application;
		
		/*
		 * Create a new client on the local host address if the args length is 0, else
		 * create the client on the host address stored at the 0 index of args
		 */
		if (args.length == 0)
			application = new TextingClientJF( "127.0.0.1");
		else
			application = new TextingClientJF( args[0]);
		
		// Call the runClient method contained within the newly created application object
		application.runClient();
		
		
	} // end main method
	
} // end TextingClientTest class 