
public class SeasonTicketHolder {
	private String name;
	private int seatNumber;
	private PaymentList payments;
	public static final int maxNumberOfPayments = 12;
	
	/**
	 * Constructor initialises name and seat number and sets
	 * payments made to the empty list
	 */
	public SeasonTicketHolder (String name, int seatNumber){
		this.name = name;
		this.seatNumber = seatNumber;
		payments - new PaymentList(maxNumberOfPayments);
	}
	
	/** Reads the name of the person */
	public String getName() {
		return name;
	}
	
	/** Reads seatNumber of the seasonTicketHolder */
	public int getSeatNumber() {
		return seatNumber;
	}
	
	/** Records payment for seasonTicketHolder */
	public void makePayment(Payment paymentIn) {
		payments.add(paymentIn);
	}
	
	/**Reads the payment made by seasonTicketHolder */
	public PaymentList getPayments() {
		return payments;
	}
	
}
