package OJtest.week10;
/**
 * 一块区域有N*M个公司，可以直接理解成一个大方格，每个公司在一个小方格中，将每个公司标上了标签。有的写着“R”，代表着股市红光发展很好的公司；
 * 另一种写着“G”，代表股市绿光发展不好的公司。现在想要找到一块矩形框，在框中的所有公司都是标注的“G”，也就是将在矩形中的“冒绿光的统统买进”。
 * 但是这个无法用眼睛直接看出怎么选最能亏钱，于是他委托你进行计算，并将结果交给他的朋友卧龙凤维进行投资管理。
 * 但是他的朋友并没有告诉他将要选择的这几个公司因为他的邀请巴能特吃饭的行为而全部升值。
 * 粘略估计每个投资的公司问以得到的利润是：10（单位：十万元），现在请算算王多鱼可以获得多少的利润？
 *
 * 输入格式：第一行输入两个整数N、M。表示在这块土地上公司N行M列这么多。
 * 接下来N行，每行M个字符，“R”或“G”，用空格隔开，不包括引号。
 * 输出格式：输出一个整数，表示王多鱼能得到多少利润
 * 输入：3 3
 * R R G
 * G G G
 * G G R
 * 输出：40
 *
 * 题解：典型的单调栈问题
 *
 * */


public class test2 {
    public static void main(String args[]) {


    }
}

/** C++解法

#include <iostream>
#include <vector>
#include <stack>

using namespace std;

        int main(){
        int x, y;
        cin >> x >> y;
        vector<vector<char>> vec(x, vector<char>(y));
        for(int i = 0; i < x; i++){
        for(int j = 0; j < y; j++){
        cin >> vec[i][j];
        }
        }
        vector<vector<int>> num(x, vector<int>(y));
        for(int i = 0; i < x; i++){
        for(int j = 0; j < y; j++){
        if(i == 0){
        num[i][j] = (vec[i][j] == 'G') ? 1 : 0;
        }
        else {
        num[i][j] = (vec[i][j] == 'G') ? num[i-1][j] + 1 : 0;
        }
        }
        }
        int res = 0;
        for(int i = 0; i < x; i++){
        stack<int> stk;
        for(int j = 0; j < y; j++){
        while(!stk.empty() && num[i][stk.top()] >= num[i][j]){
        stk.pop();
        }
        int index = stk.empty() ? -1 : stk.top();
        stk.push(j);
        res = max(res, num[i][j] * (j - index));
        }
        }
        cout << res * 10 << std::endl;
        return 0;
        }
 */