package atmcase1;
public class CashDispenser 
{
	
	private final static int INITIAL_COUNT = 500;
	private int count;	
	
	
	public CashDispenser()
	{
		count = INITIAL_COUNT;	
	}	
	
	
	public void dispenseCash(int amount)
	{
		int billsRequired = amount / 20;	
		count -= billsRequired;	//	update the count of bills
	}	
	
	public boolean isSufficientCashAvailable(int amount)
	{
		int billsRequired = amount / 20;	
		
		if (count >= billsRequired)
			return true;	//	enough bills available
		else
			return false;	//	not enough bills available
	}	
}	