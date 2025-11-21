package oop;

public class Rectangle {
    private Integer width;
    private Integer length;
    public Rectangle(Integer width,Integer length) {
        this.width = width;
        this.length = length;
    }
    public void getArea(){
        System.out.println("Rectangle Area : "+(width*length));
    }
    public void getPerimeter(){
        System.out.println("Rectangle Perimeter : "+(2*(width+length)) );
    }
}
