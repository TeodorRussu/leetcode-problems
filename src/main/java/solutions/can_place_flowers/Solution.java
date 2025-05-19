package solutions.can_place_flowers;

class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int maxFlowers = 0;
        int currentRange = 0;
        int len = flowerbed.length;

        for(int i = 0; i< len; i++){
            if(flowerbed[i] == 1){
                continue;
            }
            boolean emptyLeft = i == 0 || flowerbed[i-1] == 0;
            boolean emptyRight = i == len - 1 || flowerbed[i+1] == 0;

            if( emptyLeft && emptyRight ){
                flowerbed[i] = 1;
                maxFlowers++;
            }

        }
        return maxFlowers >= n;
    }
}