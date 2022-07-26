package Shangguigu.oop.down;

public class FinalTest1 {

    public static void main(String[] args) {
        Other o = new Other();
        new FinalTest1().addOne(o);
    }

    public void addOne(final Other o) {
        // o = new Other();
        o.i++;
    }
}

class Other {
    public int i;
}

