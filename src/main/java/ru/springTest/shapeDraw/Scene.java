package ru.springTest.shapeDraw;

import java.util.List;

public class Scene {
    List<Shape> objects;

    public Scene() {}

    public Scene(List<Shape> objects) {
        this.objects = objects;
    }

    public void draw() {
        objects.forEach(Shape::draw);
    }

    public void close() {
        objects.forEach(Shape::erase);
    }

    public List<Shape> getObjects() {
        return objects;
    }

    public void setObjects(List<Shape> objects) {
        this.objects = objects;
    }
}
