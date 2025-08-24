import java.util.*;
import java.util.Arrays;
public class q27 {
    public static void main(String[] args) {
        int[][] integers = getArray();
        printArrays(integers);
    }
    public static int getArray(){
        return new int[][] {{1,2,3},{4,5,6},{7,8,9}};
    }
    public static void printArrays(int[][] integers) {
        for(int i = 0;i<3;i++)
        {
            for(int j =0;j<3;j++)
            {
                System.out.println(integers[i][j]);
            }
            System.out.println();
        }
        
    }
    
}
