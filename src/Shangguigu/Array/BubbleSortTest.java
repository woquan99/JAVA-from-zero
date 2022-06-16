package Shangguigu.Array;


/**
 * 冒泡排序时间复杂度：O(n^2)
 * 快速排序时间复杂度：O(nlogn)
 * */

public class BubbleSortTest {
    public static void main(String[] args){
        int[] arr = new int[]{34,5,36,4,36,3,346,26,269,7,54,4};
        // 冒泡排序：从小到大输出 (核心：关注两个for里面的循环条件)
        for(int i=0;i<arr.length-1;i++){ // 数组长度-1轮即可
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        // 遍历
        for (int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        // 将排列好的数组反转输出
        for(int i=0;i<arr.length/2;i++){
            int temp1=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp1;
        }
        // 遍历
        for (int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
