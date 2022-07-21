package OJtest.week13;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://matiji.net/exam/dohomework/1268/6
 * 互质子序列：一个序列中，最大公约数为1的子序列的个数
 *
 */
public class test6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        Solution a = new Solution();
        a.countDifferentSubsequenceGCDs(arr);
    }
}

class Solution {
    public int countDifferentSubsequenceGCDs(int[] nums) {
        int maxNum = 0, ans = 0;
        for (int num : nums)
            maxNum = Math.max(maxNum, num);
        boolean[] hasNum = new boolean[maxNum + 1];
        Arrays.fill(hasNum, false);
        for (int num : nums)
            hasNum[num] = true;

        for (int i = 1; i <= maxNum; i++) {//计算i是否为某子序列的最大公约数
            int gcdNum = 0;
            for (int g = i; g <= maxNum; g += i) {//寻找i的倍数
                if (hasNum[g] == true) {
                    if (gcdNum == 0)
                        gcdNum = g;
                    else
                        gcdNum = gcd(g, gcdNum);//记录当前遍历到i倍数的最大公约数
                    if (gcdNum == i) {//i可以为最大公约数，添加答案
                        ans++;
                        break;
                    }
                }
            }
        }
        return ans;
    }

    public int gcd(int a, int b) {//求最大公约数，默认a>b
        int c;
        while (b > 0) {
            c = a % b;
            a = b;
            b = c;
        }
        return a;
    }
}
