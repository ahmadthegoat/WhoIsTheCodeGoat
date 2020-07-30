import java.util.Arrays;

public class Problem02 {
            public String arraytoString(){
                return Arrays.deepToString(squarebuilder(3));
            }

    public static int[][] squarebuilder(int n) {
        int[][] result = new int[n][n];
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                int rowCont = (((n + 1) / 2 + row + col) % n);
                int colCont = (((n + 1) / 2 + row + n - col - 1) % n) + 1;
                result[row][col] = ((rowCont * n) + colCont);
            }
        }
        return result;}
}


