package FirstCodeJava.Part3;
/**
 * P101 范例3-24
 * 实现一个数组排序功能,从大到小排列
 * 代码要求简单，且方法需要封装
 * */

public class ArrayDemo {
    public static void main(String[] args){
    int[] a = new int[]{1,3,6,2,63,23};
    sort(a);
    print(a);
}

public static void sort(int arr[]){
    int l = arr.length;
    int[] temp = new int[l];
    for(int x=0;x<l;x++){
        for (int y = 0; y<l - 1; y++){
            if (arr[y] < arr[y + 1]) {
                temp[y] = arr[y];
                arr[y] = arr[y + 1];
                arr[y+1]=temp[y];
            }
        }
    }
}
public static void print(int b[]){
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+"、");
        }
        System.out.println();
}
}