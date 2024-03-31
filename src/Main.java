import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter The Radius of the Circle :");
        double r=scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter The Color of the Circle :");
        String color=scanner.nextLine();
        Circle circle=new Circle(r,color);
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Color: " + circle.getColor());
        System.out.println("Area: " + circle.calculateCircleArea());

    }
}