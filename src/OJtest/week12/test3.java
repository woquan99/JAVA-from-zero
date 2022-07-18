package OJtest.week12;

import java.util.Scanner;

/**
 * https://matiji.net/exam/dohomework/1186/3
 * 给出n个规定单词，单词长度小于10，给出m行单词，从m行中截取任意行数的连续行数最小。要求包含规定单词种类数最多，并且连续行数最小。输出最小行数。
 */

public class test3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String[] a = new String[n];
        for(int i=0;i<a.length;i++){
            a[i] = input.next();
        }
        int m = input.nextInt();
        String[] b = new String[m];
        for(int j=0;j<b.length;j++){
            b[j] = input.next();
        }

        System.out.println(m);

    }
}
