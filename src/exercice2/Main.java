package exercice2;

public class Main {
    public static void main(String[] args) {
        NotificationManager manager = new NotificationManager();

        manager.addChannel(new EmailNotification("no-reply@monapp.com"));
        manager.addChannel(new SMSNotification("+33123456789"));
        manager.addChannel(new PushNotification("com.monapp.id"));

        manager.broadcast("user@example.com", "Votre commande est expédiée.");
        manager.broadcast("+33987654321", "Votre code de vérification est 123456.");
    }
}
