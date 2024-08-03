import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c;

        Scanner al = new Scanner(System.in);

        System.out.println("Lutfen 3 sayi giriniz: ");
        a = al.nextInt();
        b = al.nextInt();
        c = al.nextInt();

        int enBuyuk, ortanca, enKucuk;

        // En büyük, ortanca ve en küçük sayıyı bulma
        if (a > b && a > c) {
            enBuyuk = a;
            if (b > c) {
                ortanca = b;
                enKucuk = c;
            } else {
                ortanca = c;
                enKucuk = b;
            }
        } else if (b > a && b > c) {
            enBuyuk = b;
            if (a > c) {
                ortanca = a;
                enKucuk = c;
            } else {
                ortanca = c;
                enKucuk = a;
            }
        } else {
            enBuyuk = c;
            if (a > b) {
                ortanca = a;
                enKucuk = b;
            } else {
                ortanca = b;
                enKucuk = a;
            }
        }
        System.out.println("Sayılar büyükten küçüğe: " + enBuyuk + " > " + ortanca + " > " + enKucuk);
    }
}
