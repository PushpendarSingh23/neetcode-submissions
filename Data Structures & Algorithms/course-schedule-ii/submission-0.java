class Solution{
    public int[] findOrder(int numCourses,int[][] prerequisites){
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<numCourses;i++)
            adj.add(new ArrayList<>());
        int[] indegree=new int[numCourses];
        for(int i=0;i<prerequisites.length;i++){
            int a=prerequisites[i][0],b=prerequisites[i][1];
            adj.get(b).add(a);
            indegree[a]++;}
        Queue<Integer> q=new LinkedList<>();
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0) q.add(i);}
        while(!q.isEmpty()){
            int front=q.remove();
            ans.add(front);
            for(int ele:adj.get(front)){
                indegree[ele]--;
                if(indegree[ele]==0)
                    q.add(ele);}}
        if(ans.size()!=numCourses)
            return new int[0];
        int[] result=new int[ans.size()];
        for(int i=0;i<ans.size();i++)
            result[i]=ans.get(i);
        return result;
    }}