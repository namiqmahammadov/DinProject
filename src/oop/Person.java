package oop;

public class Person {
    private String name;
    private Double height;

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void personInfo(){
        System.out.println("Name: "+name);
        System.out.println("Height: "+height);
    }
}
