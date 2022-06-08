package Shangguigu.grammer;

/**
 * 100以内的所有质数的输出
 * 质数：只能被1和它本身整除的自然数。
 * 最小的质数是：2
 */

public class PrimeNumberTest {
    public static void main(String[] args) {
        // 方法1：
//        boolean isflag = true;// 识别i是否被j除尽，一旦除尽，修改其值
//        for(int i=2;i<=100;i++){
//            for(int j=2;j<i;j++){
//               if(i%j==0)
//                   isflag = false;
//            }
//            if(isflag == true )
//                System.out.println(i);
//            // 记住一定要重置 isflag
//            isflag = true;
//        }


//        // 方法2：
//        for(int i=2;i<=100;i++){
//            boolean isflag = true;// 识别i是否被j除尽，一旦除尽，修改其值
//            for(int j=2;j<i;j++){
//                if(i%j==0)
//                    isflag = false;
//            }
//            if(isflag == true )
//                System.out.println(i);
//        }


        // 质数输出的算法优化
        long start = System.currentTimeMillis();
        for (int i = 2; i <= 100; i++) {
            boolean isflag = true;// 识别i是否被j除尽，一旦除尽，修改其值
//            for (int j = 2; j <= i; j++) {
            for (int j = 2; j <= Math.sqrt(i) ; j++) { // 优化二：改为了开方
                if (i % j == 0) {
                    isflag = false;
                    break;// 优化一:只对本身非质数的有效
                }

            }
            if (isflag == true)
                System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
