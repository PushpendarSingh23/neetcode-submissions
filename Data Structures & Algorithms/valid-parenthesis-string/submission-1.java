class Solution {
   public boolean checkValidString(String s) {
        int low = 0, high = 0;                     // range of open brackets
        for(char ch : s.toCharArray()){
            if(ch == '('){
                low++; high++;}                     // '(' mila → dono badhenge
            else if(ch == ')'){
                if(low > 0) low--;                 // ek open close kar diya (min case)
                high--;}                            // max case me bhi close hoga
            else{ // '*'
                if(low > 0) low--;                 // '*' ko ')' maan liya (min case)
                high++;}                            // '*' ko '(' maan liya (max case)
            if(high < 0) return false;}             // zyada ')' ho gaye
        return low == 0;}}                           // agar min open 0 hai → valid
    