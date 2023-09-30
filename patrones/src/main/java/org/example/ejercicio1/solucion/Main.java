package org.example.ejercicio1.solucion;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<NotificationSender> notificationSenders = new ArrayList<>();
        notificationSenders.add(new EmailNotificationSender());
        notificationSenders.add(new SlackNotificationSender());
        notificationSenders.add(new WpNotificationSender());

        for(NotificationSender notificationSender : notificationSenders) {
            notificationSender.sendNotification(new Event(), new User());
        }
    }
}