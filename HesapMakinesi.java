import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Iki sayi giriniz: ");
        int sayi1 = input.nextInt();
        int sayi2 = input.nextInt();

        System.out.println("Lutfen Islem Giriniz (+,-,*,/): ");
        char islem = input.next().charAt(0);

        switch (islem) {
            case '+':
                System.out.println("Toplam: " + (sayi1 + sayi2));
                break;
            case '-':
                System.out.println("Cikarma: " + (sayi1 - sayi2));
                break;
            case '*':
                System.out.println("Carpma: " + (sayi1 * sayi2));
                break;
            case '/':
                if (sayi2 != 0) {
                    System.out.println("Bolme: " + ((double) sayi1 / sayi2));
                } else {
                    System.out.println("Hata: Sifira bolme hatasi!");
                }
                break;

            default:
                System.out.println("Hatali islem girdiniz.");
        }
        input.close();
    }
}
