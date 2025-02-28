package builder_pattern.bank_account_builder;

public class Client {
    public static void main(String[] args) {
        BankAccount newAccount = new BankAccount
                .BankAccountBuilder("Jon", "22738022275")
                .withAddress("1234 Market St")
                .withEmail("devzeus@gmail.com")
                .wantNewsletter(true)
                .wantMobileBanking(true)
                .build();

        System.out.println(newAccount);
    }
}
