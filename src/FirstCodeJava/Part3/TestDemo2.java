package FirstCodeJava.Part3;

// P91 范例3-15

class Emp{
    private String title;
    private double price;

    public Emp(){}; // 无参构造方法
    public Emp(String t, double p){  // 有参构造方法
        title = t;
        price = p;
    }
// 方法一
    public void getInfo(){
        System.out.println("图书名字："+title+",价格："+price);
    }

// 方法二
//    public void setTitle(String title){
//        this.title = title;
//    }
//    public void setPrice(double price){
//        if(price>0){
//            this.price = price;}
//    }
//    public String getTitle(){
//        return title;
//    }
//    public double getPrice(){
//        return price;
//    }
//    public void getInfo(){
//        System.out.println("图书名字："+getTitle()+",价格："+getPrice());
//    }


}

public class TestDemo2 {
    public static void main(String[] args){
        Emp bk = new Emp("JAVA开发",99);
        bk.getInfo();
    }
}
