import java.util.Scanner;

public class BinaryToHexadecimalWithoutFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir binary sayı girin: ");
        String binary = scanner.nextLine();

        // Hexadecimal sayıyı tutmak için boş bir string
        String hexadecimal = "";

        // Hexadecimal karakterleri temsil eden bir dizi
        char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7',
                           '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        
        // Başlangıç için kalan uzunluğa göre 4 bitlik grupları tamamla
        int length = binary.length();
        int groupLength = 4 - (length % 4);
        if (groupLength != 4) {
            for (int i = 0; i < groupLength; i++) {
                binary = "0" + binary;
            }
            length = binary.length();
        }

        // 4 bitlik grupları okuyarak hexadecimal'e çevirme
        int decimalValue = 0;
        for (int i = 0; i < length; i++) {
            // Mevcut bitin ondalık değerini hesapla
            decimalValue = decimalValue * 2 + (binary.charAt(i) - '0');

            // Her 4 bitlik grupta hexadecimal'e çevir ve hexadecimal stringine ekle
            if ((i + 1) % 4 == 0) {
                hexadecimal += hexChars[decimalValue];
                decimalValue = 0;  // Bir sonraki grup için sıfırla
            }
        }

        // Sonucu yazdır
        System.out.println("Girilen binary sayının hexadecimal karşılığı: " + hexadecimal);
    }
}
