package org.example.ejercicio1.solucion;

public class EmailNotificationSender extends NotificationSender {
    @Override
    protected Notification createNotification(String message, User receiver) {
        return new EmailNotification(message, receiver);
    };
}
