public class Account {
    private int id;
    private double balance;


    public Account (int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public void deposit (double value) {
        if(value > 0)
        {
            this.balance += value;
            System.out.println("Sucesefull! deposit in the your account:" + value);
        }
        else
        {
            System.out.println("You cannot deposit this value!" + value);
        }
    }
    public void withdraw (double value) {
        if (value <= this.balance )
        {
            this.balance -= value;
            System.out.println("Sucesefull! you withdraw in your account:" + value);
        }
        else
        {
            System.out.println("you cannot withdraw this value, because you dont have balance!" + value);
        }
    }


    //Getters
    public int getId() { return id; }
    public double getBalance() { return balance; }

}
