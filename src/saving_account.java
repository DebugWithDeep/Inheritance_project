public class saving_account extends BankAccount{
       float interest_rate;
    public saving_account(int interest_rate, String Account_holder_name, int Account_no, float balance){
        super(Account_holder_name, Account_no,  balance);
        this.interest_rate = interest_rate;
    }
       public float Interest_rate() {
           float interest = (balance * interest_rate) / 100;

           return  balance;
       }
       public void add_interest(){
        balance += Interest_rate();
       }



}
