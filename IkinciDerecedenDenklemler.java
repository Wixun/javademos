import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a, b, c;
        double discriminant, root1, root2;

        Scanner al = new Scanner(System.in);

        System.out.println("Denklemin katsayılarını giriniz: ");
        a = al.nextDouble();
        b = al.nextDouble();
        c = al.nextDouble();

        discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Denklemin iki gerçek kökü vardır: " + root1 + " ve " + root2);
        } else if (discriminant == 0) {
            root1 = -b / (2 * a);
            System.out.println("Çift katlı kök: " + root1);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("Denklem karmaşık köklere sahiptir: " + realPart + " ± " + imaginaryPart + "i");
        }
    }
}
