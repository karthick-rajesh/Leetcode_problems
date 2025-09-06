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
    public void set_matrix(int[][] matrix){
        int row = matrix.length;
        int col = matrix[0].length;
        Boolean row_flag =false;
        Boolean col_flag = false;
        for( int i=0;i<col;i++){
            if(matrix[0][i] == 0){
                    row_flag = true;
                    break;
            }
        }
        for( int i=0;i<row;i++){
            if(matrix[i][0] == 0){
                    col_flag = true;
                    break;
            }
        }
        for( int i =1;i< row ; i++){
            for(int j = 1;j< col;j++){
                if(matrix[i][j] == 0){
                    matrix[j][0] =0;
                    matrix[0][i]=0;
                }
            }
        }
        for( int i =1;i< row;i++){
            if( matrix[i][0] == 0){
                for(int j =1;j< col ;j++){
                    matrix[i][j] =0;
                }
            }
        }
        for( int i =1;i< col;i++){
            if( matrix[0][i] == 0){
                for(int j =1;j< row ;j++){
                    matrix[i][j] =0;
                }
            }
        }
        if(row_flag){
            for(int i =0 ; i< col ;i++){
                matrix[0][i] =0;
            }
        }
        if(col_flag){
            for(int i =0 ; i< row ;i++){
                matrix[i][0] =0;
            }
        }

    }
    
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