//Given an array of integers nums which is sorted in ascending order, and an integer target, 
//write a function to search target in nums. 
//If target exists, then return its index. Otherwise, return -1.

import java.util.Scanner;

public class D5 {
    public static int binarySearch(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid; 
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        int target = scanner.nextInt();
        int result = binarySearch(nums, target);
        if (result == -1) {
            System.out.println("Target not found in array.");
        } else {
            System.out.println(result);
        }
    }
}
