package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        NotificationService notification = (NotificationService) context.getBean("notificationService");

        String texto = notification.imprimirSaludo();

        UserService usuario1 = (UserService) context.getBean("userService");

        System.out.println(usuario1.notificationService.imprimirSaludo());

    }
}
