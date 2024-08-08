import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int password;
        boolean isPasswordSuccess = false;

        Scanner input = new Scanner(System.in);

        while (!isPasswordSuccess) {
            System.out.print("Sifre giriniz: ");
            password = input.nextInt();
            if (password == 123) {
                System.out.println("Dogru");
                isPasswordSuccess = true;
            } else {
                System.out.println("Yanlis");
            }
        }
    }
}
