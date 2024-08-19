public class Main {
    public static void main(String[] args) {
        // kendisine parametre olarak gelen stringin palindrome olup olmadigini hesaplayiniz.
        String kelime = "abbcbba";
        boolean palindrome = true;

        // Her iki uctan karakterleri karsilastiriyoruz
        for (int i = 0; i < kelime.length() / 2; i++) {
            if (kelime.charAt(i) != kelime.charAt(kelime.length() - 1 - i)) {
                palindrome = false;
                break; // dongude bozan durum varsa direk cikis yapiyor yoksa kontrol etmeye devam ederdi.
            }
        }

        if (palindrome)
            System.out.println("Palindrom");
        else
            System.out.println("Palindrom degil");

    }
}
