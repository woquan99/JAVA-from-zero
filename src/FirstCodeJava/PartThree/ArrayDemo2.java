package FirstCodeJava.PartThree;

/**
 * P103 范例3-25
 * 实现一个数组的转置功能
 * 代码要求简单，且方法需要封装
 * */

public class ArrayDemo2 {
    public static void main(String[] args){
        int[] a = new int[]{1,3,6,2,63,23};
        reverse(a);
        print(a);
    }

    public static void reverse(int arr[]){
        int head = 0;
        int tail = arr.length-1;
        int t = arr.length/2;
        for(int i=0;i<t;i++){
            int temp = arr[tail];
            arr[tail]=arr[head];
            arr[head]=temp;
            head++;
            tail--;
        }
    }
    public static void print(int b[]){
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+"、");
        }
        System.out.println();
    }
}