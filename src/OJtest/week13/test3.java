package OJtest.week13;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 小码哥有n幅画，每幅画都有一个编号ai；，编号为非负数且可以相同。他想改变一些画的编号，使得n幅画使用的不同编号数量不超过k，
 * 问最少需要改变多少幅画的编号？
 * 这道题借助了哈希表来统计数组中重复数及重复个数，参考了https://blog.csdn.net/qq_37530429/article/details/124034391
 * 1.先计算出数组里面有多少个不一样的元素个数temp，得出需要去掉的(temp-k)组数据
 * 2.统计数组中重复数及重复个数；
 * 3.new一个数组arr1来存储重复个数的数值，并升序排列
 * 4.统计出arr1最小的（temp-k）个元素和
 *
 */
public class test3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int temp = n;
        int num =0;
        int sum =0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        Arrays.sort(arr);// 升序排列
        // 通过下面的循环可以算出数组中有多少个不一样的数
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                temp--;
                continue;
            }
        }
        /**统计数组中重复数及重复个数*/
        Map<Integer,Integer> map = new HashMap<>();
        for (int a:arr){
            // 统计重复数的个数
            map.put(a,map.get(a)==null?1:map.get(a)+1);
        }
//        int[] arr1 = new int[n];// 如果这样创建数组，到时候最小的元素可能很多个0
        int[] arr1 = new int[temp];
        for(int key: map.keySet()){
            // key:value===>key:map.get(key)
            arr1[num]=map.get(key);
            num++;
        }
        Arrays.sort(arr1);
        // 得出要去掉数组里面较小的（temp-k)组数字
        for(int i=0;i<(temp-k);i++){
            sum+=arr1[i];
        }
        System.out.println(sum);
    }
}
