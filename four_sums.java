import java.util.*;

public class four_sums {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int len = nums.length;
        int i =0;
        Arrays.sort(nums);
        while(i<len){
            int j = i+1;
            while(j<len){
                int m = j+1;
                int n =len-1;
                while( m<n){
                    long sum =(long) nums[i]+nums[j]+nums[m]+nums[n];
                    if(sum == target){
                        System.out.println("found a combination");
                        result.add(Arrays.asList(nums[i],nums[j],nums[m],nums[n]));
                         m++;
                        while(m<len && nums[m]==nums[m-1]){
                            m++;
                        }
                        n--;
                        while(n>0 && nums[n]==nums[n+1]){
                            n--;
                        }
                    }
                    else if (sum < target) {
                        m++;
                        while(m<len && nums[m]==nums[m-1]){
                            m++;
                        }
                    }
                    else if (sum > target) {
                        n--;
                        while(n>0 && nums[n]==nums[n+1]){
                            n--;
                        }
                    }
                    
                }
                 j++;
            while(j<len && nums[j]==nums[j-1]){
                j++;
            }
            }
           
            i++;
            while(i<len && nums[i]==nums[i-1]){
                i++;
            }
        }

        return result;
        
    }
    public static void main(String[] args){
        System.out.println("4 sum problem");
        //int[] num ={1,0,-1,0,-2,2};
        int [] nums= {1000000000,1000000000,1000000000,100000000};
        System.out.println(fourSum(nums, -294967296));
        
    }
}
