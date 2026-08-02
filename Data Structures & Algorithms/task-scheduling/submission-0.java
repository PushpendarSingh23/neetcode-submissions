class Solution {
    public static int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        for(char c : tasks) freq[c - 'A']++;                 // count frequency
        int maxFreq = 0;
        for(int f : freq) maxFreq = Math.max(maxFreq, f);    // find maximum frequency
        int maxCount = 0;
        for(int f : freq) {
            if(f == maxFreq) maxCount++;                     // count maximum frequency tasks
        }
        int partCount = (maxFreq - 1) * (n + 1) + maxCount; // apply formula
        return Math.max(tasks.length, partCount);            // return answer
        // Find the most frequent task.
        // Calculate the minimum required intervals.
    }
}