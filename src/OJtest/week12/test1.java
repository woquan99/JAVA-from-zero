package OJtest.week12;

import java.util.Scanner;

/**
 * https://matiji.net/exam/dohomework/1186/1
 *
 */

public class test1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m= input.nextInt();
        int[] a = new int[m];
        for(int i=0;i<m;i++){
            a[i]=input.nextInt();
        }
        // 输入字符串，但没有限定大小
        String str = input.next();
        //  在 StringBuilder 上的主要操作是 append 和 insert 方法。
        //  每个方法都能有效地将给定的数据转换成字符串，然后将该字符串的字符添加或插入到字符串生成器中。
        StringBuilder sb = new StringBuilder(str);
        for(int i=(m-1);i>=0;i--){
            sb.insert(a[i],"z");
        }
        str = sb.toString();
        System.out.println(str);
        // 输入n个的字符串
//        String[] b = new String[n];
//        for (int i=0;i<b.length;i++){
//            b[i] = input.nextLine();
//        }


    }
}
