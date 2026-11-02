package exercice1;

public class PayPal implements PaymentMethod {
    private final String email;
    private double balance;

    public PayPal(String email, double balance) {
        this.email = email;
        this.balance = Math.max(0, balance);
    }

    @Override
    public boolean pay(double amount) {
        if (amount <= 0) {
            System.out.println("PayPal : le montant doit être positif.");
            return false;
        }
        if (amount <= balance) {
            balance -= amount;
            System.out.printf("PayPal (%s) : payé %.2f, reste %.2f%n",
                    email, amount, balance);
            return true;
        }
        System.out.printf("PayPal (%s) : fonds insuffisants (solde %.2f, montant %.2f)%n",
                email, balance, amount);
        return false;
    }

    @Override
    public boolean refund(double amount) {
        if (amount <= 0) return false;
        balance += amount;
        System.out.printf("PayPal (%s) : remboursé %.2f, solde %.2f%n",
                email, amount, balance);
        return true;
    }

    @Override
    public String getName() {
        return "PayPal[" + email + "]";
    }
}
