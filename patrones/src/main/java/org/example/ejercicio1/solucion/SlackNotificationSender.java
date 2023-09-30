package org.example.ejercicio1.solucion;

public class SlackNotificationSender extends NotificationSender {
    @Override
    protected Notification createNotification(String message, User receiver) {
        return new SlackNotification(message, receiver);
    };
}
