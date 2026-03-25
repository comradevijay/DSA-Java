
import java.util.*;

class Main {
    public static void main(String[] args) {
      int arr[] = {1, 3, 4, 5};
      String s = "vijay";
      subArray(arr);
      subString(s);
    }

    public static void subArray(int[] arr) {
      int n = arr.length;
      for (int i = 0; i < n; i++) {
        for (int j = i; j < n; j++) {
          for (int k = i; k <= j; k++) {
            System.out.print(arr[k] + " ");
          }
          System.out.println();
        }
      }
    }

    public static void subString(String s) {
      int n = s.length();
      for (int i = 0; i < n; i++) {
        for (int j = i; j < n; j++) {

        //   System.out.println(s.substring(i,j+1));
          
          for (int k = i; k <= j; k++) {
            System.out.print(s.charAt(k)+" ");
          }
          System.out.println();
          
        }
      }
    }
}


class SubArray{
    public static void main(String[] args) {
        String s = "vijay";
        subSting(s);
        
    }

    public static void subSting(String s) {

        int n = s.length();
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                String temp = s.substring(i,j+1);
                arr.add(temp);
            }          
        }
        System.out.println(arr);
    }
    
}

//? Max sum of 3 length subArray

class SubArray3 {
    public static void main(String[] args) {
      int arr[] = {5, 9, 1, 8, 7};
      int sl = 3;
      subArray(arr, sl);
      
    }

    public static void subArray(int[] arr, int sl) {
      int n = arr.length;
      int ans = 0;
      for (int i = 0; i < n-sl; i++) {
        int j = i+sl-1;
        int temp = 0;
        for(int k=i; k<=j;k++){
          temp += arr[k];
        }
        ans = Math.max(ans, temp);
      }
      System.out.println(ans);
      
    }
}


//?  Sliding Window

class SlidingWindow{
    public static void main(String[] args) {
        int arr[] = {5, 9, 1, 8, 7};
        int n = arr.length;
        int sl = 3;
        int ans = 0;
        subArray(arr, n, sl, ans);
    }

    public static void subArray(int arr[], int n, int sl, int ans) {
        int l = 0;
        int temp = 0;
        for (int r = 0; r < n; r++) {
            temp += arr[r];
            if (r - l + 1 > sl) {
                temp -= arr[l];
                l++;
            }
            if (r - l + 1 == sl) {
                ans = Math.max(temp, ans);
            }
        }
        System.out.println(ans);
    }
}