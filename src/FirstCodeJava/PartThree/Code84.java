package FirstCodeJava.PartThree;
/**
 * 引用传递的实际应用
 * 涉及到代码链，P151
 * 实例化了人和车，分别在各自类中设置了对象的引用关系，同时，每个人可能有自己的孩子，孩子可能也有车
 * */
class Member{
    private int Id;
    private String name;
    public Member(int Id,String name){
        this.Id=Id;
        this.name=name;
    }

    private Car car;
    public void setCar(Car car){
        this.car =car;
    }
    public Car getCar(){
        return this.car;
    }

    private Member child;
    public void setChild(Member child){
        this.child=child;
    }
    public Member getChild(){
        return this.child;
    }

    public String getInfo() // 别写成了public void getInfo(){}
    {
        return "人员编号"+this.Id+"，姓名"+this.name;
    }
}

class Car{
    private Member member;
    private String pname;
    public Car(String pname){
        this.pname=pname;
    }

    public void setMember(Member member){
        this.member=member;
    }
    public Member member(){
        return this.member;
    }
    public String getInfo() // 别写成了public void getInfo(){}
    {
        return "车的名字"+this.pname;
    }

}

public class Code84 {
    public static void main(String[] args){
        // 设置数据
        Member father=new Member(12318,"李华");
        Member son=new Member(1231,"李晓飞");
        Car a=new Car("宝马王");
        Car b=new Car("宝马");
        // 设置数据关系
        father.setChild(son);
        father.setCar(a);
        a.setMember(father);
        son.setCar(b);
        b.setMember(son);
        // 输出数据关系
        System.out.println(father.getInfo());
        System.out.println(son.getInfo());
        System.out.println(father.getChild().getInfo());
        System.out.println(b.getInfo());
    }
}
