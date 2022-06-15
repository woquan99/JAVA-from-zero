package Shangguigu.Array;

import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args){
        /**
        // 1.1 静态初始化：数组的初始化和数组元素的赋值操作 同时 进行
        int[] ids = new int[]{1001,1002,1003,1004};
        // 1.2 动态初始化：数组的初始化和数组元素的赋值操作 分开 进行
        String[] names = new String[5];
        // 数组元素的默认初始化值：
        // 1.数组元素是：0；
        // 2.浮点型是：0.0；
        // 3.char型是：0或'\u0000',而非'0';
        // 4.boolean型是：false
        // 5.引用类型（如：String型）是：null
         */

        System.out.println("请输入学生人数：");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println("请输入"+num+"位学生成绩");
        int[] scores = new int[num];
        for(int i=0;i<scores.length;i++){
            scores[i]=input.nextInt();
        }
        // 获取数组中元素的最大值：最高分
        int maxscore = 0;
        for (int i=0;i<scores.length;i++){
            if(maxscore<scores[i])
                maxscore = scores[i];
        }

        // 根据每个学生成绩与最高分的差值，得到每个学生的等级，并输出等级和成绩
        char level;
        for (int i=0;i<scores.length;i++){
            if(maxscore - scores[i]<=10){
                level = 'A';
            }
            else if(maxscore - scores[i]<=20){
                level = 'B';
            }
            else if(maxscore - scores[i]<=30){
                level = 'C';
            }
            else{
                level = 'D';
            }
            System.out.println("student"+i+"成绩为"+scores[i]+",等级评定为"+level);
        }

        }
}
