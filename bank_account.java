class bank_account1 {
 String account_no;
 String user_name;
 String email;
 String account_type;
 int account_balance;
 	public void getAccountDetails()
	{
	System.out.println(account_no);
	}
	
	public void DisplayAccountDetails()
	{
		System.out.println(account_no +user_name+ email +account_type +account_balance);
	}
}

 public class bank_account {
		
		public static void main (String [] args){
		bank_account1 a1= new bank_account1();
		a1.account_no="180303105376 ";
		a1.user_name="Aditi Yadav ";
		a1.email="180303105376@paruluniversity.ac.in ";
		a1.account_type="Saving account ";
		a1.account_balance=1000000 ;
		
		bank_account1 a2= new bank_account1();
		a2.account_no="180303105374 ";
		a2.user_name="Drishti Yadav ";
		a2.email="180303105374@paruluniversity.ac.in ";
		a2.account_type="Saving account ";
		a2.account_balance=100000 ;
		
		
		a1.getAccountDetails();
		a2.getAccountDetails();
		a1.DisplayAccountDetails();
		a2.DisplayAccountDetails();
		}
 }
 