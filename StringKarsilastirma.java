import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Klavyeden girilen iki stringin benzer olarn karakterlerini string olarak geri döndüren program
        // str1 = taner , str2 = "Tamer"    geri dönen "aer"
        Scanner input = new Scanner(System.in);
        String yeni = " ";
        System.out.println("Iki Kelime Giriniz: ");
        String kelime1 = input.nextLine();
        String kelime2 = input.nextLine();

        for (int i = 0; i < kelime1.length(); i++) {
            for (int j = 0; j < kelime2.length(); j++)
                if (kelime1.charAt(i) == kelime2.charAt(j)) {
                    yeni += kelime1.charAt(i);
                }
        }
        System.out.println(yeni);
    }
}
