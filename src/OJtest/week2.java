package OJtest;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * 编程题1-幸运数是波兰数学家乌拉姆命名的。它采用与生成素数类似的“筛法”生成
 * 首先从1开始写出自然数1,2,3,4,5,6,….
 * 1 就是第一个幸运数。
 * 我们从2这个数开始。把所有序号能被2整除的项删除，变为：
 * 1 _ 3 _ 5 _ 7 _ 9 ….
 * 把它们缩紧，重新记序，为：
 * 1 3 5 7 9 …. 。这时，3为第2个幸运数，然后把所有能被3整除的序号位置的数删去。注意，是序号位置，不是那个数本身能否被3整除!! 删除的应该是5，11, 17, …
 * 此时7为第3个幸运数，然后再删去序号位置能被7整除的(19,39,…)
 * 最后剩下的序列类似：
 * 1, 3, 7, 9, 13, 15, 21, 25, 31, 33, 37, 43, 49, 51, 63, 67, 69, 73, 75, 79, …
 * 题目来源：https://matiji.net/exam/dohomework/615/5
 * 题目参考：https://blog.csdn.net/cactus_lrg/article/details/79890015
 * */
//public class week2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        sc.close();
//        // 创建数列1，2,3，，，，n
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        for (int i = 1; i <=n; i++) {
//            list.add(i);
//        }
//
//        int length = 0;
//        int flag = 0;
//        // 去除非幸运数
//        for (int i = 0; i < n ; i++) {
//            length = list.size();
//            flag = 0;
//            if (list.get(i) > length) {
//                break;
//            }
//            if (i == 0) {
//                for (int j = 0; j < length; j++) {
//                    if ((j + 1) % 2 == 0) {
////                        System.out.println(list.get(j - flag));
//                        list.remove(j - flag);
//                        flag++;
//                    }
//                }
//            } else {
//                for (int j = 0; j < length; j++) {
//                    if ((j + 1) % list.get(i) == 0) {
//                        list.remove(j - flag);
//                        flag++;
//                    }
//                }
//            }
//        }
//
//        int x = 0;
//        for (int i = 0, l = list.size(); i < l; i++) {
////            System.out.println(list.get(i));
//            if (list.get(i) == n)
//                x++;
//        }
//        if(x!=0)
//            System.out.println("YES");
//        else
//            System.out.println("NO");
//
//    }
//}

/**
 * 编程题2-输入数字N,编写一个程序，用该数字的所有数字重组成一个最大的数字，不考虑0，负数等情况，输入被视为字符串
 * 题目来源：https://matiji.net/exam/dohomework/615/4
 * 题目参考：https://www.cnblogs.com/wangkongming/p/13061577.html
 * */
//import java.util.Arrays;
//public class week2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String temp = sc.nextLine();
//        int len = temp.length();
//        int[] arr = new int[len];
//        Integer newScores[] = new Integer [len];
//        for(int i=0;i<len;i++) {
//            arr[i]=Integer.parseInt(temp.substring(0,1));
//            newScores[i]=new Integer(arr[i]);
//            temp=temp.substring(1);
//        }
//        Arrays.sort(newScores, Collections.reverseOrder());
//        for(int j=0;j<len;j++) {
//            System.out.print(newScores[j]);
//        }
//    }
//}
/**
 * 编程题3-有一个长为n，宽为m，高为k（层数）的长方体，它可以看成n×m×k个1×1×1大小的单位正方体。每个单位正方体都有一个字符。
 * “.”表示该位置防疫措施不好，如果被传染了就会感染病毒。“#”表示该区人民防疫措施良好，永远不会感染病毒（甚至都不会成为病毒的携带者）。
 * 现在在长方体的最顶层（层号为1）某个位置，因实验室泄露爆发了病毒。每过一个单位时间，病毒将扩散至周围6个方向的地区。
 * 如果某个地区为”#”，那么一定不会被感染并且不会携带病毒同时也不会传播病毒。（但如果这个地方存在泄露的实验室，那么哪怕防疫措施再好也会被感染以及传播病毒）
 * 现在小码哥需要知道，假如第一层坐标为（x,y）的实验室泄露了病毒，那么最多会有多少区域被感染
 * 输入格式：第一行三个正整数k,n,m（k，n，m≤10）接下来k层，每层n行，每行m个字符，
 * 表示长方体每个单位的状态最后一行两个正整数x，y（x≤n,y≤m）表示发生泄漏的实验室的坐标（这个实验室在第一层）
 * 输出格式：按题目要求输出一行一个整数表示答案。
 * 题目来源：https://matiji.net/exam/dohomework/615/3
 * 题目参考：
 * */

//public class week2 {
//    public static void main(String[] args) {
//
//    }
//}

/**
 * 编程题4-如果图G中的一个路径包括每个边怡好一次，则该路径称为欧拉路径（Euler path）输入一个有向图，请你判断这个有向图上是否存在欧拉路径
 * 输入格式：第一行两个整数n和m，表示有n个结点和m条有向边。接下来m行输入m条有向边的信息，每行两个整数a和b，分别表示边的起点和终点的编号（编号为1~m），即该条有向边从a到b
 * 输出格式：输出一个字符串”Yes”或”No”，表示这个有向图上是否存在欧拉路径。
 * 题目来源：https://matiji.net/exam/dohomework/615/2
 * 题目参考：
 * */

//public class week2 {
//    public static void main(String[] args) {
//
//    }
//}


/**
 * 编程题5-https://matiji.net/exam/dohomework/615/1
 * 题目参考：
 * */

public class week2 {
    public static void main(String[] args) {

    }
}