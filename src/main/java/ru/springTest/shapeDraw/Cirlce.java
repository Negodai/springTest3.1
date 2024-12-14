package ru.springTest.shapeDraw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Cirlce extends Shape {
    @Value("#{coords}")
    private Coords cenetrCoords;
    private int radius;

    public Cirlce() {}

    @Autowired
    public Cirlce(Coords cenetrCoords, @Value("${circle1.radius}") int radius, @Value("${circle1.color}") String color) {
        super(color);
        this.cenetrCoords = cenetrCoords;
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.printf("Нарисована фигура - " + this.toString() + "\n");
    }

    @Override
    public void erase() {
        System.out.printf("Стерта фигура - " + this.toString() + "\n");
    }

    public String toString() {
        return String.format("круг с координатами центра [%d,%d], радиусом - [%d], c цветом - [%s]", this.getX(), this.getY(), this.getRadius(), this.getColor());
    }

    public int getX() {
        return cenetrCoords.getX();
    }

    @Value("${circle1.x}")
    public void setX(int x) {
        cenetrCoords.setX(x);
    }

    public int getY() {
        return cenetrCoords.getY();
    }

    @Value("${circle1.y}")
    public void setY(int y) {
        cenetrCoords.setY(y);
    }

    public Coords getCenetrCoords() {
        return cenetrCoords;
    }

    public void setCenetrCoords(Coords cenetrCoords) {
        this.cenetrCoords = cenetrCoords;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
