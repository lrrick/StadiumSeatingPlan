/**
 * Collection class that holds list of payment objects
 * @author lee
 *
 */
public class PaymentList extends ObjectList {
	/**
	 * Constructor to set empty list and maximum list size
	 */
	public PaymentList(int maxSize) {
		super(maxSize);
	}
	
	/**
	 * Reports payment object at given position
	 * @param positionIn, the position of payment in the list
	 * @return Returns payment at given position in the list, null if no payment
	 * at that position
	 */
	public Payment getPayment(int positionIn) {
		if(positionIn <1 || positionIn > getTotal()) {
			return null;
		} else {
			return (Payment) getObject(positionIn);
		}
	}
	
	/**
	 * Returns total value of payments received
	 */
	public double calculateTotalPaid() {
		double totalPaid = 0;
		for(int i = 1; i<=getTotal(); i++) {
			totalPaid = totalPaid + getPayment(i).getAmount();
		}
		return totalPaid;
	}
}
