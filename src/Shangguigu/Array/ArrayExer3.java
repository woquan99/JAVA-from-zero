package Shangguigu.Array;

/**
 * 创建一个长度为6的int型数组，要求数组的元素取值为1-30，同时各个元素都不同
 *
 * */

public class ArrayExer3 {
    public static void main(String[] args){
        int[] arr = new int[6];
        for (int i=0;i<arr.length;i++){
            arr[i]=(int)(Math.random()*30)+1;
            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    i--;
                    break;
                }
            }
        }
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");

    }
}
