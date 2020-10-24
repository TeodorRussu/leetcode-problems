package solutions;

public class Atoi {
    public int myAtoi(String str) {
        if (str == null) {
            return 0;
        }
        str = str.trim();
        if (str.isEmpty() || str.charAt(0) != '-' && str.charAt(0) != '+' && (str.charAt(0) < '0' || str.charAt(0) > '9')) {
            return 0;
        }

        boolean positive = true;
        long number = 0;

        if (str.startsWith("-") || str.startsWith("+")) {
            positive = !str.startsWith("-");
            str = str.substring(1);
        }

        for (int i = 0; i < str.length(); i++) {
            char charAtIndex = str.charAt(i);
            if (charAtIndex < '0' || charAtIndex > '9') {
                break;
            }
            number = number * 10l + (long) (charAtIndex - '0');

            if (number > (long) Integer.MAX_VALUE) {
                if (positive)
                    return Integer.MAX_VALUE;
                return Integer.MIN_VALUE;
            }
        }
        number = positive ? number : -1 * number;
        return (int) number;
    }
}
