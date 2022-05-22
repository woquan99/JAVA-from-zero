package OJtest;

/**
 * 编程题1-小码哥给你两个正整数n和f，计算judge（n，f）=f%1+f%2+f%3++f%n的值，其中f%示除以的余数。
 * 输入格式：输入仅一行，包含两个正整数n，f。
 * 输出格式：输出仅一行，即judge（n，f）。
 * 题目来源：https://matiji.net/exam/dohomework/767/1
 * */
//import java.util.Scanner;
//class week4 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        long n = input.nextInt();
//        long f = input.nextInt();
//        long sum = 0;
//        for(long i=1;i<=n;i++){
//            sum += f%i;
//        }
//        System.out.println(sum);
//    }
//}

/**
 * 编程题2-把N！按照算术基本定理的形式表示。
 * 基本算数定理：一个数一定可以用一下形式表示：x=p[1]^c1*p[2]^c2*...p[i]^ci，
 * p[i]为质数数组，c[i]为每一个质数的幕的次数。
 * 对于不同的x来说，有不同的p和c数组
 * 输入格式：输入一个整数N。
 * 输出格式：N！分解质因数后的结果，共若干行，每行两个数p,c表示含有p^c项。按照p[i]从小到大的顺序输出
 * 题目来源：https://matiji.net/exam/dohomework/767/2
 * AC解法：https://blog.csdn.net/qq_42505741/article/details/98173084
 * */

//import java.util.Scanner;
//class week4 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        long N = input.nextInt();
//        System.out.println(N/2);
////        int grade[] = new int[N];
////        long temp = N;
//
//    }
//}

/**
 * 编程题3-
 * 题目来源：https://matiji.net/exam/dohomework/767/3
 * */
//import java.util.Scanner;
//import java.math.*;
//class week4 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        long n = input.nextInt();
//        long sum1 = 0;
//        long sum2 = 0;
//        for(long i=1;i<=n;i++){
//            sum1 += (Math.pow(i,2)-(i-1));
//            sum2 += (Math.pow(i,2));
//        }
//        System.out.println(sum1+" "+(sum2+n/2)); // 同时输出两个整型
//        System.out.println(sum2+n/2);
//    }
//}


/**
 * 编程题4-现在你需要将编号为1的柱子上的圆盘移到3柱子上，顺序不变
 * 注意：你在移动过程中，不可以将大的圆盘放在小圆盘上，你一次只可以移动一个盘子
 * 现在有一个4个柱子的汉诺塔，在规则不变的情况下，问最少需要移动多少次才能把盘子从1号柱子移到4号柱子上。
 * 输入格式：一个整数f，表示n取(1,f)的种情况
 * 输出格式：输出f行，表示当n分别取（1，f）的情况下，需要的最少移动次数。
 * 题目来源：https://matiji.net/exam/dohomework/767/4
 * 这道题目用 C++ 顺利 AC：https://blog.csdn.net/yzq199902/article/details/124906798
 * */
//class week4 {
//    public static void main(String[] args) {
//        }
//    }


/**
 * 编程题5-
 * 题目来源：https://matiji.net/exam/dohomework/767/5
 * */
//import java.util.Arrays;
//import java.util.Comparator;
//import java.util.Scanner;
//public class week4 {
//
//    public static void main(String[] args) {
//        // 输入一个整数n后，再输入n对数组
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int[][] nums = new int[n][2];
//        for (int i = 0; i < n; i++) {
//            nums[i][0] = in.nextInt();
//            nums[i][1] = in.nextInt();
//        }
//        int res = getResult(nums);
//        System.out.println(res);
//    }
//
//    public static int getResult(int[][] nums) {
//
//        Arrays.sort(nums, new Comparator<int[]>() {    // 匿名内部类
//            @Override
//            public int compare(int[] e1, int[] e2) {
//                // 如果第一列元素相等，则比较第二列元素
//                if (e1[0] == e2[0]) return e1[1] - e2[1];   // e1[1]-e2[1]表示对于第二列元素进行升序排序
//                return e1[0] - e2[0];                       // e1[0]-e2[0]表示对于第一列元素进行升序排序
//            }
//        });
//        int max = 0, sum = 0;
//        for (int i = 0; i < nums.length; i++) {
//            int x = sum - nums[i][1];
//            max = Math.max(max, x);
//            sum += nums[i][0];
//        }
//
//        Arrays.sort(nums, new Comparator<int[]>() {    // 匿名内部类
//            @Override
//            public int compare(int[] e1, int[] e2) {
//                // 如果第一列元素相等，则比较第二列元素
//                if (e1[1] == e2[1]) return e1[0] - e2[0];   // e1[1]-e2[1]表示对于第二列元素进行升序排序
//                return e1[1] - e2[1];                       // e1[0]-e2[0]表示对于第一列元素进行升序排序
//            }
//        });
//        int max2 =0;sum=0;
//        for (int i = 0; i < nums.length; i++) {
//            int x = sum - nums[i][1];
//            max2 = Math.max(max2, x);
//            sum += nums[i][0];
//        }
//
//        return Math.min(max,max2);
//    }
//
//}