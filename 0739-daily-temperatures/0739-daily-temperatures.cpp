class Solution {
public:
    vector<int> dailyTemperatures(vector<int>& temperatures) {
        vector<int> ans(temperatures.size(), 0);  
    stack<int> s1;  

    s1.push(0); 

    for (int i = 1; i < temperatures.size(); i++) {
        if (temperatures[s1.top()] < temperatures[i]) {
          
            while (!s1.empty() && temperatures[s1.top()] < temperatures[i]) {
               
                ans[s1.top()] = i - s1.top();  
                s1.pop();  
            }
        }
        s1.push(i);  
    }

    return ans; 
    }
};