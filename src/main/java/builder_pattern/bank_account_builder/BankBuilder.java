package builder_pattern.bank_account_builder;

public abstract class BankBuilder {
    protected BankAccount bankAccount = new BankAccount();

    public abstract BankBuilder buildName(String name);
    public abstract BankBuilder buildAccountNumber(String accountNumber);
    public abstract BankBuilder buildTypeBank();
    public abstract BankBuilder buildAddress(String address);
    public abstract BankBuilder buildEmail(String email);
    public abstract BankBuilder buildNewsletter(boolean newsletter);
    public abstract BankBuilder buildMobileBanking(boolean mobileBanking);

    public BankAccount getResult(){
        return this.bankAccount;
    }
}
