package org.medamine;

import org.medamine.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        // Load the Spring context from the XML configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Now the Spring beans are available for use
        System.out.println("Spring application context loaded.");

        // Example of accessing the UserService bean
        UserService userService = context.getBean(UserService.class);
        System.out.println("UserService bean retrieved from context: " + userService);

        // Your application logic can go here
    }
}
