import java.util.*;
public class threesums {
    public static List<List<Integer>> threesum(int[] nums){
        // System.out.println("hey its working");
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        
        Arrays.sort(nums);
       for(int i =0;i<n-2 ;i++){
            if(i>0 && nums[i] == nums[i+1]) continue;
            int j =i+1;
            int k = n-1; 
            while(j<k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                  
                    result.add(temp);
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j - 1]) j++;
                    while (j < k && nums[k] == nums[k + 1]) k--;
                }
                else if(sum> 0){
                    k--;
                }
                else if( sum<0){
                    j++;
                }
            }

            i++;
        }
        return result;
    }
    public static void main(String[] args){
        System.out.println("Its is a threesums problem");
        // Scanner sc = new Scanner(System.in);
        // List<Integer> nums = new ArrayList<>();
        // Boolean bool = true;
        // System.out.println("Enter the values and use -111 as stoping point");
        // while(bool){
        //     int temp = sc.nextInt();
        //     if(temp == -111){
        //        break;
        //     }
        //     nums.add(temp);

        // }
        int[] nums ={1,-2,0,2,1,3,-2,1};
        System.out.println(threesum(nums));

        //System.out.println(nums);

    }
}
