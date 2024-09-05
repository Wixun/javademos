public class Main {
    public static void main(String[] args) {
        int[] dizi1 = {2, 4, 7, 9, 12, 14, 17, 19, 22, 24}; // Uygun dizi örneği
        int[] dizi2 = {2, 4, 7, 9, 12, 15}; // Uygun olmayan dizi örneği

        System.out.println(checkPattern(dizi1)); // true
        System.out.println(checkPattern(dizi2)); // false
    }

    public static boolean checkPattern(int[] dizi) {
        int terim = 2;
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] != terim) {
                return false;
            } else {
                if (i % 2 == 0) {
                    terim += 2;
                } else {
                    terim += 3;
                }
            }
        }
        return true;
    }
}
