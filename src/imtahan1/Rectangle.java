package imtahan1;

public class Rectangle implements Shape{
    double a;
    double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void area() {
double sahe=a*b;
        System.out.println(sahe);
    }
}
