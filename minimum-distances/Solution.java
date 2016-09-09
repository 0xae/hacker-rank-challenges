import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution 
{
        public static void main(String[] args) 
        {
                Scanner in = new Scanner(System.in);
                int n = in.nextInt();
                int A[] = new int[n];
                for(int A_i=0; A_i < n; A_i++){
                        A[A_i] = in.nextInt();
                }

                final List<Integer> indices = new ArrayList<>();

                for (int i=0; i<A.length; i++)
                {
                        int first = A[i];
                        for (int y=0; y<A.length; y++)
                        {
                                int in_first = A[y];
                                if (i!=y && first == in_first)
                                {
                                        indices.add(Math.abs(i-y));
                                }
                        }
                }

                if (indices.isEmpty())
                        System.out.println("-1");
                else
                        System.out.println(Collections.min(indices));

        }
}
