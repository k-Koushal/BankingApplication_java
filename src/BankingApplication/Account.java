package BankingApplication;
public class Account {
	long accno;
	float bal;
	String name;
	 Account(long accno, float bal, String name) {
		this.accno = accno;
		this.bal = bal;
		this.name = name;
	}
	 void deposit(float amt) {
		 this.bal=this.bal+amt;
		 System.out.println("Rs"+amt+" Credited | Balance: Rs."+this.bal);
	 }
	 void withdraw(float amt) {
		 if(this.bal>=amt) {
			 this.bal = this.bal-amt;
			 System.out.println("Rs"+amt+" Debited | Balance: Rs."+this.bal);
		 }
		 else {
			 System.out.println("$$$----Error: Balance Insufficient----$$$");
		 }
	 }
	 void getBalance() {
		 System.out.println("A/C no: "+this.accno+"| Name: "+this.name+"| Balance: Rs."+this.bal);
	 }
}
