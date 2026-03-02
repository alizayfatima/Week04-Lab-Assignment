public class week04lab01 {
    public static void addMatrix(int[][] a, int [][] b, int c [][]) {
        a = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        b = new int[][] {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
    }

    public static void main(String[] args) {
        int[][] a = new int[3][3];
        int[][] b = new int[3][3];
        int[][] c = new int[3][3];
        addMatrix(a, b, c);
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
