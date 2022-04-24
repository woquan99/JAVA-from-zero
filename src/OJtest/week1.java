package OJtest;
import java.util.Scanner;

/**
 * 编程题1-有n步台阶一次只能上1步或2步共有多少种走法
 * https://blog.csdn.net/fallwind_of_july/article/details/94437690
 * */
//class Main{
//    public static int getWalknum(int n){
//        if (n<=2){
//            return n;
//        }
//        return getWalknum(n-1)+getWalknum(n-2);
//    }
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int x = input.nextInt();// 输入字符转化为整型
//        System.out.println(getWalknum(x));
//        input.close();
//    }
//}



/**
 * 编程题2-输入正整数N和M,判断N可以分解为M个不同的正整数之和，输出yes或者no
 * 选择求助了小铭哥，但是还是没太弄明白
 * */
import java.util.ArrayList;
import java.util.List;

class Main {
    static List<List<Integer>>    list = new ArrayList<>();
//      List list = new ArrayList()作用：调用 List接口里面的内置函数,add,get等方法;
//      List< Integer>  List是一个接口； <>表示了List里面放的对象是什么类型的，这样写就表示了，你List里面放的必须是Integer类型的。
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        getResult(n, m, n,1,0, new ArrayList<Integer>());
        if(list.size()>0)
            System.out.println("YES");
        else System.out.println("NO");
    }
    public static void getResult(int n, int m, int sum, int start, int depth, List<Integer> path){
        if(depth==m){
            if(sum==0){
                list.add(new ArrayList<>(path));
            }
            return;
        }
        for(int i=start;i<n;i++){
            if(sum - i>=0){
                sum -= i;
                path.add(i);
                getResult(n,m,sum,i+1,depth+1,path);
                if(list.size()>0)
                    return;
                    path.remove((Integer)i);
                    sum += i;
            }
        }
    }
}



/**
 * 编程题3-输入正整数N,输出比这个数小的最大的回文数
 * https://wenku.baidu.com/view/1c5ec569f4ec4afe04a1b0717fd5360cba1a8d91.html
 * */
//class Main{
//    public static int Judge(int[] s) {
//        int len = s.length;
//        for (int i = 0; i < len / 2; i++) {
//            if (s[i] != s[len-i-1]) {
//                return 0;
//            }
//        }
//        return 1;
//    }
//    public static void main(String[] args) {
//        Scanner input3 = new Scanner(System.in);
//        Long N= input3.nextLong();// 输入字符转化为整型
//
//    }
//}




/**
 * 编程题4-鸽子有N只,鸽洞有M个，求鸽子最多的鸽洞至少有几只鸽子
 * https://matiji.net/exam/dohomework/535/1
 * 竟然被我AC出来了，耐心一点
 * */
//class Main{
//    public static void main(String[] args) {
//        Scanner input4 = new Scanner(System.in);
//        int N1= input4.nextInt();// 输入字符转化为整型
//        Scanner input5 = new Scanner(System.in);
//        int N2= input4.nextInt();// 输入字符转化为整型
//        int x1 = N1/N2;
//        if(N1%N2!=0){
//            x1+=1;
//        }
//        System.out.println(x1);
//    }
//}