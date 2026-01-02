package imtahan1;

public class Circle implements Shape{
    double r;

    public Circle(double r) {
        this.r = r;
    }

    final double pi=3.14;
    @Override
    public void area() {
          double sahe=pi*Math.pow(r,2);
        System.out.println(sahe);
    }
}
