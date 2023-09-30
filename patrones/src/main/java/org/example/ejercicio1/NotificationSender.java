package org.example.ejercicio1;

public class NotificationSender {


    public String sendNotification(String notificationType, Event event, User receiver) {
        String message = String.format("Hola %s! Tenes un evento el día %s a las %s", receiver.getName(), event.getDate(), event.getTime());

        if (notificationType == "email") {
            EmailNotification notification = new EmailNotification(message, receiver);
            notification.send();
        } else if (notificationType == "slack") {
            SlackNotification notification = new SlackNotification(message, receiver);
            notification.send();
        }

        return message;
    }
}
