package OJtest.week14;

/**
 * 最常快乐前缀
 * 给定一个字符串。查找既是前缀又是后缀且在中间部分出现的最长子串
 * https://matiji.net/exam/dohomework/1389/2
 * LeetCode类似题：https://leetcode.cn/problems/longest-happy-prefix/solution/zui-chang-kuai-le-qian-zhui-by-leetcode-solution/
 */

import java.util.Scanner;

public class test2 {

    public static String longestPrefix(String s) {
        int n = s.length();
        long prefix = 0, suffix = 0;
        long base = 31, mod = 1000000007, mul = 1;
        int happy = 0;
        for (int i = 1; i < n; ++i) {
            prefix = (prefix * base + (s.charAt(i - 1) - 'a')) % mod;
            suffix = (suffix + (s.charAt(n - i) - 'a') * mul) % mod;
            if (prefix == suffix) {
                happy = i;
            }
            mul = mul * base % mod;
        }
        if(happy==1){
            return s.substring(1, happy);}
        else if (happy!=0&&happy>1){
            return s.substring(1,happy);
        }
        else {
            return "-1";
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        String s1 = longestPrefix(s);
        System.out.print(s1);

    }
}

