import java.util.Scanner;

public class CinZodyagiHesaplayici {
    public static void main(String[] args) {
        // Kullanıcıdan doğum yılını almak için Scanner nesnesi oluşturuyoruz
        Scanner scanner = new Scanner(System.in);
        
        // Kullanıcıdan doğum yılını girmesini istiyoruz
        System.out.print("Doğum Yılınızı Giriniz: ");
        int dogumYili = scanner.nextInt();
        
        // Zodyak burcunu belirlemek için doğum yılının 12 ile bölümünden kalan değeri buluyoruz
        int zodyakIndex = dogumYili % 12;
        
        // if-else yapıları kullanarak zodyak burcunu belirliyoruz
        String zodyakBurcu;
        if (zodyakIndex == 0) {
            zodyakBurcu = "Maymun";
        } else if (zodyakIndex == 1) {
            zodyakBurcu = "Horoz";
        } else if (zodyakIndex == 2) {
            zodyakBurcu = "Köpek";
        } else if (zodyakIndex == 3) {
            zodyakBurcu = "Domuz";
        } else if (zodyakIndex == 4) {
            zodyakBurcu = "Fare";
        } else if (zodyakIndex == 5) {
            zodyakBurcu = "Öküz";
        } else if (zodyakIndex == 6) {
            zodyakBurcu = "Kaplan";
        } else if (zodyakIndex == 7) {
            zodyakBurcu = "Tavşan";
        } else if (zodyakIndex == 8) {
            zodyakBurcu = "Ejderha";
        } else if (zodyakIndex == 9) {
            zodyakBurcu = "Yılan";
        } else if (zodyakIndex == 10) {
            zodyakBurcu = "At";
        } else {
            zodyakBurcu = "Koyun";
        }
        
        // Kullanıcının zodyak burcunu ekrana yazdırıyoruz
        System.out.println("Çin Zodyağı Burcunuz: " + zodyakBurcu);
        
        // Scanner nesnesini kapatıyoruz
        scanner.close();
    }
}
