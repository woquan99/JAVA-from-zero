package Shangguigu.CommonClass.OtherClass;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * 其他常用类的使用
 * 1.System
 * 2.Math
 * 3.BigInteger 和 BigDecimal
 */
public class OtherClassTest {

    @Test
    public void test1() {
        String javaVersion = System.getProperty("java.version");
        System.out.println("java的version:" + javaVersion);

        String javaHome = System.getProperty("java.home");
        System.out.println("java的home:" + javaHome);

        String osName = System.getProperty("os.name");
        System.out.println("os的name:" + osName);

        String osVersion = System.getProperty("os.version");
        System.out.println("os的version:" + osVersion);

        String userName = System.getProperty("user.name");
        System.out.println("user的name:" + userName);

        String userHome = System.getProperty("user.home");
        System.out.println("user的home:" + userHome);

        String userDir = System.getProperty("user.dir");
        System.out.println("user的dir:" + userDir);

    }

    /**
     * 2.Math
     * abs 绝对值
     * acos,asin,atan,cos,sin,tan 三角函数
     * sqrt 平方根
     * pow(double a,doble b) a的b次幂
     * log 自然对数
     * exp e为底指数
     * max(double a,double b)
     * min(double a,double b)
     * random() 返回0.0到1.0的随机数
     * long round(double a) double型数据a转换为long型（四舍五入）
     * toDegrees(double angrad) 弧度—>角度
     * toRadians(double angdeg) 角度—>弧度
     */
    @Test
    public void test2(){
        int a=5,b=6;
        System.out.println(Math.max(a,b));// 直接输出较大的一个数
    }


    /**
     *  3.BigInteger 和 BigDecimal
     */
    @Test
    public void test3() {
        BigInteger bi = new BigInteger("1243324112234324324325235245346567657653");
        BigDecimal bd = new BigDecimal("12435.351");
        BigDecimal bd2 = new BigDecimal("11");
        System.out.println(bi);
        System.out.println(bd.divide(bd2, BigDecimal.ROUND_HALF_UP));
        System.out.println(bd.divide(bd2, 25, BigDecimal.ROUND_HALF_UP));

    }

}
