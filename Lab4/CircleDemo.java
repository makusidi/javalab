
/**
 * Write a description of class CircleDemo here.
 * 
 *MOHAMMED AWWAL MAKUSIDI
 *U16/FNS/CSC/2086
 */
public class CircleDemo {
public static void main(String[] args) {
System.out.println("The number of circles is " + Circle.getNumberOfCircles());
Circle circle1 = new Circle(8.5);
System.out.println("The number of circles is " + Circle.getNumberOfCircles());
Circle circle2 = new Circle(5.0);
System.out.println("The number of circles is " + Circle.getNumberOfCircles());
System.out.println("The area of the first circle is \t" + circle1.area() + "square cm");
System.out.println("The circumference of the first circle is\t" +circle1.circumference() + " cm");
System.out.println("The area of the second circle is\t" + circle2.area() + "square cm");
System.out.println("The circumference of the second circle is\t" +circle2.circumference() + " cm\n\n");
    }
}
