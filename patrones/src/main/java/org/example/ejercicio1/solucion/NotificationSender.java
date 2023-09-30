package org.example.ejercicio1.solucion;

public abstract class NotificationSender {
    public String sendNotification(Event event, User receiver) {
        // Create message
        String message = String.format("Hola %s! Tenes un evento el día %s a las %s", receiver.getName(), event.getDate(), event.getTime());

        // Send message
        Notification notification = this.createNotification(message, receiver);
        notification.send();

        // Return message
        return message;
    }

    protected abstract Notification createNotification(String message, User receiver);
}
