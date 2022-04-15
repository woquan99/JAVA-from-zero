package FirstCodeJava.Part3;

/**
 * P158 对象的比较实现
 */
class Book90 {
    private String title ;
    private double price ;
    public Book90(String title,double price) {
        this.title = title ;
        this.price = price ;
    }
    /**
     * 进行本类对象的比较操作，在比较过程中首先会判断传入的对象是否为null，然后判断地址是否相同
     * 如果都不相同则进行对象内容的判断，由于compare()方法接收了本类引用，所以可以直接访问私有属性
     * @param book 要进行判断的数据
     * @return 内存地址相同或者属性完全相同返回true，否则返回false
     */
    public boolean compare(Book90 book) {
        if (book == null) {						// 传入数据为null
            return false ;						// 没有必要进行具体的判断
        }
        // 执行“b1.compare(b2)”代码时会有两个对象
        // 当前对象this（调用方法对象，就是b1引用）
        // 传递的对象book（引用传递，就是b2引用）
        if (this == book) {						// 内存地址相同
            return true ;						// 避免进行具体细节的比较，节约时间
        }

        if (this.title.equals(book.title) && this.price == book.price) {		// 属性判断
            return true ;
        } else {
            return false ;
        }
    }
    // setter、getter略
}
public class Code90 {
    public static void main(String args[]) {
        Book90 b1 = new Book90("Java开发",79.8) ;		// 实例化Book类对象
        Book90 b2 = new Book90("Java开发",79.8) ;		// 实例化Book类对象
        if (b1.compare(b2)) {					// 对象比较
            System.out.println("是同一个对象！") ;
        } else {
            System.out.println("不是同一个对象！") ;
        }
    }
}

