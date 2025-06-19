public class ques35 {

    // Method to create a 3x3 matrix (hardcoded as per the question image)
    public static int[][] createMatrix() {
        return new int[][] {
            {1, 2, 3},
            {0, 1, 4},
            {5, 6, 0}
        };
    }

    // Method to find the transpose of a matrix
    public static int[][] transpose(int[][] matrix) {
        int[][] transposed = new int[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                transposed[j][i] = matrix[i][j];
        return transposed;
    }

    // Method to calculate the determinant of a 3x3 matrix
    public static int determinant(int[][] m) {
        return m[0][0]*(m[1][1]*m[2][2] - m[1][2]*m[2][1])
             - m[0][1]*(m[1][0]*m[2][2] - m[1][2]*m[2][0])
             + m[0][2]*(m[1][0]*m[2][1] - m[1][1]*m[2][0]);
    }

    // Method to get cofactor matrix
    public static int[][] getCofactor(int[][] matrix) {
        int[][] cof = new int[3][3];

        cof[0][0] =  (matrix[1][1]*matrix[2][2] - matrix[1][2]*matrix[2][1]);
        cof[0][1] = -(matrix[1][0]*matrix[2][2] - matrix[1][2]*matrix[2][0]);
        cof[0][2] =  (matrix[1][0]*matrix[2][1] - matrix[1][1]*matrix[2][0]);

        cof[1][0] = -(matrix[0][1]*matrix[2][2] - matrix[0][2]*matrix[2][1]);
        cof[1][1] =  (matrix[0][0]*matrix[2][2] - matrix[0][2]*matrix[2][0]);
        cof[1][2] = -(matrix[0][0]*matrix[2][1] - matrix[0][1]*matrix[2][0]);

        cof[2][0] =  (matrix[0][1]*matrix[1][2] - matrix[0][2]*matrix[1][1]);
        cof[2][1] = -(matrix[0][0]*matrix[1][2] - matrix[0][2]*matrix[1][0]);
        cof[2][2] =  (matrix[0][0]*matrix[1][1] - matrix[0][1]*matrix[1][0]);

        return cof;
    }

    // Method to find inverse of 3x3 matrix
    public static double[][] inverse(int[][] matrix) {
        int det = determinant(matrix);
        if (det == 0) {
            System.out.println("Matrix is singular, inverse does not exist.");
            return null;
        }

        int[][] cof = getCofactor(matrix);
        int[][] adj = transpose(cof);

        double[][] inv = new double[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                inv[i][j] = adj[i][j] / (double) det;

        return inv;
    }

    // Utility method to print matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) System.out.print(val + "\t");
            System.out.println();
        }
    }

    public static void printMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row) System.out.printf("%.2f\t", val);
            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {
        int[][] matrix = createMatrix();
        System.out.println("Original Matrix:");
        printMatrix(matrix);

        int[][] trans = transpose(matrix);
        System.out.println("\nTranspose:");
        printMatrix(trans);

        int det = determinant(matrix);
        System.out.println("\nDeterminant: " + det);

        double[][] inverseMatrix = inverse(matrix);
        if (inverseMatrix != null) {
            System.out.println("\nInverse:");
            printMatrix(inverseMatrix);
        }
    }
}
