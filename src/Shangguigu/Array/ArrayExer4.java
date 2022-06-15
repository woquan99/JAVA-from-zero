package Shangguigu.Array;
/**
 * 把arr1初始化为8个素数，2,3,5,7,11,13,17,19
 * 赋值arr2变量变为arr1,修改arr2中的偶索引元素，使其等于索引值（arr[0]=0,arr[2]=2）,打印arr1
 * 思考：arr1和arr2是什么关系？修改题目，实现arr2对arr1数组的复制
 * */
public class ArrayExer4 {
    public static void main(String[] args){
        int[] arr1,arr2;
        arr1 = new int[]{2,3,5,7,11,13,17,19};
        for (int i =0;i<arr1.length;i++){
            System.out.print(arr1[i]+"\t");
        }
        System.out.println();
        arr2 = arr1; // 这里面只是把arr1的地址赋给arr2,不能称作数组的复制
        // 修改arr2中的偶索引元素，使其等于索引值
        for (int i =0;i<arr2.length;i++){
           if(i%2==0)
               arr2[i]=i;
            System.out.print(arr2[i]+"\t");
        }
        System.out.println();
        for (int i =0;i<arr1.length;i++){
            System.out.print(arr1[i]+"\t");
        }
    }
}
