package OJtest;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * 编程题1-幸运数是波兰数学家乌拉姆命名的。它采用与生成素数类似的“筛法”生成
 * 首先从1开始写出自然数1,2,3,4,5,6,….
 * 1 就是第一个幸运数。
 * 我们从2这个数开始。把所有序号能被2整除的项删除，变为：
 * 1 _ 3 _ 5 _ 7 _ 9 ….
 * 把它们缩紧，重新记序，为：
 * 1 3 5 7 9 …. 。这时，3为第2个幸运数，然后把所有能被3整除的序号位置的数删去。注意，是序号位置，不是那个数本身能否被3整除!! 删除的应该是5，11, 17, …
 * 此时7为第3个幸运数，然后再删去序号位置能被7整除的(19,39,…)
 * 最后剩下的序列类似：
 * 1, 3, 7, 9, 13, 15, 21, 25, 31, 33, 37, 43, 49, 51, 63, 67, 69, 73, 75, 79, …
 * 题目来源：https://matiji.net/exam/dohomework/615/5
 * 题目参考：https://blog.csdn.net/cactus_lrg/article/details/79890015
 * */
//public class week2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        sc.close();
//        // 创建数列1，2,3，，，，n
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        for (int i = 1; i <=n; i++) {
//            list.add(i);
//        }
//
//        int length = 0;
//        int flag = 0;
//        // 去除非幸运数
//        for (int i = 0; i < n ; i++) {
//            length = list.size();
//            flag = 0;
//            if (list.get(i) > length) {
//                break;
//            }
//            if (i == 0) {
//                for (int j = 0; j < length; j++) {
//                    if ((j + 1) % 2 == 0) {
////                        System.out.println(list.get(j - flag));
//                        list.remove(j - flag);
//                        flag++;
//                    }
//                }
//            } else {
//                for (int j = 0; j < length; j++) {
//                    if ((j + 1) % list.get(i) == 0) {
//                        list.remove(j - flag);
//                        flag++;
//                    }
//                }
//            }
//        }
//
//        int x = 0;
//        for (int i = 0, l = list.size(); i < l; i++) {
////            System.out.println(list.get(i));
//            if (list.get(i) == n)
//                x++;
//        }
//        if(x!=0)
//            System.out.println("YES");
//        else
//            System.out.println("NO");
//
//    }
//}

/**
 * 编程题2-输入数字N,编写一个程序，用该数字的所有数字重组成一个最大的数字，不考虑0，负数等情况，输入被视为字符串
 * 题目来源：https://matiji.net/exam/dohomework/615/4
 * 题目参考：https://www.cnblogs.com/wangkongming/p/13061577.html
 * */
//import java.util.Arrays;
//public class week2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String temp = sc.nextLine();
//        int len = temp.length();
//        int[] arr = new int[len];
//        Integer newScores[] = new Integer [len];
//        for(int i=0;i<len;i++) {
//            arr[i]=Integer.parseInt(temp.substring(0,1));
//            newScores[i]=new Integer(arr[i]);
//            temp=temp.substring(1);
//        }
//        Arrays.sort(newScores, Collections.reverseOrder());
//        for(int j=0;j<len;j++) {
//            System.out.print(newScores[j]);
//        }
//    }
//}
/**
 * 编程题3-有一个长为n，宽为m，高为k（层数）的长方体，它可以看成n×m×k个1×1×1大小的单位正方体。每个单位正方体都有一个字符。
 * “.”表示该位置防疫措施不好，如果被传染了就会感染病毒。“#”表示该区人民防疫措施良好，永远不会感染病毒（甚至都不会成为病毒的携带者）。
 * 现在在长方体的最顶层（层号为1）某个位置，因实验室泄露爆发了病毒。每过一个单位时间，病毒将扩散至周围6个方向的地区。
 * 如果某个地区为”#”，那么一定不会被感染并且不会携带病毒同时也不会传播病毒。（但如果这个地方存在泄露的实验室，那么哪怕防疫措施再好也会被感染以及传播病毒）
 * 现在小码哥需要知道，假如第一层坐标为（x,y）的实验室泄露了病毒，那么最多会有多少区域被感染
 * 输入格式：第一行三个正整数k,n,m（k，n，m≤10）接下来k层，每层n行，每行m个字符，
 * 表示长方体每个单位的状态最后一行两个正整数x，y（x≤n,y≤m）表示发生泄漏的实验室的坐标（这个实验室在第一层）
 * 输出格式：按题目要求输出一行一个整数表示答案。
 * 题目来源：https://matiji.net/exam/dohomework/615/3
 * 题目参考：
 * */

//public class week2 {
//    public static void main(String[] args) {
//
//    }
//}

/**
 * 编程题4-如果图G中的一个路径包括每个边怡好一次，则该路径称为欧拉路径（Euler path）输入一个有向图，请你判断这个有向图上是否存在欧拉路径
 * 输入格式：第一行两个整数n和m，表示有n个结点和m条有向边。接下来m行输入m条有向边的信息，每行两个整数a和b，分别表示边的起点和终点的编号（编号为1~m），即该条有向边从a到b
 * 输出格式：输出一个字符串”Yes”或”No”，表示这个有向图上是否存在欧拉路径。
 * 题目来源：https://matiji.net/exam/dohomework/615/2
 * 题目参考：
 * */

import java.util.Iterator;
import java.util.LinkedList;
class EulerCircuit6 {
    private int V; // 顶点数量
    private LinkedList<Integer> adj[];// 邻接表
    private int in[]; // 维护入度

    EulerCircuit6(int v) {
        V = v;
        adj = new LinkedList[v];
        in = new int[V];
        for (int i = 0; i < v; ++i) {
            adj[i] = new LinkedList();
            in[i] = 0;
        }
    }

    void addEdge(int v, int w) {
        adj[v].add(w);
        in[w]++;
    }

    void DFSUtil(int v, Boolean visited[]) {
        // 将当前节点标记为已访问
        visited[v] = true;

        int n;

        // 对与此顶点相邻的所有顶点遍历
        Iterator<Integer> i = adj[v].iterator();
        while (i.hasNext()) {
            n = i.next();
            if (!visited[n])
                DFSUtil(n, visited);
        }
    }

    // 返回此图的反转（或转置）
    EulerCircuit6 getTranspose() {
        EulerCircuit6 g = new EulerCircuit6(V);
        for (int v = 0; v < V; v++) {
            // 对与此顶点相邻的所有顶点遍历
            Iterator<Integer> i = adj[v].listIterator();
            while (i.hasNext()) {
                g.adj[i.next()].add(v);
                (g.in[v])++;
            }
        }
        return g;
    }

    // 如果图是强连接的，则返回true
    Boolean isSC() {
        // Step 1: 将所有顶点标记为未访问（对于第一个DFS）
        Boolean visited[] = new Boolean[V];
        for (int i = 0; i < V; i++)
            visited[i] = false;

        // Step 2: 从第一个顶点开始进行DFS遍历.
        DFSUtil(0, visited);

        // 如果DFS遍历没有访问所有顶点，则返回false.
        for (int i = 0; i < V; i++)
            if (visited[i] == false)
                return false;

        // Step 3: 创建一个反转图
        EulerCircuit6 gr = getTranspose();

        // Step 4: 将所有顶点标记为未访问（对于第二个DFS）
        for (int i = 0; i < V; i++)
            visited[i] = false;

        // Step 5: 从第一个顶点开始对反转图执行DFS.
        // 起始顶点必须与第一个DFS的起始点相同
        gr.DFSUtil(0, visited);

        // 如果在第二个DFS中未访问所有顶点，则返回false
        for (int i = 0; i < V; i++)
            if (visited[i] == false)
                return false;

        return true;
    }

    /*
     * 如果有向图有欧拉回路，则此函数返回true； 否则返回false
     */
    Boolean isEulerianCycle() {
        // 检查是否连接了所有非零度顶点
        if (isSC() == false)
            return false;

        // 检查每个顶点的进出度是否相同
        for (int i = 0; i < V; i++)
            if (adj[i].size() != in[i])
                return false;

        return true;
    }

    public static void main(String[] args) throws java.lang.Exception {
        EulerCircuit6 g = new EulerCircuit6(5);
        g.addEdge(1, 0);
        g.addEdge(0, 2);
        g.addEdge(2, 1);
        g.addEdge(0, 3);
        g.addEdge(3, 4);
        g.addEdge(4, 0);

        if (g.isEulerianCycle())
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

/**
 * 编程题5-https://matiji.net/exam/dohomework/615/1
 * 题目参考：给定三个整数A,B，n，试求满足A+X^n=B的X值（X必须为整数，若无解则输出“No solution”，有多个解则输出最小的解）
 * A和B的绝对值不超过1000，且均不等于0
 * 输入格式：三个数，A,B,n(1<=n<=10)
 * 输出格式：要求输出一行一个整数或者No solution
 * */
//
//public class week2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int A = sc.nextInt();
//        int B = sc.nextInt();
//        int n = sc.nextInt();
//        int res = getResult(A, B, n);
//        if (res == 0) {
//            System.out.println("No solution");
//        } else {
//            System.out.println(res);
//        }
//    }
//    public static int getResult(int A,int B,int n){
//        double i = (double)1/n;
//        double x = 0;
//        if (B-A<0){
//            x = -Math.round(Math.pow((A-B),i));
//        }else{
//            x = Math.round(Math.pow((B-A),i));
//        }
//        if(x!=0 && Math.pow(x,n)==(B-A)){
//            if(n%2==0)return (int)-x;
//            else return (int)x;
//        }
//        return 0;
//    }
//}