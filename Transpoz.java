public class Main {
    public static void main(String[] args) {
        // Transpoz
        int matris1[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int sonucMatris[][] = new int[matris1[0].length][matris1.length];

        for(int i = 0; i < matris1.length; i++)
        {
            for(int j = 0; j < matris1[0].length; j++)
            {
                sonucMatris[j][i] =  matris1[i][j];
            }
        }


        for(int i = 0; i < sonucMatris.length; i++)
        {
            for(int j = 0; j < sonucMatris[0].length; j++)
            {
                System.out.print(sonucMatris[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}
