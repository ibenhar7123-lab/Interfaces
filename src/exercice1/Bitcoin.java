package exercice1;

public class Bitcoin implements PaymentMethod {
    private final String walletAddress;
    private double balance;

    public Bitcoin(String walletAddress, double balance) {
        this.walletAddress = walletAddress;
        this.balance = Math.max(0, balance);
    }

    @Override
    public boolean pay(double amount) {
        if (amount <= 0) {
            System.out.println("Bitcoin : le montant doit être positif.");
            return false;
        }
        if (amount <= balance) {
            balance -= amount;
            System.out.printf("Bitcoin (%s) : payé %.4f BTC, reste %.4f BTC%n",
                    walletAddress, amount, balance);
            return true;
        }
        System.out.printf("Bitcoin (%s) : fonds insuffisants (solde %.4f BTC, montant %.4f BTC)%n",
                walletAddress, balance, amount);
        return false;
    }

    @Override
    public boolean refund(double amount) {
        if (amount <= 0) return false;
        balance += amount;
        System.out.printf("Bitcoin (%s) : remboursé %.4f BTC, solde %.4f BTC%n",
                walletAddress, amount, balance);
        return true;
    }

    @Override
    public String getName() {
        return "Bitcoin[" + walletAddress + "]";
    }
}
