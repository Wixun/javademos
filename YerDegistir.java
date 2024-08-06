import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Iki Sayi Giriniz: ");
        int x = input.nextInt();
        int y = input.nextInt();

        System.out.println("Girilen iki sayi: " + "X: " + x + " Y: " + y);

        int temp;

        temp = x;
        x = y;
        y = temp;

        System.out.println("Yer Degistirildikten sonra: " + "X: " + x + " Y: " + y);

    }
}
