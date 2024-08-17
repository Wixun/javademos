import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double max = 0;
        int maxX = 0, maxY = 0;

        for (int i = 0; i < 10; i++) {
            int x = input.nextInt();
            int y = input.nextInt();

            double uzaklik = Math.sqrt(x * x + y * y);

            if (uzaklik > max) {
                max = uzaklik;
                maxX = x;
                maxY = y;
            }
        }

        System.out.println("Orijine en uzak nokta: (" + maxX + ", " + maxY + ")");
        System.out.println("Bu noktanın orijine uzaklığı: " + max);
    }
}
