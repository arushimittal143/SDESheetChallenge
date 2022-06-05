import java.util.* ;
import java.io.*; 
public class Solution {
    public static void setZeros(int matrix[][]) {
        // Write your code here..
        int R=matrix.length;
        int C=matrix[0].length;
        
        HashSet<Integer> row=new HashSet<>();
        HashSet<Integer> col=new HashSet<>();
        
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                if(matrix[i][j]==0)
                {
                   row.add(i);
                   col.add(j); 
                }
            }
        }
        
         for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
             if(row.contains(i) || col.contains(j))
                 matrix[i][j]=0;
            }
         }
    }

}
