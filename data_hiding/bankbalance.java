class bankAccount{
    private double balance;// Private variable
    
    // Constructor
    public bankAccount(double initial_bal){
        if(initial_bal >= 0)
            this.balance = initial_bal;
        else
            System.out.println("Invalid balance amount!");
    }

    // Getter method to view balance (Read-only access)
    public double getBalance(){
        return balance;
    }

    // Setter method to update balance (Controlled access)
    public void deposit(double amount){
        if(amount>=0){
            balance+=amount;
            System.out.println("Deposited: $" + amount);
        }
        else
            System.out.println("Invalid amount");
    }

    public void withdraw(double amount){
        if(amount>0 && amount <= balance){
            balance-=amount;
            System.out.println("Withdrawn: $" + amount);
        }
        else
            System.out.println("Insufficient balance");
    }
}

public class bankbalance{
    public static void main(String[] args) {
        bankAccount account=new bankAccount(500.0);
        
        System.out.println("Current Balance: $" + account.getBalance());

        account.deposit(200);
        System.out.println("Updated Balance: $" + account.getBalance());

        account.withdraw(100);
        System.out.println("Final Balance: $" + account.getBalance());
    }
}