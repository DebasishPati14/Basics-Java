import java.util.Scanner;
public class Circumference {
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter the radius of circle =");
		float r = ss.nextFloat();
		float c = (float)(2*r*3.14) ;
		System.out.printf("The circumference of circle is =%.3f" ,c);
		System.out.printf("the area of circle is = %.3f ",(c/2)*r);
	}
}
