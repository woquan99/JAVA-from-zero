package Shangguigu.oop.up;

/*
 * 4. 对象数组题目：定义类Student，包含三个属性：
 * 学号number(int)，年级state(int)，成绩score(int)。
 * 创建20个学生对象，学号为1到20，年级和成绩都由随机数确定。
 * 问题一：打印出3年级(state值为3）的学生信息。
 * 问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
 * 提示：  1) 生成随机数：Math.random()，返回值类型double;
 * 		  2) 四舍五入取整：Math.round(double d)，返回值类型long。
 *
 */
public class StudentTest {
    public static void main(String[] args) {
        // 声明一个student类型数组
        Student[] stus = new Student[20];

        for(int i=0;i< stus.length;i++){
            // 给数组元素赋值
            stus[i]=new Student();
            // 给student的属性赋值
            stus[i].number=i;
            // 年级【1,6】
            stus[i].state=(int)(Math.random()*(6-1+1)+1);
            // 成绩【0,100】
            stus[i].score=(int)(Math.random()*(100-0+1));
        }
        //遍历学生数组
        for(int i = 0;i < stus.length;i++){
            System.out.println(stus[i].showinfo());
        }

        // 问题一：
        for(int i=0;i< stus.length;i++){
            if(stus[i].state==3)
//                System.out.println(stus[i].number+","+stus[i].state+","+stus[i].score);// 这么一长串太麻烦了，考虑写一个方法
                System.out.println(stus[i].showinfo());
        }

        // 问题二：
        for(int i=0;i< stus.length-1;i++){
            for(int j=0;j< stus.length-1-i;j++){
                if(stus[j].score<stus[j+1].score){
                    //如果需要换序，交换的是数组的元素，Student对象！！！
//                    int temp = stus[j].score;// 这样的写法是错误的！！！！
                    Student temp = stus[j];
                    stus[j]=stus[j+1];
                    stus[j+1]=temp;
                }
            }
        }
        //遍历学生数组
        for(int i = 0;i < stus.length;i++){
            System.out.println(stus[i].showinfo());
        }



    }
}

class Student{
    int number;// 学号
    int state;// 年级
    int score;// 成绩

    public String showinfo(){
        return "学号:" + number + ",年级:" + state + ",成绩:" + score;
    }
}
