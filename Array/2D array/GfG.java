public class GfG {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4, 5},
            {5, 6, 7, 8, 5},
            {9,10,11,12, 5},
            {13,14,15,16,5}
        };

        System.out.println("Spiral Order:");
        printSpiral(matrix);
    }

    // Method to print a given matrix in spiral form
    public static void printSpiral(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            System.out.println("Matrix is empty.");
            return;
        }

        int top = 0, left = 0;
        int bottom = matrix.length - 1, right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            // Traverse from left to right along the top row
            for (int i = left; i <= right; i++) {
                System.out.print(matrix[top][i] + " ");
            }
            top++;

            // Traverse from top to bottom along the right column
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--;

            // Traverse from right to left along the bottom row
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--;
            }

            // Traverse from bottom to top along the left column
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            }
        }
    }
}
