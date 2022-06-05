import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
                 // Write your code here.
	ArrayList<ArrayList<Long>> res=new ArrayList<ArrayList<Long>>();
    ArrayList<Long> nextRow,prevRow=null;
        
    for(int i=0;i<n;i++){
        nextRow=new ArrayList<Long>();
        for(int j=0;j<=i;j++){
            if(j==0 || j==i)
                nextRow.add(1L);
            else
                nextRow.add(prevRow.get(j-1)+prevRow.get(j));
        }
        prevRow=nextRow;
        res.add(nextRow);
    }    
        return res;
    }
}
