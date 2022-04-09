package FirstCodeJava.PartThree;

/**
 * P143
 * 利用构造方法相互调用代码，简化代码
 * */
class Emp75{
    private int empno;
    private String ename;
    private String dept;
    private double sal;
    public Emp75(){
        this(0,"无名氏",0.0,"未定");
    }
    public Emp75(int empno){
        this(empno,"临时工",800.0,"后勤部");
    }
    public Emp75(int empno,String ename){
        this(empno,ename,2000.0,"技术部");
    }
    public Emp75(int empno,String ename,double sal,String dept){
        this.empno=empno;
        this.ename=ename;
        this.sal=sal;
        this.dept=dept;
    }
    public String getInfo(){
        return "雇员编号"+this.empno+"，姓名"+this.ename+",薪资"+this.sal+",部门"+this.dept;
    }
}

public class Code75 {
    public static void main(String[] args){
        Emp75 ea=new Emp75();
        Emp75 eb=new Emp75(7369);
        Emp75 ec=new Emp75(7368,"King",5000,"财务部");
        System.out.println(ea.getInfo());
        System.out.println(eb.getInfo());
        System.out.println(ec.getInfo());

    }

}
