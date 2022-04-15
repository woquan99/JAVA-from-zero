package FirstCodeJava.Part3;

/**
 * 数据表和简单JAVA类映射
 * 可以根据一个雇员查到他所对应的领导和部门信息；
 * 可以根据部门取出所有的雇员以及每个雇员的领导信息
 */

class Dept86 {
    private int deptno;                       // 部门编号
    private String dname;                     // 部门名称
    private String loc;                       // 部门位置
    private Emp86 emps[];                     // 多个雇员

    public Dept86(int deptno, String dname, String loc) {
        this.deptno = deptno;
        this.dname = dname;
        this.loc = loc;
    }

    public void setEmps(Emp86 emps[]){
        this.emps=emps;
    }
    public Emp86 getEmps()[]{
    // 注意：这里getEmps()后面需要添加[]，表明是对象数组
        return this.emps;
    }

    public String getInfo() {
        return "部门编号：" + this.deptno + "，名称：" + this.dname + "，位置：" + this.loc;
    }
}

class Emp86 {
    private int empno;                      // 雇员编号
    private String ename;                   // 雇员姓名
    private String job;                     // 雇员职位
    private double sal;                     // 基本工资
    private double comm;                    // 佣金
    private Dept86 dept;
    private Emp86 mgr;                      // 表示雇员对应的领导

    public Emp86(int empno, String ename, String job, double sal, double comm) {
        this.empno = empno;
        this.ename = ename;
        this.job = job;
        this.sal = sal;
        this.comm = comm;
    }

    public void setDept(Dept86 dept){
        this.dept=dept;
    }
    public Dept86 getDept(){
        return this.dept;
    }

    public void setMgr(Emp86 mgr){
        this.mgr=mgr;
    }
    public Emp86 getMgr(){
        return this.mgr;
    }

    public String getInfo() {
        return "雇员编号：" + this.empno + "，姓名：" + this.ename + "，职位：" + this.job
                + "，工资：" + this.sal + "，佣金：" + this.comm;
    }
}

public class Code86 {
    public static void main(String[] args) {
        // 第一步：根据表结构描述设置数据
        // 1．产生各自的独立对象
        Dept86 dept = new Dept86(10, "ACCOUNTING", "New York");                     // 部门信息
        Emp86 ea = new Emp86(7369, "SMITH", "CLERK", 800.0, 0.0);        // 雇员信息
        Emp86 eb = new Emp86(7902, "FORD", "MANAGER", 2450.0, 0.0);      // 雇员信息
        Emp86 ec = new Emp86(7839, "KING", "PRESIDENT", 5000.0, 0.0);    // 雇员信息
        // 2．设置雇员和领导关系
        ea.setMgr(eb);                                        // 设置雇员领导
        eb.setMgr(ec);                                        // 设置雇员领导
        // 3．设置雇员和部门关系
        ea.setDept(dept);                                        // 雇员与部门
        eb.setDept(dept);                                        // 雇员与部门
        ec.setDept(dept);                                        // 雇员与部门
        dept.setEmps(new Emp86[]{ea, eb, ec});                        // 部门与雇员
        // 第二步：根据表结构描述取得设置的数据
        System.out.println(ea.getInfo());                            // 取得雇员信息
        System.out.println("\t|- " + ea.getMgr().getInfo());                // 取得雇员领导信息
        System.out.println("\t|- " + ea.getDept().getInfo());                // 取得雇员部门信息
        // 取得部门的完整信息，包括部门基础信息以及部门中的所有员工和每个员工的领导信息
        System.out.println(dept.getInfo());                            // 部门信息
        for (int x = 0; x < dept.getEmps().length; x++) {                // 所有雇员信息
            System.out.println("\t|- " + dept.getEmps()[x].getInfo());        // 雇员信息
            if (dept.getEmps()[x].getMgr() != null) {                    // 判断是否存在领导信息
                System.out.println("\t\t|- " +
                        dept.getEmps()[x].getMgr().getInfo());            // 领导信息
            }
        }
    }
}
