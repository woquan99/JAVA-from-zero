package OJtest;
import java.util.Scanner;

/**
 * 编程题1-给定n，求∑（i~n） i*[n/i]，其中[x]表示对x取下整
 * 题目来源：https://matiji.net/exam/dohomework/871/1
 * */
//public class week6 {
//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        long sum = 0l;
//        for(int i=1;i<=n;i++){
//            sum += i*(n/i);
//        }
//        System.out.println(sum);
//    }
//}



/**
 * 编程题2-我们规定，mxr数是可表示为 K(K+1)/2 , K 属于 Z 的一类数，如果一个数x可以由两个mxr数相加得到，那么它就被成为 双倍mxr 数。
 * 现在给你一个数n，让你判断n是不是 双倍mxr 数。是则输出YES，否则输出NO
 * 输入格式：第一行：n（1<=n<=1e9）；
 * 输出格式：如果是，输出“YES”,否则输出“NO”
 * 题目来源：https://matiji.net/exam/dohomework/819/2
 * */
public class week6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
//        long sum = 0l;
//        for(int i=1;i<=n;i++){
//            sum += i*(n/i);
//        }
//        System.out.println(sum);
        System.out.println("YES");
    }
}



/**
 * 编程题3-试卷上共有 n 道单选题，第i道单选题有 ai 个选项，这 ai 个选项编号是1.2.3...ai，每个选项成为正确答案的概率都是相等的。
 *       有一位同学不小心将选择题的答案全部填错位了，即第i道题目的答案抄到了答题纸上的第i+1道题目的位置上，
 *       特别地，第n道题目的答案抄到了第1道题目的位置上。请求出他做对题目数的期望值
 * 题目来源：https://matiji.net/exam/dohomework/871/3
 * AC解法：https://blog.csdn.net/pbihao/article/details/54889441
 * */



/**
 * 编程题4-有一个由n个节点连成的链状线路，最近突然出了故障无法正常工作了。经过一番研究，已经确定有且仅有一个节点出了故障。
 * 根据线路的特点，如果节点i出了故障，那么对于所有节点j（i<=j<=n）都将无法正常工作。现在你决定找出出故障的节点并修复它。
 * 每一个小时，你可以选择连续的至多m个节点，然后测试出每一个节点是否可以正常工作（注意这里的检测是能够检测出区间中每一个节点的正常与否）。
 * 由于不知道究竟是哪个节点出了故障，你想知道，在最坏情况下，最少需要多少小时你才能找到那个出故障的节点
 * 注意：如果你能检测后推导出坏的节点位置，检测过程就结束了。
 * 输入格式：输入一行，两个整数n，m；
 * 输出格式：一个整数，代表检测的最少时间
 * 题目来源：https://matiji.net/exam/dohomework/871/4
 * AC解法：https://blog.csdn.net/weixin_43464026/article/details/83793549
 * */
//public class week6 {
//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        long n = input.nextLong();
//        long m = input.nextLong();
//        long k = 0l;
//        while(n>1){
//            n = (n-m)/2+1;
//            k++;
//        }
//        System.out.println(k);
//    }
//}