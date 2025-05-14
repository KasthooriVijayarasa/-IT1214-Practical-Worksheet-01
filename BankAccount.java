class BankAccount{
	private String accountHolderName;
	private double balance;
	
	public BankAccount(String accountHolderName) {
        this.accountHolderName = accountHolderName;
        this.balance = 0.0;
    }
	
	public String getAccountHolderName(){
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName){
		this.accountHolderName=accountHolderName;
	}
	
	public double getBalance(){
		return balance;
	}
	public void setBalance(double balance){
		this.balance=balance;
	}
	
	public void deposit(double amount){
		balance+=amount;
		System.out.println("Deposited: "+amount);
	}
	
	public void withdraw(double amount){
		if(balance>amount){
			balance-=amount; 
			System.out.println("Withdraw: "+amount);
		}else{
			System.out.println("insufficient Balance");
		}
	}
	
	public void displayBalance(){
		System.out.println("Account Holder: " + accountHolderName);
		System.out.println("Current Balance: "+balance);
	}
	
}