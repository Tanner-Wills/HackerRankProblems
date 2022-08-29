package TwoPointer;

public class ContainerWithMostWater {
    /*
    You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
    Find two lines that together with the x-axis form a container, such that the container contains the most water.
    Return the maximum amount of water a container can store.

Example:
Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7].
In this case, the max area of water (blue section) the container can contain is 49.
     */
    public int maxArea(int[] height) {
        int maximumArea = 0;
        int currentArea = 0;
        int L = 0;
        int R = height.length -1;
        while (L < R) {
            int Lheight = height[L];
            int Rheight = height[R];
            int minheight = Math.min(Lheight, Rheight);
            int length = R-L;
            currentArea = length * minheight;
            // compare heights
            if (currentArea > maximumArea) {
                maximumArea = currentArea;
            }
            // index window
            if (Lheight < Rheight) {
                L++;
            }
            else if (Rheight < Lheight) {
                R--;
            }
            else if (Rheight == Lheight) {
                L++;
            }
        }
        return maximumArea;
    }
}
