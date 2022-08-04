package OJtest.week14;

/**
 * 给定一个字符串。查找既是前缀又是后缀且在中间部分出现的最长子串
 * https://matiji.net/exam/dohomework/1389/2
 */

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        System.out.print(-1);
        // 最大长度
        int max = 0;
        // 起始字符
        Character c = s.charAt(0);
        // 当前数量
        int num = 1;
        // 起始下标
        int start = 0;
        // 最长子串
        String maxStr = s.substring(0, 1);
        // 遍历字符串
        for (int i = 1; i < s.length(); i++) {
            // 当前字符
            char o = s.charAt(i);
            // 判断是否相等
            if (c.equals(o)) {
                // 获取最长重复字符
                if (++num > max) {
                    maxStr = s.substring(start, i + 1);
                }
                // 获取最长重复字符的长度
                max = Math.max(max, num);
            } else {
                c = o;
                num = 1;
                start = i;
            }
        }
        // 不能放过只有一个的情况
        if (num > max) {
            maxStr = s.substring(start);
        }
        max = Math.max(max, num);

    }


    }
}
