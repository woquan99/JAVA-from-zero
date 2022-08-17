package OJtest.week15;

import java.util.Arrays;
import java.util.Scanner;

public class test1 {

//    // 尝试一：把小数转换成最简分数（只能是有限小数）
//    public static int getGongYueShu(int a, int b) {//求两个数的最大公约数
//        int t = 0;
//        if(a < b){
//            t = a;
//            a = b;
//            b = t;
//        }
//        int c = a % b;
//        if(c == 0){
//            return b;
//        }else{
//            return getGongYueShu(b, c);
//        }
//    }
//    public static void main(String[] args){
//        String[] array2 = new String[2];
//        // 输入
//        Scanner input = new Scanner(System.in);
//        int T = input.nextInt();
//        int[][] arr = new int[T][3];
//        double[][] arr1 = new double[T][2];
//        for(int i=0;i<T;i++){
//            for(int j=0;j<arr[i].length;j++){
//                arr[i][j]=input.nextInt();
//            }
//        }
//        // 由输入值进行计算
//        for(int i=0;i<T;i++){
//            for(int j=0;j<arr1[i].length;j++){
//                arr1[i][j]=3*arr[i][j+1]/Math.sqrt(arr[i][0]);
//                String xiaoshu = Double.toString(arr1[i][j]);
//                array2 = xiaoshu.split("\\.");
//                int a = Integer.parseInt(array2[0]);//获取整数部分
//                int b = Integer.parseInt(array2[1]);//获取小数部分
//                int length = array2[1].length();
//                int FenZi = (int) (a * Math.pow(10, length) + b);
//                int FenMu = (int) Math.pow(10, length);
//                int MaxYueShu = getGongYueShu(FenZi, FenMu);
//                System.out.println(FenZi / MaxYueShu + "/" + FenMu / MaxYueShu);
////                System.out.println(arr1[i][j]);
//
//            }
//        }
//
//    }

    // 尝试二：把分数转化为最简分数
    public static int max(int a,int b) {
        if(a<b) {//否则进行数据交换
            int temp = b;
            b = a;
            a = temp;
        }
        while(b%a!=0) {
            int temp = b%a;
            b = a;
            a = temp;
        }
        return a;//此时a是最大公约数
    }

    public static void main(String[] args) {
        String[] array2 = new String[2];
        // 输入
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        int[][] arr = new int[T][3];
//        double[][] arr1 = new double[T][2];
        String[][] arr1 = new String[T][2];

        for (int i = 0; i < T; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        // 由输入值进行计算
        for (int i = 0; i < T; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                int a = 3 * arr[i][j + 1];//获取分子
//                int b = (int)Math.sqrt(arr[i][0]);//获取分母
                double b = Math.sqrt(arr[i][0]);//获取分母
                if (Math.round(a / b) == (a / b)) {
//                    System.out.println((int)(a/b));
                    arr1[i][j] = Integer.toString((int) (a / b));
                } else {
//                System.out.print(a/max(a,(int)b)+"/"+(int)b/max(a,(int)b));}
                    arr1[i][j] = (a / max(a, (int) b) + "/" + (int) b / max(a, (int) b));
                }
//                System.out.print(arr1[i][j]);
            }
        }

        // 输出数组里面的元素，但是带了[]，而且数组元素用逗号分开了
//        for(int i=0;i<T;i++){
//            System.out.println(Arrays.toString(arr1[i]));
//        }
        // 二维数组逐行输出，每个元素都空一格
        for (int i = 0; i < T; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j]+' ');
            }
            System.out.println();
        }


    }
}
