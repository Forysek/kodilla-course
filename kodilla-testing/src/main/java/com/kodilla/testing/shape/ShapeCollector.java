package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    public ArrayList<Shape> shapes = new ArrayList<Shape>();

    public ShapeCollector() {}

    public void addFigure(Shape shape) {
        shapes.add( shape );
    }

    public void removeFigure(Shape shape) {
        shapes.remove( shape );
    }

    public void getFigure(int n) {
        Shape tempFigure = shapes.get( n );
        System.out.println(tempFigure);
    }

    public void showFigures() {
        for (Shape figures : shapes){
            System.out.println("Actual figures in ArrayList: ");
        }

    }
}
