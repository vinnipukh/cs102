package questionset1;

public class Circle {
    public static double radius;
    public static final double pi = Math.PI;
    public  Circle(double radius) {
        this.radius = radius;

    }
    public static  double calculate_area(){
        return  (radius*radius*pi);
    }
    public static double calculate_circumference(){
        return (2*radius*pi);
    }


    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println(calculate_area());
        System.out.println(calculate_circumference());
    }
}
