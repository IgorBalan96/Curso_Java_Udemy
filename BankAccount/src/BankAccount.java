public class BankAccount {


    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public BankAccount() {
        this(12342,2000.0,"Bob", "email.com", 32423);
        System.out.println("Empty constructor called");
    }

    public BankAccount(int accountNumber, double accountBalance, String customerName, String email, int phoneNumber){
        System.out.println("BankAccount Constructor with parameters called");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.email= email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, int phoneNumber) {
        this(9999,99.05, customerName, email, phoneNumber);
//        this.customerName = customerName;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositingFunds(double value){
        this.accountBalance = accountBalance + value;
        System.out.println("Depositou " + value + " Ficou com "+accountBalance);
    }

    public void withdrawFunds (double value){
        if (accountBalance< value){
            System.out.println("Insuficient funds");
        }else {
            this.accountBalance = accountBalance - value;
            System.out.println("Retirou " + value + " Ficou com " +accountBalance);
        }
    }
}
