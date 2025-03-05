//
// Created by User on 3/4/2025.
//
#include <iostream>
#include <vector>
#include <stack>
using namespace std;

class ValidParentheses {
public:
    bool isValid(string s) {
        stack<char> chars;

        vector<string> validPairs = {"{}", "[]", "()"};

        for(int i = 0; i < s.length(); i++) {
            char c = s[i];
            if (chars.empty()) {
             chars.push(c);
            } else {
                char d = chars.top();
                string check = string(1, d) + string(1, c);
                if (validPairs.contains(check)) {
                  chars.pop();
                } else {
                  chars.push(c);
                  }

            }

        }
    }
};
