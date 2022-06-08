package Shangguigu.grammer;

/**
 * break:结束当前循环(跳出离此关键字最近的一层循环)
 * continue:结束当次循环
 * return:并非专门用于结束循环，是为了
 * */

public class BreakContinueTest {
    public static void main(String[] args){
        // 质数输出的算法优化
        int count = 0;
        long start = System.currentTimeMillis();
        label:for (int i = 2; i <= 100; i++) {
            boolean isflag = true;// 识别i是否被j除尽，一旦除尽，修改其值
            for (int j = 2; j <= Math.sqrt(i) ; j++) { // 优化二：改为了开方
                if (i % j == 0) {
                    continue label;
                }
            }
            count++;
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
