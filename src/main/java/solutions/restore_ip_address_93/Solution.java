package solutions.restore_ip_address_93;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> restoreIpAddresses(String s) {

        List<String> output = new ArrayList<>();
        int inputLength = s.length();
        if (inputLength > 12){
            return  output;
        }

        for (int d1 = 1; d1 < inputLength; d1++) {
            for (int d2 = d1 + 1; d2 < inputLength + 1; d2++) {
                for (int d3 = d2 + 1; d3 < inputLength + 2; d3++) {
                    StringBuilder ip = new StringBuilder(s);
                    if(isInvalid(ip.subSequence(0, d1))){
                        continue;
                    }
                    ip.insert(d1, ".");
                    if(isInvalid(ip.subSequence(d1+1, d2))){
                        continue;
                    }
                    ip.insert(d2, ".");

                    if(isInvalid(ip.subSequence(d2+1, d3))){
                        continue;
                    }
                    ip.insert(d3, ".");
                    if(isInvalid(ip.subSequence(d3+1, ip.length()))){
                        continue;
                    }

                    output.add(ip.toString());

                }
            }
        }
        return output;
    }

    private boolean isInvalid(CharSequence sequence) {
        String value = sequence.toString();
        if (value.isEmpty()) {
            return true;
        }
        if(value.length() > 1 && value.startsWith("0")){
            return true;
        }
        try {
            int intValue = Integer.parseInt(value);
            if (intValue < 0 || intValue > 255) {
                return true;
            }
        } catch (Exception exception) {
            return true;
        }
        return false;
    }
}
