/**
 * This class stores details of single payments made
 * @author lee
 *
 */
public class Payment {
	private String month;
	private double amount;
	
	
	//Constructor to set both the month of the payment and the amount paid
	public Payment(String month, double amount) {
		this.month = month;
		this.amount = amount;
	}
	
	// Returns the month of the payment
	public String getMonth() {
		return month;
	}
	
	//Returns the amount of the payment
	public double getAmount() {
		return amount;
	}
	
	
	
}
