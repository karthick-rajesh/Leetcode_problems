import java.util.*;
public class pascal {
    // public int combination(int i, int j){
    //     int n = 
    // }
    // public List<List<Integer>> pascal_triangle(int n){
    //    List<List<Integer>> res = new ArrayList<>();
    //   for(int i =1;i<=n;i++){
    //     List<Integer> temp = new ArrayList<>();
    //     temp.add(1);
    //     for(int j =2;j<i-1;j++){
    //         int x = combination(i,j);
    //         temp.add(x);
    //     }
    //     temp.add(1);
    //   }
    //   return res;
    // } 
    public static  List<List<Integer>> pascal_triangle(int n){
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        temp.add(1);
        result.add(temp);
        for(int i =1 ;i< n;i++){
            List<Integer> temp1 = new ArrayList<>();
            temp1.add(1);
            for(int j =1 ;j<=i-1;j++){
                int a = result.get(i-1).get(j-1) + result.get(i-1).get(j);
                temp1.add(a);
            }
            temp1.add(1);
            result.add(temp1);
        }
        return result;
    }
    public static void main(String[] args){
        System.out.println("Pascal Triangle");
        System.out.println(pascal_triangle(5));
    }
}
