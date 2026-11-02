package exercice2;

import java.util.Arrays;
import java.util.Comparator;

public class NotificationManager {
    private Notification[] channels = new Notification[3];
    private int count = 0;

    public void addChannel(Notification notification) {
        if (notification == null) {
            throw new IllegalArgumentException("Le canal ne peut pas être null.");
        }
        if (count == channels.length) {
            Notification[] tmp = new Notification[channels.length * 2];
            System.arraycopy(channels, 0, tmp, 0, channels.length);
            channels = tmp;
        }
        channels[count++] = notification;
    }

    public void broadcast(String recipient, String message) {
        Notification[] copy = Arrays.copyOf(channels, count);
        Arrays.sort(copy, Comparator.comparingInt(Notification::getPriority).reversed());

        System.out.println("Broadcast to " + recipient + ":");
        for (Notification notification : copy) {
            System.out.printf("Channel [%s, prio=%d]: ",
                    notification.getType(), notification.getPriority());
            notification.send(recipient, message);
        }
        System.out.println();
    }
}
