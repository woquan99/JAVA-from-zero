package OJtest;

import java.util.Scanner;

/**
 * 编程题1-有一个n个节点n-1条边组成的树。现在对个节点进行分组，若（i，j）想分成一组，必须满足条件：i,j之间有边，且两个节点都没有与别人成为一组。问最多能分成几个组
 * 输入格式：第一行一个数字n（1≤n≤200000）代表节点的个数。
 * 接下来n-1行每行两个数字x，y代表编号为x的节点与编号y的节点之间有一条边。
 * 输出格式：输出一个整数代表能分成的组的最大值
 * 样例1
 * 复制
 * 输入：5
 *      1 2
 *      2 3
 *      3 4
 *      4 5
 * 输出：2
 * 题目来源：https://matiji.net/exam/dohomework/999/1
 * */
//public class week9 {
//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//
//    }
//}

/**
 * 编程题2-若某东西由若干个不同的部件组成，每个部件都有代号为X和Y的两种子部件组成，对这两种子部件的排列有如下要求：
 * 这两个子部件可以彼此（同种或不同种）首尾相连成一长串，X的总个数不超过countX个，并且最多maxX个X连续连接在一起；Y同理。
 * 小码哥想知道每个部件最长能有多长，以便他进行后续的设计。
 * 输入格式：输入若干行，每行四个整数，分别为：countX，countY，maxX，maxY
 * 输出格式：输出与输入相同的行数，每行输出一个整数，代表了这个部件的最大长度，与输入一一对应
 * 样例输入：5 7 0 0
 *         4 7 1 1
 * 样例输出：0
 *         9
 * 备注
 * countX,maxX,countY,maxY≤1000000
 * 输入不超过1000行
 * 对于样例输入的第二行，有唯一的的最长序列为“YXYXYXYXY”
 * 题目来源：https://matiji.net/exam/dohomework/999/2
 * */


/**
 * 编程题3-有n（n为奇数）个长度为10的字符串，每种字符串会出现偶数次，现在有一个字符串混进来了，请你找出混进来的字符串
 * 输入格式：第一行输入一个n(1≤n≤10^5）
 * 接下来n行每行一个长度为10的字符串。
 * 输出格式：输出多余的字符串保证一定有解
 * 样例输入：9
 * iocvumuyrx
 * iacvwmuyrx
 * zhznvedddy
 * zhznvedddy
 * hpadsqqftn
 * hbadsqqftn
 * xkhdrozmrj
 * xkhdrozmrj
 * xkhdrozmri
 * 样例输出：xkhdrozmrj
 * 备注：
 * 字符串是由小写字母组成的
 * 题目来源：https://matiji.net/exam/dohomework/999/3
 * */
public class week9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i=0;i<n;i++){
            String s = input.nextLine();// 不断赋值给s,实际上并没有储存起来
        }
        while(input.hasNext()) {
            String s = input.nextLine();
            String x[] = s.split(" ");
            for(int i=0;i<n;i++){
                System.out.println(x[i]+"\n");
            }
        }


    }
}
/**
 * 编程题4-小码哥有n个无人机，它们位于一个数轴的不同位置上，第i个无人机的位置是xi；，攻击距离ai。
 * 初始情况下，所有的无人机均处于未激活的状态。当一个位于xi的无人机被激活后，该无人机会激活[xi,xi+a）范围内的所有无人机。
 * 小码哥可以任意次数的激活无人机，请你计算最后被激活的无人机的集台有多少种。由于答案可能很大，对998244353取模。
        输入格式：第一行输入一个n，然后n行每行一对xi和ai，以空格隔开。
        数据范围1≤n≤2×10^5，|xi|≤1×10^9，1≤ai≤1×10^9。
        输出格式：输出一个整数
        样例1
        输入：2
             1  5
             3  3
        输出：3
        备注
        样例中被激活的无人机集合有以下三种：，
        {}，{2}，{1,2}。
 * 题目来源：https://matiji.net/exam/dohomework/999/4
 * */
