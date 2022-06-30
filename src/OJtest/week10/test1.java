package OJtest.week10;
/**
 * 题目描述：
 * 给定一个n行n列的矩阵，其中 n 的取值范围为 0到100之间的整数，请找到此矩阵的一个子矩阵，
 * 并且此子矩阵的各个元素的和最大，输出这个最大的值。
 *
 * Example：
 * 0 -2 -7 0
 * 9 2 -6 2
 * -4 1 -4 1
 * -1 8 0 -2
 * 此子矩阵的值为9+2+(-4)+1+(-1)+8=15。
 *
 * 解题思路
 * 给定了一个矩阵，或者叫二维数组。大小是N行N列。
 * 我们考虑一种特殊情况，N=1时：即只有1行1列的情况；那最大子矩阵就是其元素自己与自己求和的结果。
 * 当N=4时，矩阵为4行4列，
 * 那么根据示例中给出的数据，子矩阵的划分方法可以有许多种，假设我们取值的窗口为前2行，即：
 *
 * 0 -2 -7 0
 * 9 2 -6 2
 *
 * 我们将第一行（i=1时）的第j列数据和第二行（i=2时）的第j列数据对应相加；这样就得到一个一维数组，即
 * [9,0,-13,2]
 * 那么问题就转换为，就一个一维数组的最大子段和的问题了。
 * 同样，我们取值窗口为前3行，或者前4行；然后将每一行对应得列上下相加；
 * 最终都可以将问题转换为求一个一维数组的最大字段和的问题
 * */


import java.io.FileNotFoundException;
import java.util.Scanner;

public class test1 {
    public static void main(String args[]) throws FileNotFoundException {
        MaxSubArrayDemo p = new MaxSubArrayDemo();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            int n = 0;
            int[][] array = new int[101][101];
            while (sc.hasNext()) {
                n = sc.nextInt();
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        array[i][j] = sc.nextInt();
                    }
                }
                System.out.println(p.maxSubMatrix(n, array));
            }
        }
    }
}

class MaxSubArrayDemo {
    /*
     * 动态规划算法分析如下：
     * 算法设计思路：
     * 如果一维数组中的元素均为正数，则所有元素之和最大。及从 a[0]一直累加到数组的最后一个元素就可以获得最大和。
     * 如果一维数组中的元素有负数，有0，有正数，则需要进行比较了。
     *
     * 令b[j]表示从a[0]~a[j]的最大子段和。
     * b[j]的当前值只有两种情况:
     * (1) 最大子段一直连续到a[j]
     * (2) 以a[j]为起点的子段  //如果不是第（1）种，则（1）肯定为负，舍去。
     * 还有一种情况，那就是最大字段没有包含a[j]，如果没有包含a[j]的话，那么在算b[j]之前的时候我们已经算出来了，
     * 注意我们只是算到位置为j的地方，所以最大子段在a[j]后面的情况我们可以暂时不考虑。
     * 由此我们得出b[j]的状态转移方程为：b[j]=max{b[j-1]+a[j], a[j]},
     * 所求的最大子段和为max{b[j],0<=j<n}。
     * 进一步我们可以将b[]数组用一个变量代替。
     * */

    public int maxSubArray(int n, int a[]) {
        int b = 0, sum = -10000000;
        for (int i = 0; i < n; i++) {
            if (b > 0) {
                b += a[i];
            }
            else {
                b = a[i]; //如果前面为零，如果相加，则影响后面结果，所以抛弃前面总和
            }
            if (b > sum) {
                sum = b;
            }
        }
        return sum;
    }

    /*
     * 根据题目的假设条件，矩阵为 n*n的矩阵，并且(0<n<=100)
     * 则声明一个一维数组  int b[] = new int[101];
     * 如下所示(ari表示a[r][i],假设数组下标从1开始)：
     *   | a11 …… a1i ……a1j ……a1n |
     *   | a21 …… a2i ……a2j ……a2n |
     *   |  .     .     .    .    .     .    .   |
     *   |  .     .     .    .    .     .    .   |
     *   | ar1 …… ari ……arj ……arn |
     *   |  .     .     .    .    .     .    .   |
     *   |  .     .     .    .    .     .    .   |
     *   | ak1 …… aki ……akj ……akn |
     *   |  .     .     .    .    .     .    .   |
     *   | an1 …… ani ……anj ……ann |
     * 那么我们将从第r行到第k行的每一行中相同列的加起来，可以得到一个一维数组如下：
     * (ar1+……+ak1, ar2+……+ak2, ……,arn+……+akn)
     * 由此我们可以看出最后所求的就是此一维数组的最大子段和问题，
     * 到此我们已经将问题转化为上面的已经解决了的问题了。
     * */
    public int maxSubMatrix(int n, int[][] array) {
        int i, j, k, max = 0, sum = -100000000;
        int b[] = new int[101];
        for (i = 0; i < n; i++) {
            for (k = 0; k < n; k++)// 初始化b[]
            {
                b[k] = 0;
            }
            for (j = i; j < n; j++)// 把第i行到第j行相加,对每一次相加求出最大值
            {
                for (k = 0; k < n; k++) {
                    b[k] += array[j][k];
                }
                max = maxSubArray(k, b);
                if (max > sum) {
                    sum = max;
                }
            }
        }
        return sum;
    }
}