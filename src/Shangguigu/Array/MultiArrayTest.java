package Shangguigu.Array;

/**
 *如果一个一维数组的元素如果还是一个一维数组类型，则此数组A称为二维数组
 */

public class MultiArrayTest {
    public static void main(String[] args) {
        // 1.1 静态初始化
        int[][] arr1 = new int[][]{{1,23},{2,53,3}};
        // 1.2 动态初始化
        int[][] arr2 = new int[2][5];
        String[][] arr3 = new String[4][];
        arr3[1] = new String[4];
        System.out.println(arr3[1][0]);
        // 1.3 获取数组的长度
        System.out.println(arr1.length);
        System.out.println(arr1[0].length);
        // 1.4 如何遍历二维数组
        for(int i= 0;i<arr1.length;i++){
            for (int j= 0;j<arr1[i].length;j++){
                System.out.println(arr1[i][j]+"\t");
            }
            System.out.println();
        }
        // 1.5 数组的内存解析
        /**
         * 针对初始化方式一：int[][] arr = new int[4][3];
         * 外层元素的初始化值为：地址值
         * 内层元素的初始化值为：与一维数组初始化情况相同
         *
         * 针对初始化方式二：int[][] arr = new int[4][];
         * 外层元素的初始化值为：null
         * 内层元素的初始化值为：无法调用，否则报错
         * */
        System.out.println(arr2[0]);// 地址值：[I@119d7047
        System.out.println(arr2[0][0]);// 数值：0
        System.out.println(arr2);// 地址值：[[I@776ec8df
        System.out.println("******************");
        float[][] arr5 = new float[4][];
        System.out.println(arr5[1]);// null
        System.out.println(arr5[1][2]);// 报错，空指针异常，没有指针

    }
}
