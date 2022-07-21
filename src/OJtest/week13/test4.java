package OJtest.week13;

import java.util.Scanner;

/**
 * https://matiji.net/exam/dohomework/1268/4
 * 给定两个长度均为n的序列a，b，问有多少（l，r），满足1≤l≤r且max[i=l,r]ai= min[i=l,r]bi
 * 属于区间动态规划问题：https://blog.csdn.net/Asun0204/article/details/81606180
 */
public class test4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = input.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr2[i] = input.nextInt();
        }

        int[][] dp_max = new int[n][n];
        int[][] dp_min = new int[n][n];
        for (int i=0;i<n;i++) {
            dp_max[i][i] = arr1[i];
            dp_min[i][i] = arr2[i];
            for (int j=i+1;j<n;j++) {
                dp_max[i][j] = Math.max(dp_max[i][j-1], arr1[j]);
                dp_min[i][j] = Math.min(dp_min[i][j-1], arr2[j]);
            }
        }

        int count = 0;
        for (int i=0;i<n;i++)
            for (int j=i;j<n;j++)
                if (dp_max[i][j] == dp_min[i][j])
                    count++;
        System.out.println(count);
    }
}
