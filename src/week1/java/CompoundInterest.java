package week1.java;
// book P87

public class CompoundInterest {
    public static void main(String[] args){
final double StartRate = 10;
final int NRate = 6;//利率的数目
final int NYear = 10;//存款年限的长度
// 计算出6个利率
double[] interestRate = new double[NRate];
for(int j=0; j<interestRate.length;j++)
    interestRate[j]=(StartRate+j)/100.0;

double[][] balances = new double[NYear][NRate];
// 第一年初始金额都是10000
for(int j=0;j<balances[0].length;j++)
    balances[0][j]=10000;
// 计算出不同利率不同年份的金额，放入对应数组中
for(int i=1;i<balances.length;i++){
    for(int j=0;j<balances[i].length;j++){
        double oldBalance = balances[i-1][j];
        double interest = oldBalance * interestRate[j];
        balances[i][j] = oldBalance + interest;
        }
    }

for(int j=0;j<interestRate.length;j++)
    System.out.printf("%9.0f%%",100*interestRate[j]);// 9.0f后接两个%表示输出结果的一个%
System.out.println();//这句代码的作用是换行

for (double[] row:balances) {
    // print table row
    for (double b:row)
        System.out.printf("%11.2f",b);
    System.out.println();
}
}
    }
