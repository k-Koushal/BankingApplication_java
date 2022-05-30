package BankingApplication;
import java.util.*;
public class BankApp {

	public static void main(String[] args) {
		//Scanner:
		Scanner sc=new Scanner(System.in);
		Account acc=null;
		while(true)
		{
			//System.out.println("-------Enter the Required Input------");
			System.out.println("\n1. Create Account");
			System.out.println("2. Deposit Amount ");
			System.out.println("3. Withdraw Amount");
			System.out.println("4. Check Balance");
			System.out.println("5. Exit");
			System.out.println("-----------------------------------------");
			System.out.println("     -------Enter an Option:------\n");
			int opt=sc.nextInt();
			
			switch(opt) {
			case 1:
				if(acc==null) {
					System.out.println("Enter the A/C no: \n");
					long acno=sc.nextLong();
					sc.nextLine();
					System.out.println("Enter A/C holder's name: \n");
					String name= sc.nextLine();
					System.out.println(" Enter the Initial Deposit Amount: \n");
					float amt=sc.nextFloat();
					//creating Account Object:
					 acc= new Account(acno,amt,name);//check the Constructor signature properly before creating a new object.
					System.out.println("Account Created:\n1A/C no: "+acno+"| Name: "+name+" | Balance: Rs."+amt);
				}
				else {
					System.out.println("Account Already Exists");
				}
				break;
			case 2:
				if(acc!=null) {
					System.out.println("Enter Amount to Deposit:\n");
					float amount=sc.nextFloat();
					acc.deposit(amount);
				}
				else {
					System.out.println("Account doesnt exist, Please create a new account. ");
				}
				break;
			case 3:
				if(acc!=null) {
					System.out.println("Enter Amount to withdraw:\n");
					float amount=sc.nextFloat();
					acc.withdraw(amount);
				}
				else {
					System.out.println("Account doesnt exist, Please create a new account. ");
				}
				
				break;
			case 4:
				if(acc!=null) {
					acc.getBalance();
				}
				else {
					System.out.println("Account doesnt exist, Please create a new account. ");
				}
				break;
			case 5:
				System.out.println("$$$----BYE BYE----$$$");
				System.exit(0);
				break;
			default:
				System.out.println("ERROR: INVALID OPTION--TRY AGAIN");
			}
			System.out.println("\n\n-----------------------------------------");
			
		}
	}

}
