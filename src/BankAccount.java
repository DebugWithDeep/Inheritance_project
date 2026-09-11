public class BankAccount {
    String Account_holder_name;
    int Account_no;
    float balance;

    public BankAccount(String Account_holder_name, int Account_no, float balance) {
            this.Account_holder_name = Account_holder_name;
            this.Account_no = Account_no;
            this.balance = balance;
    }
    public float deposit(float amount) {
        this.balance += amount;
        return this.balance;
    }
    public float withdraw(float amount){
        if(balance >= amount){
            this.balance -=amount;
           // return this.balance;
        }else{
            System.out.println("Insufficient Balance");
          //  return this.balance;
        }
        return this.balance;


        }
    public void Account_details(){
        System.out.println("Account Holder Name: " + Account_holder_name);
        System.out.println("Account Name: " + Account_no);
        System.out.println("Balance: " + this.balance);
    }






}
