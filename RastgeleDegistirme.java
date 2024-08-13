public class Main {
    public static void main(String[] args) {
        int[] listem = {5, 47, 84, 93, 21, 27, 29};

        for (int i = 0; i < listem.length; i++) {
            int index = (int) (Math.random() * listem.length);

            int temp = listem[i];
            listem[i] = listem[index];
            listem[index] = temp;
        }

        for (int i = 0; i < listem.length; i++) {
            System.out.print(listem[i] + " ");
        }
    }
}
