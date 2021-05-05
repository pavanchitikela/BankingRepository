import java.util.Scanner;

public class InterfaceTest {
	public static void main(String args[]) {
		int choice=0;
		do {
			System.out.println("----------------------------------");
			System.out.println("Choose Payment method....");
			System.out.println("1. Pay via Cheque");
			System.out.println("2. Pay via Cash");
			System.out.println("3. Pay via NEFT");
			System.out.println("4. Pay via GPay");
			System.out.println("5. Exit");
			System.out.println("Enter your choice ::");
			Scanner sc = new Scanner(System.in);
			choice=sc.nextInt();
			Payment pmt=null;
			switch (choice) {
			case 1: pmt = new ChequePayment(); break;
			case 2: pmt = new CashPayments(); break;
			case 3: pmt = new NeftPayment(); break;
	        case 4: pmt = new GPayment(); break;
	        case 5: break;default:System.out.println("You selected exit...");
	        	}
			if(pmt!=null){
				pmt.pay();
				}
			}while(choice<5);
		
}
	}
	
interface Payment{
	void pay();
	
}


class ChequePayment implements Payment{
	public void pay() {
		System.out.println("paying using cheque..");
	}
}
class CashPayments  implements Payment{
	public void pay() {
		System.out.println("Cash payment..");
	}
	void cash() {
		System.out.println("im cash");
	}
}
class NeftPayment implements Payment{
	public void pay() {
		System.out.println("Neft payment...");
		System.out.println("Adding beneficiary...");
		System.out.println("Sending amount to beneficiary...");
		
	}
}
class GPayment implements Payment{
	void findPayee() {
		System.out.println("Finding payee number.... ");
	}
	public void pay() {
		System.out.println("Google payment...");
	}
}