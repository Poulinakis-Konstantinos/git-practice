package com.qa;

public class Rectangle extends Shape{

    private double height, width ;

    public Rectangle(String name, String colour,
                     double x, double y,
                     double height, double width) {
        super(name, colour, x, y);
        this.height = height;
        this.width = width;
    }


    public boolean isSquare(){
        return (width == height) ;
    }

    @Override
    public double getArea(){
        return this.height * this.width ;
    }

    @Override
    public Point getCentrePoint(){
        Point centrepoint = new Point(getX() + width/2,
                getY() + height/2) ;
        return centrepoint ;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }
}
