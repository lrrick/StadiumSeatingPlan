import java.util.Scanner;

public class PaymentListTester {

	public static void main(String[] args) {
		char selection;
		int total;
		PaymentList pl;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the maximum number of Payments");
		total = sc.nextInt();
		pl = new PaymentList(total);
		
		do {
			System.out.println("[1] Add a Payment");
			System.out.println("[2] List all Payments made");
			System.out.println("[3] Get number of payments made");
			System.out.println("[4] Get total of payments made");
			System.out.println("[5] Exit");
			System.out.println("Please choose an Option");
			selection = sc.next().charAt(0);
			
			switch(selection) {
			case '1' : option1(pl); break;
			case '2' : option2(pl); break;
			case '3' : option3(pl); break;
			case '4' : option4(pl); break;
			case '5' : System.out.println("Thank you. Goodbye"); break;
			default : System.out.println("Please choose an option from 1-5");
			}
		} while (selection != '5');
		sc.close();

	}
	
	// The helper methods below are used by the class and so are static
	
	private static void option1(PaymentList plIn) {
		if(!plIn.isFull()) {
			System.out.println("Enter Month of Payment");
			Scanner sc = new Scanner(System.in);
			String month = sc.nextLine();
			System.out.println("Enter amount paid");
			double amount = sc.nextDouble();
			plIn.add(new Payment(month, amount));
			sc.close();
		}
	}
	
	private static void option2(PaymentList plIn) {
		for(int i = 1; i <= plIn.getTotal(); i++) {
			Payment p = plIn.getPayment(i);
			System.out.print(p.getMonth());
			System.out.println("\t" + p.getAmount());
		}
	}

	private static void option3(PaymentList plIn) {
		System.out.print("Total number of payments made: ");
		System.out.println(plIn.getTotal());
	}

	private static void option4(PaymentList plIn) {
		System.out.print("Total of payments made: ");
		System.out.println(plIn.calculateTotalPaid());
	}

}


