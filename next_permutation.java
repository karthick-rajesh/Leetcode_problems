// for example 1234 -> 1243
import java.util.*;
public class next_permutation{
    public void reverse(int[] arr , int i ,int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public void next_permu(int[] arr){
        int n = arr.length;
        int j = n-2;
        
            while( j >= 0 && arr[j] > arr[j+1])
            {
                j--;
            }
            if( j <0){
                reverse(arr,0,n-1);
            }
            int k = n-1;
            while( arr[k] <= arr[j]){
               k--;
            }
            int temp = arr[j];
            arr[j]=arr[k];
            arr[k] = temp;
            System.out.println( j);
            reverse(arr,j+1,n-1);
        
    }
    public static void main(String[] args){
        next_permutation obj = new next_permutation();  
              System.out.println("Hello World");
        int[] arr = {1,3,2};
        obj.next_permu(arr);
        System.out.print(Arrays.toString(arr));
    }
}
