package week2;

import java.util.*;

public class NewCode{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = Integer.parseInt(sc.nextLine());
        int n = Integer.parseInt(sc.nextLine());
        String input = sc.nextLine();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input.split(",")[i]);
        }
        int result = getResult(l, n, arr);
        System.out.println(result);
    }

    public static int getResult(int l, int n, int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            int w = 1;
            for (int k = i - 1; k >= 0; k--) {
                if (arr[k] <= arr[i]) {
                    w++;
                }
            }
            for (int k = i + 1; k < arr.length; k++) {
                if (arr[k] <= arr[i]) {
                    w++;
                }
            }
            if (w >= l) {
                res = Math.max(res, -arr[i]);
            }
        }
        return res;
    }
}