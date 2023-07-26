package com.qa;

public class Main {
    public static void main(String[] args){
        Rectangle rec1 = new Rectangle("rec1", "red",
                1.12, 2.32, 12, 14) ;
        Rectangle rec2 = new Rectangle("rec12", "red",
                1.2, 2.32, 15, 14) ;
        System.out.println(rec1) ;
        System.out.println("Total area : " + rec1.getArea()) ;
        System.out.println("Centre point with coords:  X=" + rec1.getCentrePoint().getX() + " Y=" + rec1.getCentrePoint().getY()) ;
        System.out.println(rec2) ;


    }
}
