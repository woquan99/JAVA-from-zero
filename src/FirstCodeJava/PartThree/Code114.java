package FirstCodeJava.PartThree;
/**
 * 链表是根据元素节点 逻辑关系 排列起来的一种数据结构
 * 因保存的内容长度不是确定的，可以用来代替数组的使用
 * Node类可包含数据并指向下一个节点
 * */
class Node {                            // 每一个链表实际上就是由多个节点组成的
    private String data;                    // 要保存的数据
    private Node next;                    // 要保存的下一个节点

    /**
     * 每一个Node类对象都必须保存有相应的数据
     * @param data 要通过节点包装的数据
     */
    public Node(String data) {                // 必须有数据才有Node
        this.data = data;
    }
    public String getData() {
        return this.data;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    public Node getNext() {
        return this.next;
    }

}

public class Code114 {
    public static void main(String args[]) {
        // 第一步：定义要操作的节点并设置好包装的字符串数据
        Node root = new Node("火车头") ;				// 定义节点，同时包装数据
        Node n1 = new Node("车厢A") ;					// 定义节点，同时包装数据
        Node n2 = new Node("车厢B") ;					// 定义节点，同时包装数据
        root.setNext(n1) ;								    // 设置节点关系
        n1.setNext(n2) ;								    // 设置节点关系
        // 第二步：根据节点关系取出所有数据，使用while循环输出全部节点数据
        Node currentNode = root ;						    // 当前从根节点开始读取
        while (currentNode != null) {						// 当前节点存在数据
            System.out.println(currentNode.getData()) ;
            currentNode = currentNode.getNext() ;			// 将下一个节点设置为当前节点
        }
    }

}
