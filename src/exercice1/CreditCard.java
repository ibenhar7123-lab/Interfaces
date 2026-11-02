package exercice1;

public class CreditCard implements PaymentMethod {
    private final String number;
    private final String holder;
    private double balance;

    public CreditCard(String number, String holder, double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = Math.max(0, balance);
    }

    @Override
    public boolean pay(double amount) {
        if (amount <= 0) {
            System.out.println("CreditCard : le montant doit être positif.");
            return false;
        }
        if (amount <= balance) {
            balance -= amount;
            System.out.printf("CreditCard (%s) : payé %.2f, reste %.2f%n",
                    holder, amount, balance);
            return true;
        }
        System.out.printf("CreditCard (%s) : fonds insuffisants (solde %.2f, montant %.2f)%n",
                holder, balance, amount);
        return false;
    }

    @Override
    public boolean refund(double amount) {
        if (amount <= 0) return false;
        balance += amount;
        System.out.printf("CreditCard (%s) : remboursé %.2f, solde %.2f%n",
                holder, amount, balance);
        return true;
    }

    @Override
    public String getName() {
        return "CreditCard[" + holder + "]";
    }
}
