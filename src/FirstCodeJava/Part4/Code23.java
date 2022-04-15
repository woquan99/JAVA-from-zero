package FirstCodeJava.Part4;
/**
 * 定义一个数组操作类，在这个类里面可以进行整型数组的操作
 * 涉及到的代码：P219、P222
 * 覆写了父类中的getData()方法
 * 开发反转类并测试
 * */

class Array1 {                                    // 定义数组操作类
    private int data[];                          // 定义一个数组对象，此数组由外部设置长度
    private int foot;                            // 表示数组的操作脚标

    /**
     * 构造本类对象时需要设置大小，如果设置的长度小于0则维持一个大小
     * @param len 数组开辟时的长度
     */
    public Array1(int len) {
        if (len > 0) {                               // 设置的长度大于0
            this.data = new int[len];                // 开辟一个数组
        } else {                                     // 设置的长度小于等于0
            this.data = new int[1];                  // 维持一个元素的大小
        }
    }

    /**
     * 向数组中增加元素
     * @param num 要增加的数据
     * @return 如果数据增加成功返回true，如果数组中保存数据已满则返回false
     */
    public boolean add(int num) {
        if (this.foot < this.data.length) {        // 有空间保存
            this.data[this.foot++] = num;        // 保存数据，修改脚标
            return true;                        // 保存成功
        }
        return false;                            // 保存失败
    }

    /**
     * 取得所有的数组内容
     * @return 数组对象引用
     */
    public int[] getData() {
        return this.data;
    }
}
class ReverseArray extends Array1 {				// 数组反转类
    public ReverseArray(int len) {					// Array类里面没有无参构造方法
        super(len);									// 调用父类有参构造
    }

    /**
     * 取得反转后的数组数据，在本方法中会将数据进行首尾交换
     * @return 反转后的数据
     * */
    public int[] getData() {
        int center = super.getData().length / 2;		// 计算反转次数
        int head = 0;								    // 头部脚标
        int tail = super.getData().length - 1;		    // 尾部脚标
        for (int x = 0; x < center; x++) {			    // 反转
            int temp = super.getData()[head];		    // 数据交换
            super.getData()[head] = super.getData()[tail];
            super.getData()[tail] = temp;
            head++;
            tail--;
        }
        return super.getData();						    // 返回反转后的数据
    }
}

public class Code23 {
    public static void main(String args[]) {
        ReverseArray arr = new ReverseArray(3);	// 实例化数组操作类对象，可操作数组长度为3
        System.out.print(arr.add(20) + "、");		// 可以保存数据
        System.out.print(arr.add(10) + "、");		// 可以保存数据
        System.out.print(arr.add(30) + "、");		// 可以保存数据
        System.out.println(arr.add(100) + "、");	// 不可以保存数据，返回false
        int[] temp = arr.getData();					// 取得全部数组数据
        for (int x = 0; x < temp.length; x++) {		// 循环输出数据
            System.out.print(temp[x] + "、");
        }
    }

}
