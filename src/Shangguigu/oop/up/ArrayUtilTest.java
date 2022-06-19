package Shangguigu.oop.up;

public class ArrayUtilTest {
    public static void main(String[] args){
        ArrayUtil util = new ArrayUtil();
        int[] arr = new int[]{32,5,26,74,0,96,14,-98,25};
        int max = util.getMax(arr);
        System.out.println("最大值为:" + max);
        System.out.println("查找:");
        int index = util.getIndex(arr, 5);
        if(index > 0){
            System.out.println("找到了，索引地址:" + index);
        }else{
            System.out.println("没找到");
        }

    }
}
