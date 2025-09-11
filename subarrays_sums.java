import java.util.*;
public class subarrays_sums {
    public int subarry(int[] nums, int k){
        int prefix_sum = 0;
        int count =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map .put(0,1);
        for(int num : nums){
            prefix_sum += num;
            int a = prefix_sum -k;
            if(map.containsKey(a)){
                count += map.get(a);
            }
            if(map.containsKey(prefix_sum)){
                map.put(prefix_sum,(map.get(prefix_sum)+1));
            }
            map.put(prefix_sum,1);
        }
        //  int n = nums.length;
        //  int i=0;
        // int j=0;
        // while(j<n){
        //     sum = sum+ nums[j++];
            
            
        //     // if(j<n){
        //     // sum = sum+ nums[j++];
        //     // }
        //     while( sum>k && i<j){
                
        //         sum -= nums[i++];
        //         System.out.println(i + "before "+ j);
        //     }
        //     System.out.println(i+" i "+j+" j "+sum+" sum ");
        //     if(sum == k ){
                
        //         count++;
        //         System.out.println(count +" subarray finded");
        //     }
        // }
        return count;
        
    }
    public static void main(String[] args){
        subarrays_sums obj = new subarrays_sums();
        int[] nums = {1,1,1};
        int count = obj.subarry(nums, 2);
        System.out.println(count);
    }
}
