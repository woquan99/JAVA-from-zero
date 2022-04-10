package FirstCodeJava.PartThree;

/**
 * 链表是根据元素节点 逻辑关系 排列起来的一种数据结构
 * 因保存的内容长度不是确定的，可以用来代替数组的使用
 * Node类可包含数据并指向下一个节点
 * */

class Node1 {                            // 每一个链表实际上就是由多个节点组成的
    private String data;                    // 要保存的数据
    private Node1 next;                    // 要保存的下一个节点

    /**
     * 每一个Node类对象都必须保存有相应的数据
     * @param data 要通过节点包装的数据
     */
    public Node1(String data) {                // 必须有数据才有Node
        this.data = data;
    }
    public String getData() {
        return this.data;
    }

    public void setNext(Node1 next) {
        this.next = next;
    }
    public Node1 getNext() {
        return this.next;
    }
}

public class Code116 {
    public static void main(String args[]) {
        // 第一步：定义要操作的节点并设置好包装的字符串数据
        Node1 root = new Node1("火车头") ;				    // 定义节点，同时包装数据
        Node1 n1 = new Node1("车厢A") ;					// 定义节点，同时包装数据
        Node1 n2 = new Node1("车厢B") ;					// 定义节点，同时包装数据
        root.setNext(n1) ;							            // 设置节点关系
        n1.setNext(n2) ;								        // 设置节点关系
        print(root) ;								            // 由根节点开始输出
    }
/**
 * 利用递归方式输出所有的节点数据
 * @param current
 */
public static void print(Node1 current) {				// 第二步：根据节点关系取出所有数据
    if (current == null) { 							    // 递归结束条件
        return; 								        // 结束方法
    }
    System.out.println(current.getData());				// 输出节点包含的数据
    print(current.getNext());						    // 递归操作
}
 }
