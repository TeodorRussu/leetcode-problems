package solutions.hamming_distance_461;

class Solution {
    public int hammingDistance(int x, int y) {
        int hammingDistance = 0;

        while(x != 0 || y !=0){
            int bitX = x%2;
            int bitY = y%2;

            if (bitX!= bitY){
                hammingDistance++;
            }
            x = x/2;
            y = y/2;
        }
        return hammingDistance;
    }
}