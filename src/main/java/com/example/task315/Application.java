package com.example.task315;

import com.example.task315.config.CookieConfig;
import com.example.task315.model.User;
import com.example.task315.service.WebService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CookieConfig.class);
        WebService WebService = context.getBean("webService", WebService.class);
        WebService.getAllUsers();
        WebService.saveUser(new User(3L, "", "Brown", (byte) 40));
        WebService.updateUser(new User(3L, "Thomas", "Shelby", (byte) 30));
        WebService.deleteUser(3L);

        System.out.println(WebService.result);

    }

}
