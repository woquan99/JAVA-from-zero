package FirstCodeJava.Part3;
/**
 * P124 范例3-47
 * 给定一个字符串，判断是否由数字组成（可以应用在输密码的时候进行字符判断）
 * 代码要求简单，且方法需要封装
 * */


public class StringDemo {
    public static void main(String[] args) {
        String str = "1234325352";
        if (isNumber(str)) {
            System.out.println("字符串由数字组成！");
        } else {
            System.out.println("字符串不全由数字组成！");
        }
    }

        public static boolean isNumber(String temp){
            char[] data = temp.toCharArray();
            for (int i = 0; i < data.length; i++) {
                if (data[i] > '9' || data[i] < '0'){
                    return false;
                }
            }
        return true;
    }
}

