package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class AccountProgram {

	public static void main(String[] args) {
		
		Account accOne = new Account(3567, "Michael Green", 1000.0);
		BusinessAccount accTwo = new BusinessAccount(4594, "Francis Motta", 0.0, 500.0);
		
		accOne.deposit(200.00);
		
		System.out.println(accOne);
		
		//	UPCASTING
		
		Account accThree = accTwo;
		Account accFour = new BusinessAccount(8939, "Marta Green", 0.0, 200.0);
		Account accFive = new SavingsAccount(1893, "Martim Pestana", 0.0, 0.01);
		
		
		//	 DOWNCASTING
		
		if (accFive instanceof BusinessAccount) {
			BusinessAccount accSeven =  (BusinessAccount) accOne;
			accSeven.loan(400.00);
			System.out.println("Loan!");
		}
		
		if (accFive instanceof SavingsAccount) {
			SavingsAccount accEight = (SavingsAccount) accFive;
			accFive.deposit(1200.0);
			accEight.updateBalance();
			System.out.println("Update!");
		}
		
		
		
		
		System.out.println(accFive);
	}

}
