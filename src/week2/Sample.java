package week2;
import java.text.NumberFormat;
import java.time.*;

public class Sample {
    public static void main(String[] args){
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
        NumberFormat percentFormatter = NumberFormat.getPercentInstance();
        double x = 0.1;
        System.out.println(currencyFormatter.format(x)); // prints SO.10
        System.out.println(percentFormatter.format(x)); // prints 10%
        }

    }
