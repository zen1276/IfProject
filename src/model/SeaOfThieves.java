package model;

public class SeaOfThieves
{
	//----------- Instance variables -----------
	private double orderOfSoulsLvl;
	private double merchantAllianceLvl;
	private double goldHoardersLvl;
	private int goldEarned;
	private int timeMinutes;
	private int timeHours;
	
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
		this.timeMinutes = -23;
		this.timeHours = -342;
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
	
	public int getTimeMinutes()
	{
		return timeMinutes;
	}
	
	public int getTimeHours()
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
	
	public void setTimeMinutes(int minutes)
	{
		this.timeMinutes = minutes;
	}
	
	public void setTimeHours(int hours)
	{
		this.timeHours = hours;
	}
	//-------------end setters------------
	
	public void updateTime(int hours, int minutes)
	{
		
	}
}