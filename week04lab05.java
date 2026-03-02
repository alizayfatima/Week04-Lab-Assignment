public class week04lab05 {
    // add matrices (assumes both have same dimensions)
    public static void addMatrix(int a[][], int b[][]) {
        int n = a.length;
        int m = a[0].length;
        int c[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("Addition of two matrix: ");
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void subtractMatrix(int a[][], int b[][]) {
        int n = a.length;
        int m = a[0].length;
        int c[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                c[i][j] = a[i][j] - b[i][j];
            }
        }
        System.out.println("Subtraction of two matrix: ");
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void transposeMatrix(int a[][]) {
        int n = a.length;
        int m = a[0].length;
        int c[][] = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                c[j][i] = a[i][j];
            }
        }
        System.out.println("Transpose of matrix(a): ");
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean symmetricMatrix(int a[][]) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] != a[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int sumofDaignoal(int a[][]) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i][i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int a[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int b[][] = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        addMatrix(a, b);
        subtractMatrix(a, b);
        transposeMatrix(a);
        if (symmetricMatrix(a)) {
            System.out.println("The matrix (a) is symmetric.");
        } else {
            System.out.println("The matrix (a) is not symmetric.");
        }
        System.out.println("Sum of diagonal elements of (a) matrix: " + sumofDaignoal(a));
    }
}
