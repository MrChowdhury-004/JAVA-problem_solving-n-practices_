public class AreaCalculator {
    public static void main(String[] args) {

    }
    public static double area(double radius){
        double pi = Math.PI;
        if(radius < 0){
            return -1.0;
        }
        return pi * radius * radius;
    }
    public static double area(double x, double y){
        if(x < 0 || y < 0)
            return -1.0;
        return x*y;
    }
}
