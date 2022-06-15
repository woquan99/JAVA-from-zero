package Shangguigu.Array;

/**
 * 定义一个int型的一维数组，包含10个元素，分别赋一些随机整数，
 * 求出所有元素的最大值、最小值、总和、平均数
 * 要求：所有随机数都是两位数
 * */

public class ArrayTest1 {
    public static void main(String[] args){
        int[] arr = new int[10];
        for (int i=0;i<arr.length;i++){
            arr[i] = (int)(Math.random()*90+10);// [10,99]
        }
        // 遍历
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();

        // 1.1求数组的最大值
        int maxValue = 0;
        for (int i=0;i<arr.length;i++){
            if(maxValue<arr[i])
                maxValue=arr[i];
        }
        System.out.println("最大值为："+maxValue);
        // 1.2求数组的最小值
        int minValue = arr[0];// 这里有问题，不能定义一个0；应该去第一个元素作为基准
        for (int i=1;i<arr.length;i++){
            if(minValue>arr[i])
                minValue=arr[i];
        }
        System.out.println("最小值为："+minValue);
        // 1.3求数组的总和
        int sum = 0;
        for (int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        System.out.println("总和为："+sum);
    }
}
