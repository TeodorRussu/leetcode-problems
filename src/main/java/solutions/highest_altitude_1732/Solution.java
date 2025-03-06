package solutions.highest_altitude_1732;

class Solution {
    public int largestAltitude(int[] gain) {
        if(gain == null || gain.length == 0){
            return 0;
        }
        int highestAltitude = 0;
        int currentAltitude = 0;

        for (int i = 0; i<gain.length; i++){
            currentAltitude+=gain[i];
            if(currentAltitude>highestAltitude){
                highestAltitude = currentAltitude;
            }
        }
        return highestAltitude;
    }
}