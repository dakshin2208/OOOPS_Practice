package Teams.day6;

public class BankAccount {
    private static double balance = 1000;

    public int pin ;

    public void setPin(int pin){
        this.pin = pin;
    }

    public void  deposite(double amount){
        balance += amount;
    }


    public void withdraw(double amount){
        balance -= amount;
    }

    public void balance(){
        System.out.println("the balance in your account :" + balance);
    }




}
