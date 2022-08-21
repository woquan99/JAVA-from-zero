package OJtest.week15;

import java.util.Scanner;

/**
 * https://matiji.net/exam/dohomework/1484/5
 * 对于每组测试，给定A0个数字0，A1个数字1，A2个数字2...A9个数字9，问不能由这些数字组成的最小正整数是多少
 *
 * 能够组成的最小的数的解题思路：https://blog.csdn.net/qq_43765564/article/details/103171877
 * 1.首先要明确输入的不是数字，而是对应的数字的个数。（第一个2对应有两个0，第二个2对应两个1）
 * 2.首先遍历输入的数字个数，记录下总的数字个数，创建相应大小的数组。
 * 3.再次遍历输入的数字个数，如果输入的数字个数不为0，那么就在数组中添加对应的数字的个数。
 * 注意：这时候数组是有序的，所以不需要对数组进行排序处理。
 * 4.遍历数组，找到第一个不为0的下标，与第0个元素交换。
 * 5.输出数组
 */

public class test5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int index = 0;
        int count = 0;
        int[][] arr = new int[t][10];
        int[] arr1 = new int[t];
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = input.nextInt();
                if(arr[i][j]!=0) {
                    arr1[i] +=arr[i][j];
                }
            }
        }

//        int[][] array = new int[t][];
//        for (int i = 0; i < t; i++) {
//            array[i]
//        }
//        for(int i = 0;i<a.length;i++){
//            for(int j = 1;j <= Integer.parseInt(a[i]);j++){
//                array[index++] = i;
//            }
//        }
//        for(int i = 0;i<count;i++){
//            if(array[i] != 0){
//                int tmp = array[i];
//                array[i] = array[0];
//                array[0] = tmp;
//                break;
//            }
//        }
//
//        for(int j = 0;j<count;j++){
//            System.out.print(array[j]);
//        }




    }
}
