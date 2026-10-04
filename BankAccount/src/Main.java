

void main() {
    //BankAccount costumer = new BankAccount(12345, 1000, "Igor", "adasd@email.com", 96585852);

    BankAccount bobsAccount = new BankAccount();
    System.out.println(bobsAccount.getAccountBalance());
//    costumer.setAccountNumber(11);
//    costumer.setAccountBalance(1000.0);
//    costumer.setCustomerName("Igor Balan");
//    costumer.setEmail("adas@gmail.com");
//    costumer.setPhoneNumber(965758222);

    bobsAccount.depositingFunds(100);

    bobsAccount.withdrawFunds(1000);

    BankAccount timsAccount = new BankAccount("tim", "tim@email.com", 9334);

    System.out.println("acocunt number " + timsAccount.getAccountNumber() + " balance " + timsAccount.getAccountBalance() + " name " + timsAccount.getCustomerName() );
}

