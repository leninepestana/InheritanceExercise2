package entities;

public class Account {
	private Integer number;
	private String holder;
	protected Double balance;
	
	public Account() {
	}

	public Account(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void withdraw(double amount) {
		balance -= amount;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("Account: %d%n", getNumber()));
		sb.append(String.format("Hoder: %s%n", getHolder()));
		sb.append(String.format("Balance: %.2f%n", getBalance()));
		return sb.toString();
	}
	
}
