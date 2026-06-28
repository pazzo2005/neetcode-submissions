/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        int room =0;
        int[]  starts = new int[intervals.size()];
        int[] ends = new int[intervals.size()];
        for(int i =0;i<intervals.size();++i){
            starts[i] = intervals.get(i).start;  
            ends[i] =intervals.get(i).end;
         }
         Arrays.sort(starts);
         Arrays.sort(ends);
         int endptr=0;
         for(int startptr =0;startptr<intervals.size();++startptr){
            if(starts[startptr] < ends[endptr]) {
                room++;
            }else{
                endptr++;
                
            }
         } 
        return room;

    }
}
