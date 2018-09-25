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
		
		
		
		
		
	}
}
