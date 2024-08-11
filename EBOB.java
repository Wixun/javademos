import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Birinci sayiyi giriniz: ");
        int sayi1 = input.nextInt();
        int sayi2 = input.nextInt();

        int enbbolen = 1, k = 2;

        while (k <= sayi1 && k <= sayi2) {
            if (sayi1 % k == 0 && sayi2 % k == 0)
                enbbolen = k;

            k++;
        }
        System.out.println("En buyuk ortak bolen: " + enbbolen);
    }
}
