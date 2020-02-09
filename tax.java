import java.util.Scanner;
public class tax {

	public static void main(String[] args) {
		Scanner gogo = new Scanner(System.in);
		System.out.println("Give your prise");
		double a = gogo.nextDouble();
        double b = a * .15;
        double vat = a+b;
        System.out.print("your vat is    ");
        System.out.println(vat);
		

	}

}
