import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] matris = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                int i1 = (int) (Math.random() * matris.length);
                int j1 = (int) (Math.random() * matris[i].length);

                int temp = matris[i][j];
                matris[i][j] = matris[i1][j1];
                matris[i1][j1] = temp;
            }
        }

        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                System.out.print(matris[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
