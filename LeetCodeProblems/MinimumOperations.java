//! 3512. Minimum Operations to Make Array Sum Divisible by K
//? Input: nums = [3,9,7], k = 5
//? Output: 4

class MinimumOperations {
    static int minOperations(int arr[], int k) {

        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total % k;
    }

    public static void main(String args[]) {
        int arr[] = { 3, 9, 7 };
        int k = 5;
        System.out.println(minOperations(arr, k));

    }
}