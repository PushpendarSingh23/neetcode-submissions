class Solution {
    public boolean canAttendMeetings(List<Interval> list) {

        list.sort((a, b) -> Integer.compare(a.start, b.start));

        for (int i = 1; i < list.size(); i++) {

            if (list.get(i - 1).end > list.get(i).start) {
                return false;
            }
        }

        return true;
    }
}