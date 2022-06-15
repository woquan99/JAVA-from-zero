package Shangguigu.grammer;

public class ArrayExer1 {
    public static void main(String[] args){
        int[][] arr = new int[][]{{3,6,7},{23,6},{8,3,62,35}} ;
        int sum =0;
        for(int i= 0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++)
                sum+=arr[i][j];
        }
        System.out.println(sum);

    }
}
