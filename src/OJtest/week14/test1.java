package OJtest.week14;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 刻俄柏在打怪，她的面前有n个怪，第i个怪的血量为ai。对于一个怪物，她有两种攻击方式：
 * 1.使用ai次普通攻击消灭该怪物
 * 2.施放一次技能消灭该怪物
 * 刻俄柏最多只能使用k次技能，她想知道最少使用多少次普通攻击消灭所有怪物。
 * https://matiji.net/exam/dohomework/1389/1
 */
public class test1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /**
         * 这里面需要防止 sum 超过取值范围
         */
        Long sum = 0l;
        int n = input.nextInt();
        int k = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        if (n <= k) {
            System.out.print(0);
        }
        else {
            Arrays.sort(arr);// 按照从小到大的顺序排列
            for (int i = 0; i < (n - k); i++) {
                sum += arr[i];
            }
            System.out.println(sum);
        }
    }
}
