public class Main {

    
    public static final double RADIUS = 2.0;

    public static double calculateArea(double radius) {
        double area_out = Math.PI * radius * radius;
        return area_out;
    }

    public static void main(String[] args) {  

            double radius = RADIUS;  
            System.out.println("The radius is, " + radius);  
            double area = calculateArea(radius);

            System.out.println("The area of the circle is: " + area);
    }
}