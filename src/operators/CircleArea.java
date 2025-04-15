package operators;

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the radius
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Calculate area using π * r^2
        double area = Math.PI * radius * radius;

        // Display the result
        System.out.printf("The area of the circle with radius %.2f is %.2f\n", radius, area);

        scanner.close();
	}

	

}
