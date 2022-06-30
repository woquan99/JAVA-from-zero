package OJtest.week10;



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