package controller;

//--------- Import Section --------
import model.SeaOfThieves;
import javax.swing.JOptionPane;

public class IfController
{
	/**
	 * Builds the instance of the controller
	 */
	public IfController()
	{
		
	}
	
	/**
	 * This is where the program starts calling methods to run the program
	 */
	public void start()
	{
		loopy();
	}
	
	private void loopy()
	{
		//----Define variable before loop
		boolean isDone = false;
		int count = 0;
		int compNumber = 17;
		
		while (!isDone)		// while true-------Test the variable
		{
			JOptionPane.showMessageDialog(null, "give me some loooooooops");
			//eventually change the loop variable
			count ++;
			if (count >= 0)
			{
				isDone = true;  //-----update the variable
			}
			
		}
		
		while (compNumber != 20)
		{
			JOptionPane.showMessageDialog(null, compNumber + " is the wrong number bud, let's go up one ey?");
			compNumber++;
		}
		
		for (int loop = 0; loop < 30; loop += 2)
		{
			JOptionPane.showInternalMessageDialog(null, "The loop value is: " + loop);
		}	
	}
	
	private void askUser()
	{
		String response = JOptionPane.showInputDialog, "How many hours??";
		
		while (!validDouble(response))
		{
			
		}
	}
	
	public boolean validInt(String maybeInt)
	{
		boolean isValid = false;
		
		try
		{
			Integer.parseInt(maybeInt);
			isValid = true;
		}
		catch(NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "Please type a valid\ninteger value");
		}
		
		return isValid;
	}
	
	public boolean validDouble(String maybeDouble)
	{
		boolean isValid = false;
		
		try
		{
			Double.parseDouble(maybeDouble);
			isValid = true;
		}
		catch(NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "This requires a double value");
		}
		
		return isValid;
	}
	
}
