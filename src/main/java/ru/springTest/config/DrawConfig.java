package ru.springTest.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import ru.springTest.shapeDraw.Cirlce;
import ru.springTest.shapeDraw.Point;
import ru.springTest.shapeDraw.Scene;
import ru.springTest.shapeDraw.Shape;
import java.util.Arrays;

@Configuration
@ComponentScan(value = "ru.springTest.shapeDraw")
@PropertySource("project.properties")
public class DrawConfig {

    @Autowired
    private Environment env;

    @Autowired
    private Cirlce circle;


    @Bean("firstPoint")
    public Shape getFirstPoint() {
        return new Point(
                env.getProperty("point1.color", Shape.DEFAULT_COLOR),
                env.getProperty("point1.x", Integer.class, 0),
                env.getProperty("point1.y", Integer.class, 0)
        );
    }

    @Bean("secondPoint")
    public Shape getSecondPoint() {
        return new Point(
                env.getProperty("point2.color", Shape.DEFAULT_COLOR),
                env.getProperty("point2.x", Integer.class, 0),
                env.getProperty("point2.y", Integer.class, 0)
        );
    }

    @Bean("thirdPoint")
    public Shape getThirdPoint() {
        return new Point(
                env.getProperty("point3.color", Shape.DEFAULT_COLOR),
                env.getProperty("point3.x", Integer.class, 0),
                env.getProperty("point3.y", Integer.class, 0)
        );
    }

    @Bean
    public Scene scene() {
        return new Scene(Arrays.asList(getFirstPoint(), getSecondPoint(), getThirdPoint(), circle));
    }

}
