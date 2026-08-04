class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0) {return 0;}
        int n = intervals.length;
        int count = 0;
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        int[] curr = intervals[0];
        for(int i=1;i<n;i++){
            if(intervals[i][0] < curr[1]){     
                count++;
                 if (intervals[i][1] < curr[1]) {
                    curr = intervals[i];}
                }
            else{curr = intervals[i];}
        }
        return count;
    }
}
