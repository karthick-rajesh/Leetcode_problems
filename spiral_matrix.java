import java.util.*;
public class spiral_matrix {
    public List<Integer> spiral(int[][] matrix){
        int right =0;
        int left = matrix[0].length -1;
        int down = 0;
        int top = matrix.length -1;
        List<Integer> res = new ArrayList<>();
        while(right <= left && down <= top){
            for( int i = right ; i <= left; i++ ){
               res.add(matrix[down][i]);
            }
            System.out.println("going right");
            System.out.println(res);
            down++;
            for(int i =down ; i<=top ;i++){
                res.add(matrix[i][left]);
            }
            left--;
             System.out.println("going down");
           System.out.println(res);
           if(down <= top){
            for(int i = left ;i >= right; i--){
                res.add(matrix[top][i]);
            }
            top--;}
             System.out.println("going left");
           System.out.println(res);
           if(right <= left){
            for(int i = top ;i >= down;i--){
                res.add(matrix[i][right]);
            }
            right++;
           }
             System.out.println("going up");
            System.out.println(res);

        }
        return res;
    }
    public static void main(String[] args){
        System.out.println("Spiral Matrix");
        int [][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
       // int [][] matrix = {{3},{4}};
        spiral_matrix obj = new spiral_matrix();
        List<Integer> res = obj.spiral(matrix);
        for(int[] mat :matrix){
            System.out.println(Arrays.toString(mat));
        }
        System.out.println(res);

    }
}
