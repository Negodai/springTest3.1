package ru.springTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.springTest.config.DrawConfig;
import ru.springTest.shapeDraw.Scene;

public class Main {
    public static void main(String[] args) {

        try (AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(DrawConfig.class)) {
            context.getBean(Scene.class).draw();
            for (String name : context.getBeanDefinitionNames())
                System.out.println(name);
        }

    }
}