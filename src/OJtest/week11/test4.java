package OJtest.week11;

import java.util.Scanner;

/**
 * 题目来源：https://matiji.net/exam/dohomework/1081/4
 * 有n个数，问如果通过每次交换邻项的两个数来使数组中的元素变为升序排列
 * eg：9 8 7 6 5
 * 变为升序：
 * 5 6 7 8 9
 * 需要10次邻项交换
 * 输入格式：第一行输入一个整数n，表示序列长度
 *         第二行输入n个数
 * 输出格式：输出一个整数，表示最少的交换次数
 *
 */

public class test4 {
    public static void main(String[] args){
        int times=0;
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        for(int i=0;i<arr.length-1;i++){ // 数组长度-1轮即可
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    times++;
                }
            }
        }
        System.out.println(times);

    }
}
