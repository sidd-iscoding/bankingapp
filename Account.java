package bankingapp;

public class Account{
    private int balance=50;
    public int getblance(){
        return balance;
        
    }
    public void withdraw_amt(int amt){
        balance-=amt;
    }
}
