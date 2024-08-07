import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        String correctUserName = "Eren";
        String correctPassword = "java123";
        Scanner input = new Scanner(System.in);
        int attempt = 0;
        boolean accessGranted = false;

        while (attempt < 3 && !accessGranted) {
            System.out.println("Kullanici Adiniz: ");
            userName = input.nextLine();

            System.out.println("Sifreniz: ");
            password = input.nextLine();

            if (userName.equals(correctUserName) && password.equals(correctPassword)) {
                System.out.println("Giris Yaptiniz !");
                accessGranted = true;

                // Şifre değiştirme seçeneği
                System.out.println("Sifrenizi degistirmek ister misiniz? (Evet/Hayir)");
                String changePassword = input.nextLine();

                if (changePassword.equalsIgnoreCase("Evet")) {
                    System.out.println("Yeni Sifre: ");
                    String newPassword = input.nextLine();
                    correctPassword = newPassword;
                    System.out.println("Sifreniz Basariyla Degistirildi!");
                }

            } else {
                attempt++;
                if (attempt < 3) {
                    System.out.println("Bilgileriniz Yanlis! Kalan Deneme Hakkiniz: " + (3 - attempt));
                } else {
                    System.out.println("Hesabiniz Bloke Olmustur! Lutfen Daha Sonra Tekrar Deneyiniz.");
                }
            }
        }

        // Çıkış yapma seçeneği
        if (accessGranted) {
            System.out.println("Cikis yapmak ister misiniz? (Evet/Hayir)");
            String logout = input.nextLine();
            if (logout.equalsIgnoreCase("Evet")) {
                System.out.println("Basariyla Cikis Yaptiniz. Iyi Gunler!");
            } else {
                System.out.println("Sistemden Cikmadiniz.");
            }
        }

        input.close();
    }
}
