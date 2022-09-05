package BinarySearchAlgo;

public class BinarySearch {
    /*
    Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
You must write an algorithm with O(log n) runtime complexity.

Example 1:

Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4
     */
    public int search(int[] nums, int target) {
        int pivot = 0;
        int left = 0;
        int right = nums.length -1;

        while (left <= right) {
            pivot = left + (right - left) / 2;
            int current = nums[pivot];
            if (current == target) {
                return pivot;
            }
            if (current < target) {
                left = pivot + 1;
            }
            else {
                right = pivot - 1;
            }
        }
        return -1;
    }
}

