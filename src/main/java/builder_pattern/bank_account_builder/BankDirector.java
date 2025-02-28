package builder_pattern.bank_account_builder;

public class BankDirector {
    public BankAccount buildBankAccount(BankBuilder builder){
        return builder.getResult();
    }
}
