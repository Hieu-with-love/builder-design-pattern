package builder_pattern.bank_account_builder;

public class BIDVAccountBuilder extends BankBuilder {

    @Override
    public BankBuilder buildName(String name) {
        bankAccount.setName(name);
        return this;
    }

    @Override
    public BankBuilder buildAccountNumber(String accountNumber) {
        bankAccount.setAccountNumber(accountNumber);
        return this;
    }

    @Override
    public BankBuilder buildTypeBank() {
        bankAccount.setTypeBank("BIDV");
        return this;
    }

    @Override
    public BankBuilder buildAddress(String address) {
        bankAccount.setAddress(address);
        return this;
    }

    @Override
    public BankBuilder buildEmail(String email) {
        bankAccount.setEmail(email);
        return this;
    }

    @Override
    public BankBuilder buildNewsletter(boolean newsletter) {
        bankAccount.setNewsletter(newsletter);
        return this;
    }

    @Override
    public BankBuilder buildMobileBanking(boolean mobileBanking) {
        bankAccount.setMobileBanking(mobileBanking);
        return this;
    }

    public BankAccount build() {
        validateUserObject();
        return bankAccount;
    }

    private void validateUserObject() {
        // Do some basic validations to check
        if (bankAccount.isNewsletter() && bankAccount.getEmail() == null) {
            throw new IllegalArgumentException("Email can't be null when client want to receive the new letter");
        }
    }
}
