import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int yil;
        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen yil giriniz: ");
        yil = input.nextInt();

        if ((yil % 4 == 0 && yil % 100 != 0) || (yil % 400 == 0)) {
            System.out.println("Artik Yildir.");
        } else {
            System.out.println("Artik yil degildir.");
        }
    }
}
