package model;

public class SeaOfThieves
{
	//----------- Instance variables -----------
	private double orderOfSoulsLvl;
	private double merchantAllianceLvl;
	private double goldHoardersLvl;
	private int goldEarned;
//	private int timeMinutes;
	private double timeHours;
	
	/**
	 * Default constructor for after the fact customization.
	 * AKA I don't know the info yet about the SeaOfThieves.
	 * Initializing data members with "bad" values to be later changed.
	 */
	public SeaOfThieves()
	{
		this.orderOfSoulsLvl = -10.0;
		this.merchantAllianceLvl = -10.0;
		this.goldHoardersLvl = -10.0;
		this.goldEarned = -123;
//		this.timeMinutes = -23;
		this.timeHours = -342.0;
	}
	
	/**
	 * Beter constructor when I know information for the SeaOfThieves object.
	 * @param goldEarned The amount of gold earned in this session.
	 */
	public SeaOfThieves(int goldEarned)
	{ 
		this.goldEarned = goldEarned;
		
	}
	
	//-------------- getters --------------
	public double getOrderSouls()
	{
		return orderOfSoulsLvl;
	}
	
	public double getMerchant()
	{
		return merchantAllianceLvl;
	}
	
	public double getGoldLvl()
	{
		return goldHoardersLvl;
	}
	
	public int getGoldEarned()
	{
		return goldEarned;
	}
	
/*	public int getTimeMinutes()
	{
		return timeMinutes;
	}   */
	
	public double getTimeHours()
	{
		return timeHours;
	}
	//-----------end getters------------
	
 	//----------- setters ---------------
	public void setOrderSouls(double orderSouls)
	{
		this.orderOfSoulsLvl = orderSouls;
	}
	
	public void setMerchant(double merchant)
	{
		this.merchantAllianceLvl = merchant;
	}
	
	public void setGoldLvl(double goldLvl)
	{
		this.goldHoardersLvl = goldLvl;
	}
	
	public void setGoldEarned(int gold)
	{
		this.goldEarned = gold;
	}
	
/*	public void setTimeMinutes(int minutes)
	{
		this.timeMinutes = minutes;
	}	*/
	
	public void setTimeHours(double hours)
	{
		this.timeHours = hours;
	}
	//-------------end setters------------
	
/*	public void updateTime(int hours, int minutes)
	{
		
	}*/

	public String toString()
	{
		String description = "This is what happened in your last session of Sea of Thieves.";
		description += " You played for " + timeHours + " hours.\n";
		description += " Your Gold Hoarders level is now at " + goldHoardersLvl + ".\n";
		description += " Your Order of Souls level is now " + orderOfSoulsLvl + ".\n";
		description += " And your Merchant's Alliance level has now reached " + merchantAllianceLvl + ".\n";
		description += " And in your " + timeHours + " hours of playing, you earned " + goldEarned + " gold.";
		return description;
	}

}

