package Shangguigu.CommonClass;

import java.util.Arrays;
import java.util.Random;

/**
 * 编写一个36选7的彩票程序，并且里面不能有0或重复的数据
 */

public class RandomExer {
    public static void main(String[] args){
        Random rand = new Random();
        int[] data=new int[7];
        int time=0;
        while(time<7){
            int t= rand.nextInt(37);
            if(!isRepeat(data,t)){
                data[time++]=t;
            }
        }
        Arrays.sort(data);
        for(int i=0;i< data.length;i++){
            System.out.print(data[i]+"、");
        }
    }
    public static boolean isRepeat(int temp[],int num){
        if(num==0){
            return true;
        }
        for(int x=0;x< temp.length;x++){
            if(temp[x]==num)
                return true;
        }
        return false;
    }
}
