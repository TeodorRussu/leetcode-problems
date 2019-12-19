package solutions;

public class RegExMatching {


    public boolean isMatch(String s, String p) {
        if (s.equals(p)) {
            return true;
        }
        if (s == null || p == null) {
            return false;
        }
        return checkMatching(s, p);
    }

    private boolean checkMatching(String s, String p) {
        boolean[][] matrix = createMatrix(s, p);
        printMatrix(matrix);
        return validateResult(matrix, s, p);
    }

    private boolean validateResult(boolean[][] matrix, String s, String p) {
        int heigth = s.length();
        int width = p.length();

        int limit = heigth > width ? width : heigth;

        return matrix[limit][limit];

    }

    private void printMatrix(boolean[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(("" + matrix[i][j]).charAt(0));
            }
            System.out.println();
        }
    }

    private boolean[][] createMatrix(String s, String p) {
        boolean[][] matrix = new boolean[s.length() + 1][p.length() + 1];

        for (int i = 0; i < s.length() + 1; i++) {
            for (int j = 0; j < p.length() + 1; j++) {
                if (i == 0 && j == 0) {
                    matrix[i][j] = true;
                } else if (i == 0 || j == 0) {
                    matrix[i][j] = false;
                } else {
                    char sChar = s.charAt(i - 1);
                    char pChar = p.charAt(j - 1);

                    switch (pChar) {
                        case '.':
                            matrix[i][j] = matrix[i - 1][j - 1];
                            break;
                        case '*':
                            if (matrix[i][j - 2] == true) {
                                matrix[i][j] = true;
                            } else {
                                if (p.charAt(j - 2) == sChar || p.charAt(j - 2) == '.') {
                                    matrix[i][j] = matrix[i - 1][j-1];
                                } else {
                                    matrix[i][j] = false;
                                }
                            }
                            break;
                        default:
                            matrix[i][j] = sChar == pChar ? matrix[i - 1][j - 1] : false;

                    }

                }
            }
        }
        return matrix;
    }

}
