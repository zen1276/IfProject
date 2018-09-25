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
	
	/*private void loopy()
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
	}*/
	
	private void askUser()
	{
		//--------user hours played
		String response = JOptionPane.showInputDialog(null, "How many hours??");
		SeaOfThieves userHours = new SeaOfThieves();
		while (!validDouble(response))
		{
			response = JOptionPane.showInputDialog(null, "Dude, come on bro, type in the valid number here man.");
		}
		userHours.setTimeHours(Integer.parseInt(response));
		
		
		//----------user order of souls lvl
		response = JOptionPane.showInputDialog(null, "What is your Order of Souls level now?");
		SeaOfThieves userOrderSouls = new SeaOfThieves();
		while (!validDouble(response))
		{
			response = JOptionPane.showInputDialog(null, "Dude, come on bro, type in the valid number here man.");
		}
		userOrderSouls.setOrderSouls(Double.parseDouble(response));
		
		
		//----------user merchant alliance lvl
		response = JOptionPane.showInputDialog(null, "What is your Merchant's Alliance level now?");
		SeaOfThieves userMerchant = new SeaOfThieves();
		while (!validDouble(response))
		{
			response = JOptionPane.showInputDialog(null, "Dude, come on bro, type in the valid number here man.");
		}
		userMerchant.setMerchant(Double.parseDouble(response));
		
		
		//-----------user gold hoarder's level
		response = JOptionPane.showInputDialog(null, "What is your Gold Hoarder's level now?");
		SeaOfThieves userGoldHoarder = new SeaOfThieves();
		while(!validDouble(response))
		{
			response = JOptionPane.showInputDialog(null, "Dude, come on bro, type in the valid number here man.");
		}
		userGoldHoarder.setGoldLvl(Double.parseDouble(response));
		
		
		//------------user gold earned
		response = JOptionPane.showInputDialog(null, "How much gold did you earn in this session?");
		SeaOfThieves userGoldEarned = new SeaOfThieves();
		while(!validInt(response))
		{
			response = JOptionPane.showInputDialog(null, "Dude, come on bro, type in the valid number here man.");
		}
		userGoldEarned.setGoldEarned(Integer.parseInt(response));
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
