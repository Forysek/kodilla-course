package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println( "This is the beginning of tests." );
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println( "All tests are finished." );
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println( "Preparing to execute test #" + testCounter );

    }

    @Test
    public void addFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape tempShape = new Circle();

        //When
        shapeCollector.addFigure(tempShape);

        //Then
        Assert.assertTrue(shapeCollector.shapes.size() == 1);
    }

    @Test
    public void removeFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape tempShape = new Triangle();
        shapeCollector.addFigure(tempShape);

        //When
        shapeCollector.removeFigure(tempShape);

        //Then
        Assert.assertTrue(shapeCollector.shapes.size() == 0);
    }

    @Test
    public void getFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape tempShape = new Square();
        shapeCollector.addFigure(tempShape);

        //When
        Shape getShape = shapeCollector.shapes.get( 0 );

        //Then
        Assert.assertEquals( tempShape, getShape );

    }
}