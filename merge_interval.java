import java.util.*;
public class merge_interval {
    public static int[][] merge(int[][] intervals) {
        List<List<Integer>> result = new ArrayList<>();
        int i =0;
        int n = intervals.length;
        for( int [] y: intervals){
            System.out.println(y[0] +" "+y[1]);
        }
        System.out.println("Before sorting");
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        for( int [] y: intervals){
            System.out.println(y[0] +" "+y[1]);
        }
        System.out.println("After Swapping");
        int start = intervals[0][0];
        int last = intervals[0][1];
        while(i<n){
           int l = intervals[i][0];
           int r = intervals[i][1];
           if(last >= l){
                if( r > last){
                    last = r;
                }
           }
           else if( l > last){
            System.out.println("going to add it to list");
            result.add(Arrays.asList(start,last));
            System.out.println(result);
            start = l;
            last = r;
           }
           i++;
        }
        result.add(Arrays.asList(start,last));
        int[][] arr = new int[result.size()][];
        for (int m = 0; m < result.size(); m++) {
            List<Integer> innerList = result.get(m);
            arr[m] = new int[innerList.size()];
            for (int j = 0; j < innerList.size(); j++) {
                arr[m][j] = innerList.get(j);
            }
        }
        for( int [] y: arr){
            System.out.println(y[0] +" "+y[1]);
        }
        return arr;
        //return result;
    }
    public static void main(String[] args){
        System.out.println("Merge Interval");
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        //int[][] intervals = {{4,7},{1,4}};
        int[][] ans = merge(intervals);
        for( int [] y: ans){
            System.out.println(y[0] +" "+y[1]);
        }
        
    }
}
