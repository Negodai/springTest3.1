package ru.springTest.shapeDraw;

public abstract class Shape {

    final static public  String DEFAULT_COLOR = "ORANGE";

    private String color;

    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void draw();

    public abstract int getX();

    public abstract void setX(int x);

    public abstract int getY();

    public abstract void setY(int y);

    public abstract void erase();
}
