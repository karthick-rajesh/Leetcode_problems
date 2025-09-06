import java.util.*;

public class set_matrix_zero{
    // public void set_matrix(int[][] matrix){
    //     List<List<Integer>> master = new ArrayList<>();
    //     int row = matrix.length;
    //     int col = matrix[0].length;
    //     for( int i =0 ;i<row;i++){
    //         for(int j =0;j< col;j++){
    //             if(matrix[i][j] == 0){
    //                 master .add(new ArrayList<>(Arrays.asList(i,j)));
    //             }
    //         }
    //     }
    //     HashSet<Integer> zero_row = new HashSet<>();
    //     HashSet<Integer> zero_col = new  HashSet<>();
    //     for(List<Integer> m : master){
    //         zero_row.add(m.get(0));
    //         zero_col.add(m.get(1));
    //     }
    //     for( Integer k : zero_row ){
    //         for( int x =0;x<col;x++){
    //             matrix[k][x] =0;
    //         }
    //     }
    //      for( Integer k : zero_col ){
    //         for( int x =0;x<row;x++){
    //             matrix[x][k] =0;
    //         }
    //     }

    // }
    public void set_matrix(int[][] matrix){}
    
    public static void main(String[] args){
        System.out.println("This program is to slove set_matrix_zero problem");
        int matrix[][] = {{1,1,1},{1,0,1},{1,1,1}};
        set_matrix_zero obj = new set_matrix_zero();
      
       for( int[] mat : matrix){
        System.out.println(Arrays.toString(mat));}
        System.out.println(" After Modifying");
        obj.set_matrix(matrix);
        for( int[] mat : matrix){
            System.out.println(Arrays.toString(mat));
        }
    }
}