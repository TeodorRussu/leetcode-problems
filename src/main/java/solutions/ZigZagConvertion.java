package solutions;

public class ZigZagConvertion {

    /**
     * For all whole numbers k,
     * <p>
     * Characters in row 00 (first) are located at indexes k * (2 * numRows - 2)
     * Characters in row numRows-1 (last) are located at indexes k * (2 * numRows - 2) + numRows - 1
     * Characters in inner row i are located at indexes k * (2 * numRows − 2) + i and (k+1)*(2 * numRows − 2) − i.
     *
     * @param s
     * @param numRows
     * @return
     */
    public String convert(String s, int numRows) {
        if (s.isEmpty() || numRows < 2) {
            return s;
        }
        StringBuilder sb = new StringBuilder();
        int step = 2 * numRows - 2;
        //first row
        fillFirstOrLastRow(s, sb, step, 0);
        //intermediate rows
        fillIntermediateRows(s, numRows, sb, step);
        //last row
        fillFirstOrLastRow(s, sb, step, numRows - 1);

        return sb.toString();
    }

    private void fillIntermediateRows(String s, int numRows, StringBuilder sb, int step) {
        for (int i = 1; i < numRows - 1; i++) {
            int firstIndex = i;
            int secondIndex = step - i;
            while (firstIndex < s.length()) {
                sb.append(s.charAt(firstIndex));
                if (secondIndex < s.length()) {
                    sb.append(s.charAt(secondIndex));
                }
                firstIndex += step;
                secondIndex += step;
            }
        }
    }

    private void fillFirstOrLastRow(String s, StringBuilder sb, int step, int tryIndex) {
        while (tryIndex < s.length()) {
            sb.append(s.charAt(tryIndex));
            tryIndex += step;
        }
    }
}
