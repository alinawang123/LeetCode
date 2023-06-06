import java.security.cert.CertPath;
import java.util.*;
import java.util.logging.Logger;
public class _252_MeetingRoom {
    private static final Logger logger = Logger.getLogger(_252_MeetingRoom.class.toString());
    public static void main(String[] args) {
        long startTimeMillis = System.currentTimeMillis();
        Solution solution = new _252_MeetingRoom().new Solution();
//        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
//        System.out.println(solution.canAttendMeetings(intervals));
        logger.warning(String.valueOf(solution));
        logger.info("time cost: [" + (System.currentTimeMillis() - startTimeMillis) + "] ms");
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
        public class Interval {
            int start, end;

            Interval(int start, int end) {
                this.start = start;
                this.end = end;
            }
        }

        public boolean canAttendMeetings(List<Interval> intervals) {
            Collections.sort(intervals, Comparator.comparingInt(a -> a.start));
            for (int i = 1; i < intervals.size(); i++) {
                if (intervals.get(i - 1).end > intervals.get(i).start) return false;
            }
            return true;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)