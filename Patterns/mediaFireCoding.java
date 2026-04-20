import java.util.*;

class Main {
  public static void main(String[] args) {
    int[] arr = { 1, 4, 2, 7, 5, 9 };
    int n = arr.length;

    // System.out.println(secLargest(arr, n)); //! Second Largest

    int[] nums = { 3, 2, 4 };
    int target = 6;

    // System.out.println(Arrays.toString(twoSum(nums, n , target))); //! Two sum

    String s = "abcabcdb";

    // System.out.println(maxSubstring(s)); //! maxLength sub string

    String str = "()[]{}";

    // System.out.println(validParentheses(str)); //! Valid Parentheses

    int[] num = { 8, 5, 2, 9, 1, 3 };

    // System.out.println(thridLargest(num)); //! Thrid Largest

    int[] list = { 1, 4, 2, 4, 5, 2, 3};

    System.out.println(allDups(list));

  }

  // ! Find second largest number

  public static int secLargest(int[] arr, int n) {
    int largest = Integer.MIN_VALUE;
    int secLargest = Integer.MIN_VALUE;
    for (int i = 0; i < n; i++) {
      if (arr[i] > largest) {
        largest = arr[i];
      } else if (arr[i] > secLargest && arr[i] < largest) {
        secLargest = largest;
      }
    }
    return secLargest;
  }

  // ! Find two numbers that sum to target

  public static int[] twoSum(int[] nums, int n, int target) {
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] + nums[j] == target) {
          return new int[] { i, j };
        }
      }
    }
    return new int[] {};
  }

  // ! Longest substring without repeating characters

  public static int maxSubstring(String s) {
    HashSet<Character> cset = new HashSet<>();
    int left = 0;
    int maxLength = 0;
    for (int right = 0; right < s.length(); right++) {
      while (cset.contains(s.charAt(right))) {
        cset.remove(s.charAt(left));
        left++;
      }
      cset.add(s.charAt(right));
      maxLength = Math.max(maxLength, right - left + 1);
    }
    return maxLength;
  }

  // ! Valid parentheses using Stack

  public static boolean validParentheses(String str) {
    Stack<Character> cstack = new Stack<>();
    for (char c : s.toCharArray()) {
      if (c == '{')
        cstack.push('}');
      else if (c == '(')
        cstack.push(')');
      else if (c == '[')
        cstack.push(']');
      else if (cstack.isEmpty() || cstack.pop() != c)
        return false;
    }
    return cstack.isEmpty();
  }

  // ! Thrid largest number

  public static int thridLargest(int[] num) {
    Arrays.sort(num);
    int n = num.length;
    int ans = num[n - 3];
    return ans;
  }

  // ! Find all duplicates in array

  public static List<Integer> allDups(int[] list) {

    List<Integer> result = new ArrayList<>();

    for (int i = 0; i < list.length; i++) {
      int index = Math.abs(list[i]) - 1;
      if (list[index] < 0)
        result.add(index + 1);
      list[index] = list[index] * -1;
    }

    return result;
  }
}