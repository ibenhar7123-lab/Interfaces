package exercice2;

/** Contrat commun à tous les canaux de notification. */
public interface Notification {
    void send(String recipient, String message);
    int getPriority(); // 0 = basse, 1 = normale, 2 = haute
    String getType();
}
