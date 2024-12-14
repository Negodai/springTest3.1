package ru.springTest.shapeDraw;

public class Point extends Shape{

    private Coords coords;

    public Point() {}

    public Point(Coords coords) {
        this.coords = coords;
    }

    public Point(String color, int x, int y) {
        super(color);
        this.coords = new Coords(x, y);
    }

    @Override
    public void draw() {
        System.out.printf("Нарисована фигура - " + this.toString() + "\n");
    }

    public String toString() {
        return String.format("точка с координатами [%d,%d], c цветом - [%s]", this.getX(), this.getY(), this.getColor());
    }

    public int getX() {
        return coords.getX();
    }

    public void setX(int x) {
        coords.setX(x);
    }

    public int getY() {
        return coords.getY();
    }

    public void setY(int y) {
        coords.setY(y);
    }

    @Override
    public void erase() {
        System.out.printf("Стерта фигура - " + this.toString() + "\n");
    }

    public Coords getCoords() {
        return coords;
    }

    public void setCoords(Coords coords) {
        this.coords = coords;
    }
}
