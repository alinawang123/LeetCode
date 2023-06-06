import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Logger;

public class _253_MeetingRoom2 {
    private static final Logger logger = Logger.getLogger(_253_MeetingRoom2.class.toString());
    public static void main(String[] args) {
        long startTimeMillis = System.currentTimeMillis();
        Solution solution = new _253_MeetingRoom2().new Solution();
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

        public int minMeetingRooms(List<Interval> intervals) {
            // Write your code here
            int[] startTime = new int[intervals.size()];
            int[] endTime = new int[intervals.size()];
            for (int i = 0; i < intervals.size(); i++) {
                startTime[i] = intervals.get(i).start;
                endTime[i] = intervals.get(i).end;
            }
            Arrays.sort(startTime);
            Arrays.sort(endTime);
            int rooms = 0;
            int res = 0;
            int i = 0;
            int j =0;
            while(j<intervals.size()){
                while(i <intervals.size() && startTime[i] < endTime[j]) {
                    rooms++;
                    res = Math.max(res, rooms);
                    i++;
                }
                j++;
                rooms--;
            }
            return res;

        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)