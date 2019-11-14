package solutions;

public class ReverseInteger {
    public int reverse(int x) {
        int reverse = 0;
        while (x != 0) {
            int toAdd = x % 10;

            if(reverse > 0 && (Integer.MAX_VALUE - toAdd)/10 < reverse)
                return 0;
            else if(reverse < 0 && (Integer.MIN_VALUE - toAdd)/10 > reverse){
                return 0;
            }
            reverse = 10 * reverse + toAdd;
            x /= 10;
        }

      return reverse;
    }
}
