class Solution{
    public int[] dailyTemperatures(int[] temperatures){
        int n=temperatures.length;
        int[] ans=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty()
                  &&temperatures[st.peek()]<=temperatures[i])
                st.pop();                        //Remove cooler/equal days
            if(!st.isEmpty())
                ans[i]=st.peek()-i;             //Days until warmer
            st.push(i);                         //Store current index
        }
        return ans;
    }
}