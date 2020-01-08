package solutions;

public class ContainerWithMostWater {

    public int maxAreaBruteForce(int[] height) {

        int maxArea = 0;

        for (int i = 0; i < height.length - 1; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int heigth = height[i] < height[j] ? height[i] : height[j];
                int len = j - i;
                int area = heigth * len;

                if (area > maxArea) {
                    maxArea = area;
                }
            }
        }
        return maxArea;
    }

    public int maxArea(int[] input) {
        int maxArea = 0;

        int startIndex = 0;
        int endIndex = input.length-1;

        while(endIndex > startIndex){
            int heigth = input[startIndex] < input[endIndex] ? input[startIndex] : input[endIndex];

            int len = endIndex - startIndex;
            int area = heigth * len;

            if (area > maxArea) {
                maxArea = area;
            }

            if (heigth == input[startIndex]){
                startIndex++;
            }else {
                endIndex--;
            }
        }
        return maxArea;
    }
}
