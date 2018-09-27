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
		askUser();
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
		
		for (int loop = 4; loop < 7; loop += 1)
		{
			JOptionPane.showInternalMessageDialog(null, "This is the " + loop + "'th Run object I'm making");
			String runnerLoop = JOptionPane.showInputDialog(null, "Enter some data for the loop");
			
		}	
	}
	
	private void askUser()
	{
		//--------user hours played
		SeaOfThieves userHours = new SeaOfThieves();
		String response = JOptionPane.showInputDialog(null, "How many hours??");
		while (response == null || !validDouble(response))
		{
			response = JOptionPane.showInputDialog(null, "Dude, come on bro, type in the valid number here man.");
		}
		userHours.setTimeHours(Double.parseDouble(response));
		JOptionPane.showMessageDialog(null, userHours);
		
		
		//----------user order of souls lvl
		response = JOptionPane.showInputDialog(null, "What is your Order of Souls level now?");
		SeaOfThieves userOrderSouls = new SeaOfThieves();
		while (response == null || !validDouble(response))
		{
			response = JOptionPane.showInputDialog(null, "Dude, come on bro, type in the valid number here man.");
		}
		userOrderSouls.setOrderSouls(Double.parseDouble(response));
		JOptionPane.showMessageDialog(null, userOrderSouls);
		
		
		//----------user merchant alliance lvl
		response = JOptionPane.showInputDialog(null, "What is your Merchant's Alliance level now?");
		SeaOfThieves userMerchant = new SeaOfThieves();
		while (response == null || !validDouble(response))
		{
			response = JOptionPane.showInputDialog(null, "Dude, come on bro, type in the valid number here man.");
		}
		userMerchant.setMerchant(Double.parseDouble(response));
		JOptionPane.showMessageDialog(null, userMerchant);
		
		
		//-----------user gold hoarder's level
		response = JOptionPane.showInputDialog(null, "What is your Gold Hoarder's level now?");
		SeaOfThieves userGoldHoarder = new SeaOfThieves();
		while(response == null || !validDouble(response))
		{
			response = JOptionPane.showInputDialog(null, "Dude, come on bro, type in the valid number here man.");
		}
		userGoldHoarder.setGoldLvl(Double.parseDouble(response));
		JOptionPane.showMessageDialog(null, userGoldHoarder);
		
		
		//------------user gold earned
		response = JOptionPane.showInputDialog(null, "How much gold did you earn in this session?");
		SeaOfThieves userGoldEarned = new SeaOfThieves();
		while(response == null || !validInt(response))
		{
			response = JOptionPane.showInputDialog(null, "Dude, come on bro, type in the valid number here man.");
		}
		userGoldEarned.setGoldEarned(Integer.parseInt(response));		
		JOptionPane.showMessageDialog(null, userGoldEarned);
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
