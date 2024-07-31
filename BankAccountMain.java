/* Design a class representing a "BankAccount" with private attributes such as account
number, balance, and account holder name. Use encapsulation to provide public methods
for deposit, withdrawal, and displaying account details while ensuring data integrity.*/

class BankAccount
{
	private Double acc_no;
	private float balance=0;
	private String name;
	BankAccount(double a, String n, float b)
	{
		acc_no = a;
		balance = b;
		name = n;
	}
	
	public void deposit(int ammount)
	{
		balance += ammount;
		System.out.println("Amount "+ammount+" added successfully");
	}
	public void withdrawal(int ammount)
	{
		balance -= ammount;
		System.out.println("Amount "+ammount+" withdrawal successfully");
	}
	public void details()
	{
		System.out.println("Account No. : " + acc_no);
		System.out.println("Account Holder : " + name);
		System.out.println("Blance : " + balance);
	}
		
}
class BankAccountMain
{
	public static void main(String args[])
	{
		BankAccount b = new BankAccount(100678,"Binit Shaw",1000);
		b.details();
		b.deposit(500);
		b.withdrawal(400);
		b.details();
	}
}


		
	