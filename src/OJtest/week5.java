package OJtest;

/**
 * 编程题1-给定n，求∑（i-n）【n/i】，其中【x】表示对x取下整
 * 题目来源：https://matiji.net/exam/dohomework/819/1
 * */
import java.util.Scanner;
class week5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        long sum = 0l;
        // 暴力算会超时，把复杂度降到根号n即可
        for (int i = 1,j = 1; i <= n; i = j+1) {
            j = n/(n/i);
            sum += (j-i+1)*(n/i);
        }
        System.out.println(sum);
//        // 方法二，因为n取值时间是小于1000000000，所以理论上对半分后时间缩短至一半
//        // 但是，假如取值为999999999的话，方法二和方法一的结果不一样（错在哪里呢？？？）
//        // 错误的原因：n在50000000的取值前后不一样了
//        if (n <= 750000000) {
//            for (int i = 1; i <= n; i++) {
//                sum += n / i;
//            }
//            System.out.println(sum);
//        }
//        else {
//            for (int k = 750000001; k <= n; k++) {
//                sum1 += n / k;
//            }
//            System.out.println(sum1);
//        }
    }
}

/**
 * 编程题2-假设一次普通攻击正常情况下造成100伤害，有r%的概率被闪避，在被击中的的概率下有p%的概率产生暴击，暴击造成q倍伤害，请你计算出每次普通攻击造成的伤害的期望
 * 输入格式：第一行一个整数T，表示数据组数。
 * 对于每组数据，有3个浮点数，分别表示p，q，r
 * 输出格式：对于每组数据，输出一个保留两位的小数数表示答案。
 * 样例1
 * 输入：3
 * 10 3 10
 * 20 5 0
 * 100 2 100
 * 输出：108.00
 * 180.00
 * 0.00
 * 题目来源：https://matiji.net/exam/dohomework/819/2
 * */
//import java.util.Scanner;
//class week5 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        MyPoint1[] points = new MyPoint1[n];
//        for (int i = 0; i < n; i++) {
//            points[i] = new MyPoint1(input.nextInt(), input.nextInt(),input.nextInt());
//        }
//
//        double sum = 0;
//        for (int i =0;i<n;i++){
//            sum = (1-points[i].z/100f)*(100-points[i].x+points[i].x*points[i].y);
//            System.out.printf("%.2f",sum);//之前的数为整型，需要添加f变为小数
//            System.out.println();// 输出换行
//        }
//    }
//}
//class MyPoint1{
//    public int x;
//    public int y;
//    public int z;
//    public MyPoint1(int x,int y,int z){
//        this.x = x;
//        this.y = y;
//        this.z = z;
//    }
//}



/**
 * 编程题3-
 * 输入格式：第一行两个整数t，k；t为任务数，k为组员数,第二行t个整数，第个整数表示完成第个任务所需的时间
 * 输出格式：输出K行，每行两个整数，第i行的两个数分别表示第个组员负责的任务的起始编号和结束编号，输出按照起始编号从小到大排序（如果第1个人没任务则第行输出0 0）
 * 输入： 5 4
 *      2 3 2 2 6
 * 输出：
 * 0 0
 * 1 2
 * 3 4
 * 5 5
 * 题目来源：https://matiji.net/exam/dohomework/819/3
 * */
//import java.util.Scanner;
//class week5 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int t = input.nextInt();
//        int k = input.nextInt();
//        MyPoint2[] points = new MyPoint2[t];
//        for (int i = 0; i < t; i++) {
//            points[i] = new MyPoint2(input.nextInt());
//        }
//
//        double sum = 0;
//        for (int i =0;i<n;i++){
//            sum = (1-points[i].z/100f)*(100-points[i].x+points[i].x*points[i].y);
//            System.out.printf("%.2f",sum);//之前的数为整型，需要添加f变为小数
//            System.out.println();// 输出换行
//        }
//    }
//}
//class MyPoint2{
//    public int x;
//    public MyPoint2(int x){
//        this.x = x;
//    }
//}


/**
 * 编程题4-砝码称重
 * 现有n个祛码，重量分别为ai，在去掉m个祛码后，问最多能称量出多少不同的重量（不包括0）。请注意，砝码只能放在天平的其中一边。
 * 输入格式：第1行有两个整数n和m，用空格分隔。
 * 第2行有n个正整数a1.a2.a3.，an，表示每个砖码的重量。
 * 输出格式：仅包括1个整数，为最多能称量出的重量数量
 * 输入：3
 *      1 2 2
 * 输出：3
 * 题目来源：https://matiji.net/exam/dohomework/819/4
 * AC（C++）解法：https://blog.csdn.net/weixin_43502713/article/details/106491513
 * */


