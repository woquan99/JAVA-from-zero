package OJtest;

/**
 * 编程题1-小码哥手里有k张一模一样的星图，每张星图上都有n个点。现给n个点的坐标，
 * 然后请你在纸上用折线将这n个点按给出的顺序连起来，连线速度为50/second，求所用时间。
 * 输入格式：第一行两个正整数：n，k（2≤n≤100,1≤k≤1000）接下来n行，每行两个整数x，y
 * 输出格式：输出一行一个实数，保留1位小数
 * 输入：2  1
 *      0  0
 *     10  0
 * 输出： 0.2
 * 题目来源：https://matiji.net/exam/dohomework/689/1
 * 这里我们可以定义一个类来输入坐标
 *
 * */
import java.util.Scanner;
class week3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        MyPoint[] points = new MyPoint[n];
        for (int i = 0; i < n; i++) {
            points[i] = new MyPoint(input.nextInt(), input.nextInt());
        }

        double distance = 0;
        for (int i =0;i<n-1;i++){
            distance +=Math.pow(Math.pow(Math.abs(points[i].x-points[i+1].x),2)+Math.pow(Math.abs(points[i].y-points[i+1].y),2),0.5);
        }
        System.out.printf("%.1f",(distance*k/50f));//之前的数为整型，需要添加f变为小数
    }
}
class MyPoint{
    public int x;
    public int y;
    public MyPoint(int x,int y){
        this.x = x;
        this.y = y;
    }
}


/**
 * 编程题2-帮忙判断这三根木根能拼出什么三角形。
 *         如果三条线段不能组成一个三角形，输出Not trilangle；
 *         如果是直角三角形，输出Right triangle；
 *         如果是锐角三角形，输出Acute triangle；
 *         如果是钝角三角形，输出Obtuse triangle；
 *         如果是等腰三角形，输出lsosceles triangle；
 *         如果是等边三角形，输出Equilateral triangle。
 *         如果这个三角形满足以上多个条件，请按上述顺序输出，每行一个。
 * 输入格式：输入用空格隔开的三个正整数a、b、c
 * 输出格式：输出若干行，代表了你判断出的结果
 * 得分：满分
 * */
//import java.util.Arrays;
//import java.util.Scanner;
//class Third {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int chang[] = new int[3];
//        for (int i=0;i<3;i++){
//            chang[i] = input.nextInt();
//        }
//        Arrays.sort(chang);
//        if (chang[0]+chang[1]>chang[2]) {
//            if((int)(chang[2]*chang[2]) == (int)(chang[1]*chang[1]) + (int)(chang[0]*chang[0])){
//                    System.out.println("Right triangle");
//            }
//            else if((int)(chang[2]*chang[2]) > (int)(chang[1]*chang[1]) + (int)(chang[0]*chang[0])){
//                    System.out.println("Obtuse triangle");
//            }
//            else if((int)(chang[2]*chang[2]) < (int)(chang[1]*chang[1]) + (int)(chang[0]*chang[0])){
//                    System.out.println("Acute triangle");
//            }
//            if(chang[2] == chang[1] || chang[2] == chang[0] || chang[1] == chang[0]){
//                System.out.println("Isosceles triangle");
//            }
//            if(chang[0] == chang[1] && chang[1]== chang[2]){
//                System.out.println("Equilateral triangle");
//            }
//        }
//        else {
//            System.out.println("Not triangle");
//        }
//    }
//}


/**
 * 编程题3-一个k级的硬币塔从下到上，由1个银币，一个k-1级硬币塔，k个金币，一个k-1级硬币塔，1个银币堆
 * 成。0级硬币塔只有一个金币。问n级硬币塔从下向上数i个有几个金币。
 * 输入格式：一行用空格隔开的两个整数n,i
 * 输出格式：一个整数表示答案
 * 其中0<=n<=40
 * https://matiji.net/exam/dohomework/689/3
 * 答案解析：https://blog.csdn.net/Tisfy/article/details/124420882
 * */
//import java.util.Scanner;
//class Third {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        long n = input.nextInt();
//        long i = input.nextInt();
//        class getNum(long n, long i){
//
//
//        }
//    }
//}


/**
 * 编程题4-求一个N*N模盘中的方块总数。
 * 输入格式：输入整型N（如：2）
 * 输出格式：输出整型（如：5）
 * 得分：满分
 * */
//import java.util.Scanner;
//class Third {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        long N = input.nextInt();
//        long sum =0;
//        if(N==0)
//            System.out.println(0);
//        else {
//        while(N>=1){
//            sum += Math.pow(N,2);
//            N--;
//        }
//        System.out.println(sum);
//        }
//    }
//}


/**
 * 编程题5-https://matiji.net/exam/dohomework/689/5
 * 输入两个整数x和y，计算x的y次方的最后2位数。不考虑负数。
 * 输入格式：输入为整型，空格分隔
 * 输出格式：输出为整型（样例如下）
 * 输入：13  12
 * 输出：81
 * 得分：6，只通过了2/3的样例
 * */
//import java.text.DecimalFormat;
//import java.util.Scanner;
//class week3 {
//    public static void main(String[] args) {
//        Scanner input= new Scanner(System.in);
//        long x =input.nextInt();
//        long y =input.nextInt();
//        long z = 1;
//        for(int i=0;i<y;i++){
//            z = z*x%100;
//        }
//        if (z<10){
//            System.out.println(new DecimalFormat("00").format(z));
//        }
//        else{
//            System.out.println(z);
//        }
//    }
//}
