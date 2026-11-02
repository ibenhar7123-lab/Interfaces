package exercice1;

public class PaymentProcessor {
    private PaymentMethod[] methods = new PaymentMethod[3];
    private int count = 0;

    public void addMethod(PaymentMethod method) {
        if (method == null) {
            throw new IllegalArgumentException("Le moyen de paiement ne peut pas être null.");
        }
        if (count == methods.length) {
            PaymentMethod[] tmp = new PaymentMethod[methods.length * 2];
            System.arraycopy(methods, 0, tmp, 0, methods.length);
            methods = tmp;
        }
        methods[count++] = method;
    }

    public void processPayments(double amount) {
        if (amount <= 0) {
            System.out.println("Le montant doit être positif.");
            return;
        }
        System.out.printf("=== Traitement des paiements de %.2f ===%n", amount);
        for (int i = 0; i < count; i++) {
            PaymentMethod method = methods[i];
            System.out.println("-> Via " + method.getName());
            if (method.pay(amount)) {
                method.refund(amount / 2.0);
            }
            System.out.println();
        }
    }
}
