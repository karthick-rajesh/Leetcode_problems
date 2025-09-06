import java.util.*;
public class rotate_matrix {
    public void rotate(int[][] matrix){
        int n = matrix.length;
        //first we are transposing the matrix 
        for( int i =0 ;i< n;i++){
            for(int j =i;j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // reversing the rows to get 90 degree rotate
        for( int i =0;i<n ;i++){
            for(int j =0;j< n/2;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][ n - 1 -j]; 
                 matrix[i][ n - 1 -j]  = temp;
            }
        }
    }
    public static void main(String[] args){
        System.out.println("Rotate Matrix by 90 degree");
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        for(int[] mat : matrix){
            System.out.println(Arrays.toString(mat));
        }
        rotate_matrix obj = new rotate_matrix();
        obj.rotate(matrix);
        System.out.println("After transposing");
        for(int[] mat : matrix){
            System.out.println(Arrays.toString(mat));
        }
    }
}
