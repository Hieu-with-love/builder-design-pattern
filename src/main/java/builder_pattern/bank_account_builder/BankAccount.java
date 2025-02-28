package builder_pattern.bank_account_builder;

public class BankAccount {
    private String name; // required
    private String accountNumber; // required
    private String typeBank;
    private String address;
    private String email;
    private boolean newsletter;
    private boolean mobileBanking;

    public BankAccount() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setTypeBank(String typeBank) {
        this.typeBank = typeBank;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNewsletter(boolean newsletter) {
        this.newsletter = newsletter;
    }

    public void setMobileBanking(boolean mobileBanking) {
        this.mobileBanking = mobileBanking;
    }

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getTypeBank() {
        return typeBank;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public boolean isNewsletter() {
        return newsletter;
    }

    public boolean isMobileBanking() {
        return mobileBanking;
    }

    @Override
    public String toString() {
        return "BankAccount [name=" + name + ", accountNumber=" + accountNumber + ", address=" + address + ", email="
                + email + ", newsletter=" + newsletter + ", mobileBanking=" + mobileBanking + "]";
    }
}
