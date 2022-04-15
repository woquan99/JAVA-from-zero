package FirstCodeJava.Part3;

// P84 范例3-10

class Book{
    private String title;
    private double price;

    public void setTitle(String title){
        this.title = title;
    }
    public void setPrice(double price){
        if(price>0){
        this.price = price;}
    }
    public String getTitle(){
        return title;
    }
    public double getPrice(){
        return price;
    }
    public void getInfo(){
        System.out.println("图书名字："+getTitle()+",价格："+getPrice());
    }
}

public class TestDemo {
    public static void main(String[] args){
        Book bk = new Book();
        bk.setTitle("JAVA 开发");
        bk.setPrice(-99);
        bk.getInfo();
    }
}
